package edu.usal.util;


import javax.swing.JLabel;

public class ValidarDatos {
	
	
public static boolean String(String string, JLabel jLabel) {
		
		if(string.length()==0) {
			jLabel.setText("*Campo obligatorio");
			return false;
		}
		if(string.length()<3) {
			jLabel.setText("Demasiado corto");
			return false;
		}
		for(int i=0; i<string.length(); i++) {
			if((string.charAt(i))<64 && string.charAt(i)!=32) {
				jLabel.setText("caracteres invalidos");
				return false;
			}
		}
		jLabel.setText("");
		return true;
	}

	public static boolean DNI(String text, JLabel labelDNI) {
		if(text.length()==0) {
			labelDNI.setText("*Campo obligatorio");
			return false;
		}
		if(text.length()!=8) {
			labelDNI.setText("dni invalido");
			return false;
		}
		for(int i=0; i<text.length(); i++) {
			if((text.charAt(i))<39 && (text.charAt(i))>30 ) {
				labelDNI.setText("dni invalido");
				return false;
			}
		}
		labelDNI.setText("");
		return true;
	}

	
	public static boolean CUIT(String text, JLabel labelCuit) {
		if(text.length()==0) {
			labelCuit.setText("*campo obligatorio");
			return false;
		}
		if(text.length()!=11) {
			labelCuit.setText("longitud invalida");
			return false;
		}
		int [] num= {5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
		int resultado=0;
		int verificador= text.indexOf(11);
		for(int i=0; i<10; i++) {
			resultado+=Integer.valueOf(text.charAt(i)) * num[i];
		}
		resultado=resultado/11;
		resultado=11-resultado;
		if(resultado==11) {
			if(verificador==0) {
				labelCuit.setText("cuit/cuil invalido");
				return false;
			}
		}
		labelCuit.setText("");
		return true;
	}

	public static boolean email(String text, JLabel labelEmail) {
		if(text.length()==0) {
			labelEmail.setText("*campo obligatorio");
			return false;
		}
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i)==64) {
				labelEmail.setText("");
				return true;
			}
		}
		labelEmail.setText("email invalido");
		return false;
	}

	public static boolean validarInt(String text, JLabel labelAltura) {
		if(text.length()==0) {
			labelAltura.setText("*campo obligatorio");
			return false;
		}
        try {
            Integer.parseInt(text);
            labelAltura.setText("");
            return true;
        } catch (NumberFormatException excepcion) {
        	labelAltura.setText("formato invalido");
        	return false;
        }
	}
	
	public static boolean validarFecha(String fecha, JLabel label) {
		if(fecha.length()==0) {
			label.setText("*campo obligatorio");
			return false;
		}
		for(int i=0; i<fecha.length(); i++) {
			if(fecha.charAt(i)==64) {
				label.setText("");
				return true;
			}
		}
		label.setText("Fecah invalida");
		return false;
        
	}
	
	public static boolean validarPais(int pais, JLabel label) {
		if(pais==0) {
			label.setText("*Campo obligatorio");
			return false;
		}
		label.setText("");
		return true;
	}
	
	
	
	
	

}
