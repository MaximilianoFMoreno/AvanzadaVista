package edu.usal.controlador.swing;

import edu.usal.vista.swing.MenuPrincipal;
import edu.usal.vista.swing.MenuPrincipal_Vista;

public class MenuPrincipal_Controler {
	
	private MenuPrincipal Vmenuprincipal; 
	
	
	
	
	
	public MenuPrincipal_Controler() {}

	
	public void EjecutarMenuPrincipal(){
		this.Vmenuprincipal = new MenuPrincipal(this); 
	}
	
	
	
}
