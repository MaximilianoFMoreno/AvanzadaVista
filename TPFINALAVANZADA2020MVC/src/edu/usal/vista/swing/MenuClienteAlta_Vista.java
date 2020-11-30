package edu.usal.vista.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import edu.usal.controlador.swing.MenuCliente_Controler;
/*
import com.toedter.calendar.JDateChooser;

import usal.edu.ar.controller.MenuClienteController;
import usal.edu.ar.eventos.MenuAltaCLiente;
import usal.edu.ar.vista.LineaAerea;
*/
public class MenuClienteAlta_Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private MenuCliente_Controler mcc;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDNI;
	private JTextField textFieldCuilCuit;
	private JTextField textFieldEmail;
	private JButton btnAgregar;
	private JTextField textFieldNumeroPasaporte;
	private JTextField textFieldEmision;
	//private JDateChooser dateChooserNacimiento;
	private JComboBox<String> comboBoxPais;
	//private JDateChooser dateChooserEmision;
	//private JDateChooser dateChooserVenc;
	private JTextField textFieldCuidad;
	private JTextField textFieldCalle;
	private JTextField textFieldAltura;
	private JTextField textFieldCodPostal;
	private JComboBox<String> comboBoxProvincia;
	private JComboBox<String> comboBoxPais2;
	private JTextField textFieldPasajero;
	private JTextField textFieldCategoria;
	private JTextField textFieldPersonal;
	private JTextField textFieldCelular;
	private JTextField textFieldLaboral;
	private JTextField textFieldFN;
	private JTextField textFieldFEmision; 
	private JTextField textFieldFVencimiento; 
	//private JComboBox<LineaAerea> comboBoxAerolinea ;
	private JButton btnCancelar;
	private JLabel lblNewLabel_2;
	private JLabel  labelApe;
	private JLabel labelDNI;
	private JLabel labelCUIT;
	private JLabel labelEmail;
	private JLabel Cuidad;
	private JLabel labelCodigo;
	private JLabel labelAltura;
	private JLabel labelCalle;
	private JLabel labelLaboral ;
	private JLabel labelCelular ;
	private JLabel labelPersonal;
	private JLabel labelNacimiento;
	private JLabel labelEmision;
	private JLabel labelVencimiento;
	private JLabel labelNumero;
	private JLabel labelPaisDir;
	private JLabel labelPaisPasaporte;
	private JLabel labelNumeroPasajero;
	private JLabel labelCategoria;

	/**
	 * @wbp.parser.constructor
	 */

	public MenuClienteAlta_Vista(MenuCliente_Controler mcc) {
		this.mcc=mcc;
		setBounds(100, 100, 900, 420);
		setLocationRelativeTo(null);
		setTitle("Aerolinea");
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panelDatosBasicos = new JPanel();
		panelDatosBasicos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDatosBasicos.setBounds(0, 0, 361, 171);
		getContentPane().add(panelDatosBasicos);
		panelDatosBasicos.setLayout(null);
		
		JLabel lblDatosBasicos = new JLabel("Datos Basicos:");
		lblDatosBasicos.setBounds(10, 10, 82, 14);
		panelDatosBasicos.add(lblDatosBasicos);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 35, 82, 14);
		panelDatosBasicos.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(99, 32, 86, 20);
		panelDatosBasicos.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(195, 35, 60, 14);
		panelDatosBasicos.add(lblApellido);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(265, 32, 86, 20);
		panelDatosBasicos.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(195, 74, 46, 14);
		panelDatosBasicos.add(lblDni);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(265, 71, 86, 20);
		panelDatosBasicos.add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		JLabel lblCuilcuit = new JLabel("Cuil/Cuit:");
		lblCuilcuit.setBounds(10, 74, 82, 14);
		panelDatosBasicos.add(lblCuilcuit);
		
		textFieldCuilCuit = new JTextField();
		textFieldCuilCuit.setBounds(99, 71, 86, 20);
		panelDatosBasicos.add(textFieldCuilCuit);
		textFieldCuilCuit.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setBounds(10, 110, 118, 14);
		panelDatosBasicos.add(lblFechaDeNacimiento);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 139, 46, 14);
		panelDatosBasicos.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(138, 136, 213, 20);
		panelDatosBasicos.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		
		/*
		dateChooserNacimiento = new JDateChooser();
		dateChooserNacimiento.setBounds(138, 104, 213, 20);
		panelDatosBasicos.add(dateChooserNacimiento);
		*/
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(74, 56, 127, 14);
		panelDatosBasicos.add(lblNewLabel_2);
		
		labelApe = new JLabel("");
		labelApe.setForeground(Color.RED);
		labelApe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelApe.setBounds(205, 56, 146, 14);
		panelDatosBasicos.add(labelApe);
		
		labelDNI = new JLabel("");
		labelDNI.setForeground(Color.RED);
		labelDNI.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelDNI.setBounds(205, 90, 146, 14);
		panelDatosBasicos.add(labelDNI);
		
		labelCUIT = new JLabel("");
		labelCUIT.setForeground(Color.RED);
		labelCUIT.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelCUIT.setBounds(10, 90, 175, 14);
		panelDatosBasicos.add(labelCUIT);
		
		labelEmail = new JLabel("");
		labelEmail.setForeground(Color.RED);
		labelEmail.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelEmail.setBounds(138, 157, 175, 14);
		panelDatosBasicos.add(labelEmail);
		
		labelNacimiento = new JLabel("");
		labelNacimiento.setForeground(Color.RED);
		labelNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelNacimiento.setBounds(139, 124, 146, 14);
		panelDatosBasicos.add(labelNacimiento);
		
		textFieldFN = new JTextField();
		textFieldFN.setBounds(120, 107, 193, 20);
		panelDatosBasicos.add(textFieldFN);
		textFieldFN.setColumns(10);
		
		JPanel panelPasaporte = new JPanel();
		panelPasaporte.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPasaporte.setBounds(0, 169, 361, 145);
		getContentPane().add(panelPasaporte);
		panelPasaporte.setLayout(null);
		
		JLabel lblPasaporte = new JLabel("Pasaporte: ");
		lblPasaporte.setBounds(10, 11, 88, 14);
		panelPasaporte.add(lblPasaporte);
		
		JLabel lblNumeroDePasaporte = new JLabel("Numero:");
		lblNumeroDePasaporte.setBounds(10, 36, 74, 14);
		panelPasaporte.add(lblNumeroDePasaporte);
		
		textFieldNumeroPasaporte = new JTextField();
		textFieldNumeroPasaporte.setBounds(94, 33, 86, 20);
		panelPasaporte.add(textFieldNumeroPasaporte);
		textFieldNumeroPasaporte.setColumns(10);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setBounds(190, 36, 46, 14);
		panelPasaporte.add(lblPais);
		
		
		comboBoxPais = new JComboBox<>();
		comboBoxPais.setBounds(223, 33, 128, 20);
		comboBoxPais=mcc.cargarPaises(comboBoxPais);
		panelPasaporte.add(comboBoxPais);
		
		
		comboBoxPais = new JComboBox<>();
		comboBoxPais.setBounds(223, 33, 128, 20);
		
		
		JLabel lblAutoridadDeEmision = new JLabel("Autoridad de Emision:");
		lblAutoridadDeEmision.setBounds(10, 64, 156, 14);
		panelPasaporte.add(lblAutoridadDeEmision);
		
		textFieldEmision = new JTextField();
		textFieldEmision.setBounds(128, 64, 128, 20);
		panelPasaporte.add(textFieldEmision);
		textFieldEmision.setColumns(10);
		
		JLabel lblFechaDeEmision = new JLabel("Fecha de Emision:\r\n");
		lblFechaDeEmision.setBounds(10, 99, 103, 14);
		panelPasaporte.add(lblFechaDeEmision);
		
		/* Listo
		dateChooserEmision = new JDateChooser();
		dateChooserEmision.setBounds(190, 92, 128, 20);
		panelPasaporte.add(dateChooserEmision);
		*/
		
		textFieldFEmision = new JTextField(); 
		textFieldFEmision.setBounds(110, 96, 122, 20);
		panelPasaporte.add(textFieldFEmision); 
		textFieldFEmision.setColumns(10);
		
		
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de Vencimiento:");
		lblFechaDeVencimiento.setBounds(10, 127, 108, 14);
		panelPasaporte.add(lblFechaDeVencimiento);
		
		/* LISTO
		dateChooserVenc = new JDateChooser();
		dateChooserVenc.setBounds(190, 123, 129, 20);
		panelPasaporte.add(dateChooserVenc);
		*/
		
		textFieldFVencimiento = new JTextField(); 
		textFieldFVencimiento.setBounds(120, 121, 128, 20);
		panelPasaporte.add(textFieldFVencimiento);
		textFieldFVencimiento.setColumns(10);
		
		
		labelEmision = new JLabel("");
		labelEmision.setForeground(Color.RED);
		labelEmision.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelEmision.setBounds(190, 79, 128, 14);
		panelPasaporte.add(labelEmision);
		
		labelVencimiento = new JLabel("");
		labelVencimiento.setForeground(Color.RED);
		labelVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelVencimiento.setBounds(128, 127, 128, 14);
		panelPasaporte.add(labelVencimiento);
		
		labelNumero = new JLabel("");
		labelNumero.setForeground(Color.RED);
		labelNumero.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelNumero.setBounds(66, 54, 122, 14);
		panelPasaporte.add(labelNumero);
		
		labelPaisPasaporte = new JLabel("");
		labelPaisPasaporte.setForeground(Color.RED);
		labelPaisPasaporte.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelPaisPasaporte.setBounds(190, 11, 127, 14);
		panelPasaporte.add(labelPaisPasaporte);
		
		JPanel panelDireccion = new JPanel();
		panelDireccion.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDireccion.setBounds(362, 0, 522, 163);
		getContentPane().add(panelDireccion);
		panelDireccion.setLayout(null);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(10, 11, 72, 14);
		panelDireccion.add(lblDireccin);
		
		JLabel lblPais_1 = new JLabel("Pais:");
		lblPais_1.setBounds(10, 36, 46, 14);
		panelDireccion.add(lblPais_1);
		
		/*
		comboBoxPais2 = new JComboBox<>();
		comboBoxPais2.setBounds(66, 33, 126, 20);
		comboBoxPais2=mcc.cargarPaises(comboBoxPais2);
		comboBoxPais2.addItemListener(new MenuAltaCLiente(this));
		panelDireccion.add(comboBoxPais2);
		*/
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(244, 36, 77, 14);
		panelDireccion.add(lblProvincia);
		
		comboBoxProvincia = new JComboBox<>();
		comboBoxProvincia.setBounds(317, 33, 118, 20);
		panelDireccion.add(comboBoxProvincia);
		
		
		JLabel lblCuidad = new JLabel("Cuidad: ");
		lblCuidad.setBounds(10, 81, 46, 14);
		panelDireccion.add(lblCuidad);
		
		textFieldCuidad = new JTextField();
		textFieldCuidad.setBounds(66, 78, 126, 20);
		panelDireccion.add(textFieldCuidad);
		textFieldCuidad.setColumns(10);
		
		JLabel lblCalle = new JLabel("Calle: ");
		lblCalle.setBounds(244, 81, 46, 14);
		panelDireccion.add(lblCalle);
		
		textFieldCalle = new JTextField();
		textFieldCalle.setBounds(317, 78, 118, 20);
		panelDireccion.add(textFieldCalle);
		textFieldCalle.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(10, 125, 46, 14);
		panelDireccion.add(lblAltura);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(66, 122, 126, 20);
		panelDireccion.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JLabel lblCodigoPosta = new JLabel("Codigo Posta: ");
		lblCodigoPosta.setBounds(202, 125, 105, 14);
		panelDireccion.add(lblCodigoPosta);
		
		textFieldCodPostal = new JTextField();
		textFieldCodPostal.setBounds(317, 122, 118, 20);
		panelDireccion.add(textFieldCodPostal);
		textFieldCodPostal.setColumns(10);
		
		Cuidad = new JLabel("");
		Cuidad.setForeground(Color.RED);
		Cuidad.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Cuidad.setBounds(66, 97, 127, 14);
		panelDireccion.add(Cuidad);
		
		labelCalle = new JLabel("");
		labelCalle.setForeground(Color.RED);
		labelCalle.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelCalle.setBounds(317, 97, 127, 14);
		panelDireccion.add(labelCalle);
		
		labelAltura = new JLabel("");
		labelAltura.setForeground(Color.RED);
		labelAltura.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelAltura.setBounds(66, 138, 127, 14);
		panelDireccion.add(labelAltura);
		
		labelCodigo = new JLabel("");
		labelCodigo.setForeground(Color.RED);
		labelCodigo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelCodigo.setBounds(317, 149, 127, 14);
		panelDireccion.add(labelCodigo);
		
		labelPaisDir = new JLabel("");
		labelPaisDir.setForeground(Color.RED);
		labelPaisDir.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelPaisDir.setBounds(66, 60, 127, 14);
		panelDireccion.add(labelPaisDir);
		
		JPanel panelPasajero = new JPanel();
		panelPasajero.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPasajero.setBounds(362, 162, 522, 152);
		getContentPane().add(panelPasajero);
		panelPasajero.setLayout(null);
		
		JLabel lblPasajeroFrecuente = new JLabel("Pasajero Frecuente:");
		lblPasajeroFrecuente.setBounds(10, 11, 105, 14);
		panelPasajero.add(lblPasajeroFrecuente);
		
		JLabel lblNumeroDePasajero = new JLabel("Numero de Pasajero: ");
		lblNumeroDePasajero.setBounds(10, 36, 140, 14);
		panelPasajero.add(lblNumeroDePasajero);
		
		textFieldPasajero = new JTextField();
		textFieldPasajero.setBounds(141, 33, 151, 20);
		panelPasajero.add(textFieldPasajero);
		textFieldPasajero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Aerolinea:");
		lblNewLabel.setBounds(10, 83, 105, 14);
		panelPasajero.add(lblNewLabel);
		
		/*
		comboBoxAerolinea = new JComboBox<>();
		comboBoxAerolinea.setBounds(141, 80, 151, 20);
		comboBoxAerolinea=mcc.cargarLineaAera(comboBoxAerolinea);
		panelPasajero.add(comboBoxAerolinea);
		*/
		
		JLabel lblCategoria = new JLabel("Categoria: ");
		lblCategoria.setBounds(302, 36, 72, 14);
		panelPasajero.add(lblCategoria);
		
		textFieldCategoria = new JTextField();
		textFieldCategoria.setBounds(384, 33, 128, 20);
		panelPasajero.add(textFieldCategoria);
		textFieldCategoria.setColumns(10);
		
		labelNumeroPasajero = new JLabel("");
		labelNumeroPasajero.setForeground(Color.RED);
		labelNumeroPasajero.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelNumeroPasajero.setBounds(141, 61, 135, 14);
		panelPasajero.add(labelNumeroPasajero);
		
		labelCategoria = new JLabel("");
		labelCategoria.setForeground(Color.RED);
		labelCategoria.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelCategoria.setBounds(384, 64, 135, 14);
		panelPasajero.add(labelCategoria);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 313, 749, 68);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTelefono = new JLabel("Telefono: ");
		lblTelefono.setBounds(10, 11, 86, 14);
		panel.add(lblTelefono);
		
		JLabel lblPersonal = new JLabel("Personal: ");
		lblPersonal.setBounds(10, 36, 73, 14);
		panel.add(lblPersonal);
		
		textFieldPersonal = new JTextField();
		textFieldPersonal.setBounds(93, 33, 135, 20);
		panel.add(textFieldPersonal);
		textFieldPersonal.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(260, 36, 46, 14);
		panel.add(lblCelular);
		
		textFieldCelular = new JTextField();
		textFieldCelular.setBounds(316, 33, 135, 20);
		panel.add(textFieldCelular);
		textFieldCelular.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Laboral: ");
		lblNewLabel_1.setBounds(489, 36, 86, 14);
		panel.add(lblNewLabel_1);
		
		textFieldLaboral = new JTextField();
		textFieldLaboral.setBounds(559, 33, 150, 20);
		panel.add(textFieldLaboral);
		textFieldLaboral.setColumns(10);
		
		labelPersonal = new JLabel("");
		labelPersonal.setForeground(Color.RED);
		labelPersonal.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelPersonal.setBounds(93, 54, 135, 14);
		panel.add(labelPersonal);
		
		labelCelular = new JLabel("");
		labelCelular.setForeground(Color.RED);
		labelCelular.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelCelular.setBounds(316, 54, 135, 14);
		panel.add(labelCelular);
		
		labelLaboral = new JLabel("");
		labelLaboral.setForeground(Color.RED);
		labelLaboral.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelLaboral.setBounds(559, 54, 150, 14);
		panel.add(labelLaboral);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new MenuClienteAlta_Vista(this));
		btnAgregar.setBounds(785, 314, 89, 23);
		
		getContentPane().add(btnAgregar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(785, 348, 89, 23);
		btnCancelar.addActionListener(new MenuClienteAlta_Vista(this));
		getContentPane().add(btnCancelar);
		
	}

	
	public JTextField getTextFieldPasajero() {
		return textFieldPasajero;
	}



	public void setTextFieldPasajero(JTextField textFieldPasajero) {
		this.textFieldPasajero = textFieldPasajero;
	}



	public JTextField getTextFieldCategoria() {
		return textFieldCategoria;
	}



	public void setTextFieldCategoria(JTextField textFieldCategoria) {
		this.textFieldCategoria = textFieldCategoria;
	}



	public JTextField getTextFieldPersonal() {
		return textFieldPersonal;
	}



	public void setTextFieldPersonal(JTextField textFieldPersonal) {
		this.textFieldPersonal = textFieldPersonal;
	}



	public JTextField getTextFieldCelular() {
		return textFieldCelular;
	}



	public void setTextFieldCelular(JTextField textFieldCelular) {
		this.textFieldCelular = textFieldCelular;
	}



	public JTextField getTextFieldLaboral() {
		return textFieldLaboral;
	}



	public void setTextFieldLaboral(JTextField textFieldLaboral) {
		this.textFieldLaboral = textFieldLaboral;
	}


	/*

	public JComboBox<LineaAerea> getComboBoxAerolinea() {
		return comboBoxAerolinea;
	}



	public void setComboBoxAerolinea(JComboBox<LineaAerea> comboBoxAerolinea) {
		this.comboBoxAerolinea = comboBoxAerolinea;
	}

*/

	public JButton getBtnCancelar() {
		return btnCancelar;
	}



	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}



	public JTextField getTextFieldCuidad() {
		return textFieldCuidad;
	}



	public void setTextFieldCuidad(JTextField textFieldCuidad) {
		this.textFieldCuidad = textFieldCuidad;
	}



	public JTextField getTextFieldCalle() {
		return textFieldCalle;
	}



	public void setTextFieldCalle(JTextField textFieldCalle) {
		this.textFieldCalle = textFieldCalle;
	}



	public JTextField getTextFieldAltura() {
		return textFieldAltura;
	}



	public void setTextFieldAltura(JTextField textFieldAltura) {
		this.textFieldAltura = textFieldAltura;
	}



	public JTextField getTextFieldCodPostal() {
		return textFieldCodPostal;
	}



	public void setTextFieldCodPostal(JTextField textFieldCodPostal) {
		this.textFieldCodPostal = textFieldCodPostal;
	}



	public JComboBox<String> getComboBoxProvincia() {
		return comboBoxProvincia;
	}



	public void setComboBoxProvincia(JComboBox<String> comboBoxProvincia) {
		this.comboBoxProvincia = comboBoxProvincia;
	}



	public JComboBox<String> getComboBoxPais2() {
		return comboBoxPais2;
	}



	public void setComboBoxPais2(JComboBox<String> comboBoxPais2) {
		this.comboBoxPais2 = comboBoxPais2;
	}



	public JTextField getTextFieldNumeroPasaporte() {
		return textFieldNumeroPasaporte;
	}



	public void setTextFieldNumeroPasaporte(JTextField textFieldNumeroPasaporte) {
		this.textFieldNumeroPasaporte = textFieldNumeroPasaporte;
	}



	public JTextField getTextFieldEmision() {
		return textFieldEmision;
	}



	public void setTextFieldEmision(JTextField textFieldEmision) {
		this.textFieldEmision = textFieldEmision;
	}

	/*


	public JDateChooser getDateChooserNacimiento() {
		return dateChooserNacimiento;
	}



	public void setDateChooserNacimiento(JDateChooser dateChooserNacimiento) {
		this.dateChooserNacimiento = dateChooserNacimiento;
	}

*/

	public JComboBox<String> getComboBoxPais() {
		return comboBoxPais;
	}



	public void setComboBoxPais(JComboBox<String> comboBoxPais) {
		this.comboBoxPais = comboBoxPais;
	}


