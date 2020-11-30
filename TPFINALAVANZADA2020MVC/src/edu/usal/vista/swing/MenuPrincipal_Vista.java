package edu.usal.vista.swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import edu.usal.controlador.swing.MenuPrincipal_Controler;


public class MenuPrincipal_Vista extends JFrame{

	private static final long serialVersionUID = 1L;
	MenuPrincipal_Controler mpc; 

	
	
	private JPanel panel;
	private JLabel lblBienvenidos;
	private JButton btnGestionClientes;
	private JButton btnAerolinea;
	private JButton btnVuelo;
	private JButton btnVentas;
	
	//JMENU
	
	public MenuPrincipal_Vista(MenuPrincipal_Controler mpc) {
		this.mpc = mpc; 
		
		
		setBounds(100, 100, 704, 720);
		setLocationRelativeTo(null);
		setTitle("Menu Principal");
		getContentPane().setLayout(null);
		this.setResizable(false);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(-12, 0, 712, 69);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblBienvenidos = new JLabel("Aerolineas Splinter");
		lblBienvenidos.setVerticalAlignment(SwingConstants.TOP);
		lblBienvenidos.setToolTipText("");
		lblBienvenidos.setLabelFor(this);
		lblBienvenidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblBienvenidos.setBounds(0, 0, 484, 57);
		panel.add(lblBienvenidos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 68, 700, 623);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		btnGestionClientes = new JButton("Gestion de Clientes");
		btnGestionClientes.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnGestionClientes.setFocusable(false);
		btnGestionClientes.setBounds(33, 93, 171, 75);
		btnGestionClientes.setBackground(new Color(255, 20, 147));
		//btnGestionClientes.addActionListener(new EventosMP(this));
		panel_1.add(btnGestionClientes);
		
		btnAerolinea = new JButton("Gestion de Aerolinea");
		btnAerolinea.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnAerolinea.setFocusable(false);
		btnAerolinea.setBounds(33, 93, 171, 75);
		btnAerolinea.setBackground(new Color(255, 20, 147));
		panel_1.add(btnAerolinea);
		//btnAerolinea.addActionListener(new EventosMP(this));
		
		btnVuelo = new JButton("Gestion de Vuelos");
		btnVuelo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnVuelo.setFocusable(false);
		btnVuelo.setBounds(33, 93, 171, 75);
		btnVuelo.setBackground(new Color(255, 20, 147));
		//btnVuelo.addActionListener(new EventosMP(this));
		panel_1.add(btnVuelo);
		
		btnVentas = new JButton("Gestion de Ventas");
		btnVentas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnVentas.setBounds(33, 93, 171, 75);
		btnVentas.setBackground(new Color(255, 20, 147));
		btnVentas.setFocusable(false);
		panel_1.add(btnVentas);
		//btnVentas.addActionListener(new EventosMP(this));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public MenuPrincipal_Controler getMpc() {
		return mpc;
	}

	public void setMpc(MenuPrincipal_Controler mpc) {
		this.mpc = mpc;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLblBienvenidos() {
		return lblBienvenidos;
	}

	public void setLblBienvenidos(JLabel lblBienvenidos) {
		this.lblBienvenidos = lblBienvenidos;
	}

	public JButton getBtnGestionClientes() {
		return btnGestionClientes;
	}

	public void setBtnGestionClientes(JButton btnGestionClientes) {
		this.btnGestionClientes = btnGestionClientes;
	}

	public JButton getBtnAerolinea() {
		return btnAerolinea;
	}

	public void setBtnAerolinea(JButton btnAerolinea) {
		this.btnAerolinea = btnAerolinea;
	}

	public JButton getBtnVuelo() {
		return btnVuelo;
	}

	public void setBtnVuelo(JButton btnVuelo) {
		this.btnVuelo = btnVuelo;
	}

	public JButton getBtnVentas() {
		return btnVentas;
	}

	public void setBtnVentas(JButton btnVentas) {
		this.btnVentas = btnVentas;
	}
		
		
	}


		
		
