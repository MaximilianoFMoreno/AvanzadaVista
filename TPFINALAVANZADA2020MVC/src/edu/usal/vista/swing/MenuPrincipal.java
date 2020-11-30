package edu.usal.vista.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import edu.usal.controlador.swing.MenuPrincipal_Controler;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class MenuPrincipal extends JFrame {
	
	private static final long serialVersionUID = 1L;
	MenuPrincipal_Controler mpc; 

	
	private JPanel panel;
	private JLabel lblBienvenidos;
	private JButton btnGestionClientes;
	private JButton btnAerolinea;
	private JButton btnVuelo;
	private JButton btnVentas;
	
	public MenuPrincipal(MenuPrincipal_Controler mpc) {
		
this.mpc = mpc; 
		
		
		setBounds(100, 100, 704, 720);
		setLocationRelativeTo(null);
		setTitle("Menu Principal");
		getContentPane().setLayout(null);
		this.setResizable(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 245, 238));
		panel_1.setBounds(0, 68, 698, 623);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		btnGestionClientes = new JButton("Gestion de Clientes");
		btnGestionClientes.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnGestionClientes.setFocusable(false);
		btnGestionClientes.setBounds(34, 93, 245, 140);
		btnGestionClientes.setBackground(new Color(245, 255, 250));
		//btnGestionClientes.addActionListener(new EventosMP(this));
		panel_1.add(btnGestionClientes);
		
		btnAerolinea = new JButton("Gestion de Aerolinea");
		btnAerolinea.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnAerolinea.setFocusable(false);
		btnAerolinea.setBounds(398, 93, 245, 135);
		btnAerolinea.setBackground(new Color(245, 255, 250));
		panel_1.add(btnAerolinea);
		//btnAerolinea.addActionListener(new EventosMP(this));
		
		btnVuelo = new JButton("Gestion de Vuelos");
		btnVuelo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnVuelo.setFocusable(false);
		btnVuelo.setBounds(398, 311, 245, 140);
		btnVuelo.setBackground(new Color(245, 255, 250));
		//btnVuelo.addActionListener(new EventosMP(this));
		panel_1.add(btnVuelo);
		
		btnVentas = new JButton("Gestion de Ventas");
		btnVentas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnVentas.setBounds(34, 311, 245, 140);
		btnVentas.setBackground(new Color(245, 255, 250));
		btnVentas.setFocusable(false);
		panel_1.add(btnVentas);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 698, 69);
		getContentPane().add(panel);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 204, 255));
		panel.setLayout(null);
		
		lblBienvenidos = new JLabel("Aerolineas Splinter");
		lblBienvenidos.setBounds(10, 11, 685, 69);
		panel.add(lblBienvenidos);
		lblBienvenidos.setVerticalAlignment(SwingConstants.TOP);
		lblBienvenidos.setToolTipText("");
		lblBienvenidos.setLabelFor(this);
		lblBienvenidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidos.setFont(new Font("Arial Black", Font.PLAIN, 21));
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

