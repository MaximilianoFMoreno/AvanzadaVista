package edu.usal.vista.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import edu.usal.controlador.swing.MenuCliente_Controler;
import usal.edu.ar.controller.MenuClienteController;
import usal.edu.ar.eventos.EventosMClientes;

public class MenuCliente_Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private MenuCliente_Controler mcc;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmNuevoCliente;
	private JMenuItem mntmNewMenuItem;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnEliminar;
	private JButton btnMostarMasDatos;
	private JButton btnModificar;
	private JTextField txtfieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDni;
	private JLabel lblApellido ;
	private JLabel lblNombre;
	private JLabel lblDni;
	private JButton btnBuscar;
	private JButton btnRegresar;
	private ListSelectionModel listSelectionModel;
	private JButton btnLimpiarBusqueda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCliente_Vista frame = new MenuCliente_Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuCliente_Vista(MenuCliente_Controler mcc) {
		this.mcc=mcc;
		setBounds(100, 100, 700, 720);
		setLocationRelativeTo(null);
		setTitle("Aerolinea");
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 684, 21);
		menuBar.setBackground(Color.LIGHT_GRAY);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setForeground(new Color(0, 0, 0));
		menuBar.add(mnArchivo);
		
		mntmNuevoCliente = new JMenuItem("Nuevo Cliente");
		mntmNuevoCliente.addActionListener(new EventosMClientes(this));
		mnArchivo.add(mntmNuevoCliente);
		
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new EventosMClientes(this));
		mnArchivo.add(mntmNewMenuItem);
		
		JPanel panelBuscador = new JPanel();
		panelBuscador.setBounds(0, 21, 684, 88);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 109, 684, 480);
		getContentPane().setLayout(null);
		getContentPane().add(menuBar);
		getContentPane().add(panelBuscador);
		panelBuscador.setLayout(null);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 11, 72, 14);
		panelBuscador.add(lblNombre);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 36, 72, 14);
		panelBuscador.add(lblApellido);
		
		txtfieldNombre = new JTextField();
		txtfieldNombre.setBounds(111, 8, 86, 20);
		panelBuscador.add(txtfieldNombre);
		txtfieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(111, 33, 86, 20);
		panelBuscador.add(textFieldApellido);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(218, 11, 46, 14);
		panelBuscador.add(lblDni);
		
		textFieldDni = new JTextField();
		textFieldDni.setColumns(10);
		textFieldDni.setBounds(274, 8, 86, 20);
		panelBuscador.add(textFieldDni);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(512, 32, 89, 23);
		panelBuscador.add(btnBuscar);
		btnBuscar.addActionListener(new EventosMClientes(this));
		getContentPane().add(scrollPane);
		

		btnLimpiarBusqueda = new JButton("Limpiar Busqueda");
		btnLimpiarBusqueda.setBounds(274, 54, 149, 23);
		panelBuscador.add(btnLimpiarBusqueda);
		btnLimpiarBusqueda.addActionListener(new EventosMClientes(this));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre y apellido", "DNI", "Cuil/Cuit", "Fecha de Nacimiento", "E-mail"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(55);
		table.getColumnModel().getColumn(1).setPreferredWidth(55);
		table.getColumnModel().getColumn(2).setPreferredWidth(55);
		table.getColumnModel().getColumn(4).setPreferredWidth(127);
		scrollPane.setViewportView(table);
		table=mcc.CargarTable(table);
		listSelectionModel=table.getSelectionModel();
		listSelectionModel.addListSelectionListener(new EventosMClientes(this));
		
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(10, 625, 89, 23);
		btnRegresar.addActionListener(new EventosMClientes(this));
		getContentPane().add(btnRegresar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(468, 600, 89, 23);
		btnModificar.setEnabled(false);
		btnModificar.addActionListener(new EventosMClientes(this));
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(585, 600, 89, 23);
		btnEliminar.setEnabled(false);
		btnEliminar.addActionListener(new EventosMClientes(this));
		getContentPane().add(btnEliminar);
		
		btnMostarMasDatos = new JButton("Mostar mas Datos");
		btnMostarMasDatos.setBounds(534, 647, 140, 23);
		btnMostarMasDatos.setEnabled(false);
		btnMostarMasDatos.addActionListener(new EventosMClientes(this));
		getContentPane().add(btnMostarMasDatos);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	public MenuCliente_Controler getMcc() {
		return mcc;
	}


	public void setMcc(MenuCliente_Controler mcc) {
		this.mcc = mcc;
	}
	
	
	
	public JButton getBtnLimpiarBusqueda() {
		return btnLimpiarBusqueda;
	}


	public void setBtnLimpiarBusqueda(JButton btnLimpiarBusqueda) {
		this.btnLimpiarBusqueda = btnLimpiarBusqueda;
	}


	public JTextField getTxtfieldNombre() {
		return txtfieldNombre;
	}


	public void setTxtfieldNombre(JTextField txtfieldNombre) {
		this.txtfieldNombre = txtfieldNombre;
	}


	public JTextField getTextFieldApellido() {
		return textFieldApellido;
	}


	public void setTextFieldApellido(JTextField textFieldApellido) {
		this.textFieldApellido = textFieldApellido;
	}


	public JTextField getTextFieldDni() {
		return textFieldDni;
	}


	public void setTextFieldDni(JTextField textFieldDni) {
		this.textFieldDni = textFieldDni;
	}




	public ListSelectionModel getListSelectionModel() {
		return listSelectionModel;
	}


	public void setListSelectionModel(ListSelectionModel listSelectionModel) {
		this.listSelectionModel = listSelectionModel;
	}


	public JMenuItem getMntmNewMenuItem() {
		return mntmNewMenuItem;
	}


	public void setMntmNewMenuItem(JMenuItem mntmNewMenuItem) {
		this.mntmNewMenuItem = mntmNewMenuItem;
	}


	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public JMenuItem getMntmNuevoCliente() {
		return mntmNuevoCliente;
	}

	public void setMntmNuevoCliente(JMenuItem mntmNuevoCliente) {
		this.mntmNuevoCliente = mntmNuevoCliente;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnMostarMasDatos() {
		return btnMostarMasDatos;
	}

	public void setBtnMostarMasDatos(JButton btnMostarMasDatos) {
		this.btnMostarMasDatos = btnMostarMasDatos;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

}