		/*
		setBounds(100, 100, 500, 381);
		setLocationRelativeTo(null);
		setTitle("Menu Principal PIJA");
		//getContentPane().setLayout(null);
		//this.setResizable(false);
	
		contentPane1 = new JPanel();
		contentPane1.setForeground(new Color(255, 1, 1));
		contentPane1.setBackground(new Color(255, 204, 255));
		contentPane1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		
		JTextField txtHola = new JTextField();
		txtHola.setText("Hola");
		txtHola.setBounds(180, 179, 86, 20);
		contentPane1.add(txtHola);
		txtHola.setColumns(10);
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		/*
		
		
		
		//getContentPane().add(contentPane1);  
		
		
		
		
		
		//Label Titulo Principal
		lblMP1 = new JLabel("Aerolineas Splinter");
		lblMP1.setBackground(Color.RED);
		lblMP1.setForeground(Color.BLACK);
		lblMP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMP1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblMP1.setBounds(0, 0, 484, 57);
		contentPane1.add(lblMP1);
		
		//Boton Clientes
		btnGestionClientes = new JButton("Gestion de Clientes");
		btnGestionClientes.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnGestionClientes.setForeground(Color.BLACK);
		btnGestionClientes.setBounds(33, 93, 171, 75);
		btnGestionClientes.setBackground(new Color(255, 20, 147));
		contentPane1.add(btnGestionClientes);
		
		//Boton Aerolinea
		btnGestionAerolinea = new JButton("Gestion de Aerolinea");
		btnGestionAerolinea.setForeground(Color.BLACK);
		btnGestionAerolinea.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnGestionAerolinea.setBackground(new Color(255, 20, 147));
		btnGestionAerolinea.setBounds(277, 93, 171, 75);
		contentPane1.add(btnGestionAerolinea);
		
		//Boton Ventas
		btnGestionClientes_2 = new JButton("Gestion de Ventas");
		btnGestionClientes_2.setForeground(Color.BLACK);
		btnGestionClientes_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnGestionClientes_2.setBackground(new Color(255, 20, 147));
		btnGestionClientes_2.setBounds(33, 216, 171, 75);
		contentPane1.add(btnGestionClientes_2);
		
		//Boton Vuelos
		btnGestionClientes_3 = new JButton("Gestion de Vuelos");
		btnGestionClientes_3.setForeground(Color.BLACK);
		btnGestionClientes_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnGestionClientes_3.setBackground(new Color(255, 20, 147));
		btnGestionClientes_3.setBounds(277, 216, 171, 75);
		contentPane1.add(btnGestionClientes_3);
		
		
		
		
		
	
		
		
		
		*/
		/*
		
	}


	public MenuPrincipal_Controler getMpc() {
		return mpc;
	}


	public void setMpc(MenuPrincipal_Controler mpc) {
		this.mpc = mpc;
	}


	public JPanel getContentPane() {
		return contentPane1;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane1 = contentPane;
	}


	public JPanel getContentPane1() {
		return contentPane1;
	}


	public void setContentPane1(JPanel contentPane1) {
		this.contentPane1 = contentPane1;
	}


	public JButton getBtnGestionClientes() {
		return btnGestionClientes;
	}


	public void setBtnGestionClientes(JButton btnGestionClientes) {
		this.btnGestionClientes = btnGestionClientes;
	}


	public JButton getBtnGestionAerolinea() {
		return btnGestionAerolinea;
	}


	public void setBtnGestionAerolinea(JButton btnGestionAerolinea) {
		this.btnGestionAerolinea = btnGestionAerolinea;
	}


	public JButton getBtnGestionClientes_2() {
		return btnGestionClientes_2;
	}


	public void setBtnGestionClientes_2(JButton btnGestionClientes_2) {
		this.btnGestionClientes_2 = btnGestionClientes_2;
	}


	public JButton getBtnGestionClientes_3() {
		return btnGestionClientes_3;
	}


	public void setBtnGestionClientes_3(JButton btnGestionClientes_3) {
		this.btnGestionClientes_3 = btnGestionClientes_3;
	}


	public JLabel getLblMP1() {
		return lblMP1;
	}


	public void setLblMP1(JLabel lblMP1) {
		this.lblMP1 = lblMP1;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}

*/