/*
	public JDateChooser getDateChooserEmision() {
		return dateChooserEmision;
	}



	public void setDateChooserEmision(JDateChooser dateChooserEmision) {
		this.dateChooserEmision = dateChooserEmision;
	}



	public JDateChooser getDateChooserVenc() {
		return dateChooserVenc;
	}



	public void setDateChooserVenc(JDateChooser dateChooserVenc) {
		this.dateChooserVenc = dateChooserVenc;
	}

*/

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public MenuCliente_Controler getMcc() {
		return mcc;
	}

	public void setMcc(MenuCliente_Controler mcc) {
		this.mcc = mcc;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JTextField getTextFieldApellido() {
		return textFieldApellido;
	}

	public void setTextFieldApellido(JTextField textFieldApellido) {
		this.textFieldApellido = textFieldApellido;
	}

	public JTextField getTextFieldDNI() {
		return textFieldDNI;
	}

	public void setTextFieldDNI(JTextField textFieldDNI) {
		this.textFieldDNI = textFieldDNI;
	}

	public JTextField getTextFieldCuilCuit() {
		return textFieldCuilCuit;
	}

	public void setTextFieldCuilCuit(JTextField textFieldCuilCuit) {
		this.textFieldCuilCuit = textFieldCuilCuit;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	public void setTextFieldEmail(JTextField textFieldEmail) {
		this.textFieldEmail = textFieldEmail;
	}


	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}


	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}


	public JLabel getLabelApe() {
		return labelApe;
	}


	public void setLabelApe(JLabel labelApe) {
		this.labelApe = labelApe;
	}

	public JLabel getLabelDNI() {
		return labelDNI;
	}


	public void setLabelDNI(JLabel labelDNI) {
		this.labelDNI = labelDNI;
	}


	public JLabel getLabelCUIT() {
		return labelCUIT;
	}


	public void setLabelCUIT(JLabel labelCUIT) {
		this.labelCUIT = labelCUIT;
	}


	public JLabel getLabelEmail() {
		return labelEmail;
	}


	public void setLabelEmail(JLabel labelEmail) {
		this.labelEmail = labelEmail;
	}


	public JLabel getCuidad() {
		return Cuidad;
	}


	public void setCuidad(JLabel cuidad) {
		Cuidad = cuidad;
	}


	public JLabel getLabelCodigo() {
		return labelCodigo;
	}


	public void setLabelCodigo(JLabel labelCodigo) {
		this.labelCodigo = labelCodigo;
	}


	public JLabel getLabelAltura() {
		return labelAltura;
	}


	public void setLabelAltura(JLabel labelAltura) {
		this.labelAltura = labelAltura;
	}


	public JLabel getLabelCalle() {
		return labelCalle;
	}


	public void setLabelCalle(JLabel labelCalle) {
		this.labelCalle = labelCalle;
	}


	public JLabel getLabelLaboral() {
		return labelLaboral;
	}


	public void setLabelLaboral(JLabel labelLaboral) {
		this.labelLaboral = labelLaboral;
	}


	public JLabel getLabelCelular() {
		return labelCelular;
	}


	public void setLabelCelular(JLabel labelCelular) {
		this.labelCelular = labelCelular;
	}


	public JLabel getLabelPersonal() {
		return labelPersonal;
	}


	public void setLabelPersonal(JLabel labelPersonal) {
		this.labelPersonal = labelPersonal;
	}


	public JLabel getLabelNacimiento() {
		return labelNacimiento;
	}


	public void setLabelNacimiento(JLabel labelNacimiento) {
		this.labelNacimiento = labelNacimiento;
	}


	public JLabel getLabelEmision() {
		return labelEmision;
	}


	public void setLabelEmision(JLabel labelEmision) {
		this.labelEmision = labelEmision;
	}


	public JLabel getLabelVencimiento() {
		return labelVencimiento;
	}


	public void setLabelVencimiento(JLabel labelVencimiento) {
		this.labelVencimiento = labelVencimiento;
	}


	public JLabel getLabelNumero() {
		return labelNumero;
	}


	public void setLabelNumero(JLabel labelNumero) {
		this.labelNumero = labelNumero;
	}


	public JLabel getLabelPaisDir() {
		return labelPaisDir;
	}


	public void setLabelPaisDir(JLabel labelPaisDir) {
		this.labelPaisDir = labelPaisDir;
	}


	public JLabel getLabelPaisPasaporte() {
		return labelPaisPasaporte;
	}


	public void setLabelPaisPasaporte(JLabel labelPaisPasaporte) {
		this.labelPaisPasaporte = labelPaisPasaporte;
	}


	public JLabel getLabelNumeroPasajero() {
		return labelNumeroPasajero;
	}


	public void setLabelNumeroPasajero(JLabel labelNumeroPasajero) {
		this.labelNumeroPasajero = labelNumeroPasajero;
	}


	public JLabel getLabelCategoria() {
		return labelCategoria;
	}


	public void setLabelCategoria(JLabel labelCategoria) {
		this.labelCategoria = labelCategoria;
	}


	public JTextField getTextFieldFN() {
		return textFieldFN;
	}


	public void setTextFieldFN(JTextField textFieldFN) {
		this.textFieldFN = textFieldFN;
	}


	public JTextField getTextFieldFEmision() {
		return textFieldFEmision;
	}


	public void setTextFieldFEmision(JTextField textFieldFEmision) {
		this.textFieldFEmision = textFieldFEmision;
	}


	public JTextField getTextFieldFVencimiento() {
		return textFieldFVencimiento;
	}


	public void setTextFieldFVencimiento(JTextField textFieldFVencimiento) {
		this.textFieldFVencimiento = textFieldFVencimiento;
	}
	
	
	

}
