package edu.usal.controlador.swing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.usal.ImplJDBC.ClienteDAOImplSQLStatement;
import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.interfaces.PaisDAO;
import edu.usal.dao.negocio.Pais;
import edu.usal.dao.negocio.Pasaporte;
import edu.usal.factory.FactoryCliente;
import edu.usal.factory.FactoryGeneralJDBC;
import edu.usal.util.ValidarDatos;
import edu.usal.vista.swing.MenuClienteAlta_Vista;
import edu.usal.vista.swing.MenuCliente_Vista;






public class MenuCliente_Controler {
	
	MenuCliente_Vista menu;
	MenuClienteAlta_Vista vistaAlta;
	MenuPrincipal_Controler mpc;
	private ClienteDAO cDAO; 
	private List<edu.usal.dao.negocio.Cliente> clientes;
	private edu.usal.dao.negocio.Cliente cl; 
	
	
	public MenuCliente_Controler(MenuPrincipal_Controler mpc) {
		this.mpc=mpc;
		menu= new MenuCliente_Vista(this);
	}
	
	public MenuCliente_Controler() {
		
	}
	
	public JTable CargarTable(JTable table) throws IOException, ClassNotFoundException, SQLException {
		int numCols=table.getModel().getColumnCount();
		Object [] fila= new Object[numCols];
		cDAO = FactoryCliente.GetImplementacion("sql");
		try {
			clientes= cDAO.leerTodoCliente();
			for(edu.usal.dao.negocio.Cliente cl: clientes) {
				fila[0]=cl.getNombreCliente()+" "+cl.getApellidoCliente();
				fila[1]=cl.getDni();
				fila[2]=cl.getCuit();
				fila[3]=cl.getFechaNacimiento();
				fila[4]=cl.getMail();
				((DefaultTableModel) table.getModel()).addRow(fila);
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los clientes"+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los clientes"+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return table;
		
	}
	
	
	public void AltaCliente() {
		menu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		menu.getBtnRegresar().setEnabled(false);
		menu.getBtnModificar().setEnabled(false);
		menu.getBtnEliminar().setEnabled(false);
		vistaAlta= new MenuClienteAlta_Vista(this);
		
	}
	
	
public void Guarda(MenuClienteAlta_Vista cliente) {
		
		if(this.guardados(cliente)) {
			vistaAlta.setVisible(false);
			JOptionPane.showMessageDialog(null,"Se agrego Cliente con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
			menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.limpiarTable(menu.getTable());
			CargarTable(menu.getTable());
		}else {
			JOptionPane.showMessageDialog(null,"No se pudo agregar", "Error", JOptionPane.INFORMATION_MESSAGE);

		}
		
	}
	
	
	private boolean guardados(MenuClienteAlta_Vista cliente) {
	
	cl = new edu.usal.dao.negocio.Cliente();
	if(ValidarDatos.String(cliente.getTextFieldNombre().getText(),cliente.getLblNewLabel_2()))
		cl.setNombreCliente(cliente.getTextFieldNombre().getText());
	if(ValidarDatos.String(cliente.getTextFieldApellido().getText(),cliente.getLabelApe()))
		cl.setApellidoCliente(cliente.getTextFieldApellido().getText());	
	if(ValidarDatos.DNI(cliente.getTextFieldDNI().getText(),cliente.getLabelDNI()))
	cl.setDni(cliente.getTextFieldDNI().getText());
	if(ValidarDatos.CUIT(cliente.getTextFieldCuilCuit().getText(), cliente.getLabelCUIT()))
		cl.setCuit(cliente.getTextFieldCuilCuit().getText());
	if(ValidarDatos.email(cliente.getTextFieldEmail().getText(),cliente.getLabelEmail()))
		cl.setMail(cliente.getTextFieldEmail().getText());
	if(ValidarDatos.validarFecha(cliente.getTextFieldFN().getText(), cliente.getLabelNacimiento()))
		cl.setFechaNacimiento(cliente.getTextFieldFN().getText());
	
	cl.setPasaporte(obtenerPasaporte(cliente));
	cl.setDireccion(obtenerDireccion(cliente));
	cl.setPasajeroFrecuente(obetnerPasajero(cliente));
	cl.setTelefono(obetenerTelefono(cliente));
	
	if(!this.clienteCompleto(cl)) {
		return false;
	}
	cDAO=ClienteFactory.getClienteDAO("sql");
	try {
		if(cDAO.addCliente(cl)) {
			return true;
		}else {
			return false;
		}
	} catch (FileNotFoundException e) {
		JOptionPane.showMessageDialog(null,"Error al guardar: "+e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

	} catch (IOException e) {
		JOptionPane.showMessageDialog(null,"Error al guardar: "+e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Error al guardar: "+e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

	}
	return false;
}
	
	private Pasaporte obtenerPasaporte(MenuClienteAlta_Vista cliente) {
		Pasaporte p= new Pasaporte();
		if(ValidarDatos.validarInt(cliente.getTextFieldNumeroPasaporte().getText(),cliente.getLabelNumero()))
			p.setNrodePasaporte(cliente.getTextFieldNumeroPasaporte().getText());
		p.setAutoridadEmision(cliente.getTextFieldEmision().getText());
			p.setFechadeEmision(cliente.getTextFieldFEmision().getText());
			p.setFechadeVencimiento(cliente.getTextFieldFVencimiento().getText());
		if(ValidarDatos.validarPais(cliente.getComboBoxPais().getSelectedIndex(), cliente.getLabelPaisPasaporte()))
			p.setPais((cliente.getComboBoxPais().getSelectedIndex()));
		if(p.getEmision()==null || p.getNroPasaporte()==null || p.getVencimiento()==null || p.getPais()==0) {
			return null;
		}		
		return p;
	}
	
	
	public JComboBox<String> cargarPaises(JComboBox<String> comboBoxPais) throws IOException {
		PaisDAO pDAO= FactoryGeneralJDBC.GetPaisImplementacion("sql");
		List<Pais> paises=pDAO.listadodePaises();
		for (Pais pais : paises) {
			String pais2 = pais.getNombrePais(); 
			comboBoxPais.addItem(pais2);
		}
		/*
		for(int i=0; i<paises.size(); i++) {
			String pais=paises.add(i);
			comboBoxPais.addItem(paises.add());
		}
		*/
		
		return comboBoxPais;
	}
	
	
	
	
	
	

}
