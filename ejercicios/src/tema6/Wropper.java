package tema6;

import javax.swing.JOptionPane;

public class Wropper {

	public static void main(String[] args) {
		//valores maximos minimos y bytes de los valores primitivos 
		
		System.out.println("valor mayor de integer: " + Integer.MAX_VALUE);
		System.out.println("valor minimo de integer: " + Integer.MIN_VALUE);
		System.out.println("valor en bytes: " + Integer.SIZE + "\n");
		
		System.out.println("valor mayor de short: " + Short.MAX_VALUE);
		System.out.println("valor minimo de short : " + Short.MIN_VALUE);
		System.out.println("valor en bytes: " + Short.SIZE + "\n");
		
		System.out.println("valor mayor de long: " + Long.MAX_VALUE);
		System.out.println("valor minimo de long: " + Long.MIN_VALUE);
		System.out.println("valor en bytes: " + Long.SIZE + "\n");
		
		System.out.println("valor mayor de float: " + Float.MAX_VALUE);
		System.out.println("valor minimo de float: " + Float.MIN_VALUE);
		System.out.println("valor en bytes: " + Float.SIZE + "\n");
		
		System.out.println("valor mayor de double: " + Double.MAX_VALUE);
		System.out.println("valor minimo de double: " + Double.MIN_VALUE);
		System.out.println("valor en bytes: " + Double.SIZE + "\n");
		
		//contrasena();
		numerosHexadecimal();
	}
	
	public static void contrasena() {
		//programa que pida una contrase�a con unas determinadas normas
		boolean terminado =false;
		boolean mayuscula =false;
		boolean minuscula =false;
		boolean digito =false;
		boolean alfanumerico=false;
		int i =0;
		
		do {
			String contrasena =(String) JOptionPane.showInputDialog("escriba su contrase�a");
			for(i =0; i < contrasena.length(); i++) {
				char str = contrasena.charAt(i);
				if(Character.isLowerCase(str)) {
					minuscula =true;
				}
				if(Character.isUpperCase(str)) {
					mayuscula =true;
				}
				if(Character.isAlphabetic(str)) {
					alfanumerico =true;
				}
				if(Character.isDigit(str)) {
					digito =true;
				}
			}
			if(minuscula ==true && mayuscula ==true && alfanumerico ==true && digito ==true) {
				terminado =true;
				System.out.println("contrase�a aceptada");
			}else {
				System.out.println("contrase�a no valida introduzca otra con los requisitos requeridos");
			}
		}while(!terminado);
	}
	
	public static void numerosHexadecimal() {
		//programa que imprima los 100 primeros numeros en hexadecimal 
		for(int i =0; i <= 100; i++) {
			System.out.println("numero entero: " + i + " en hexadecimal: " + Integer.toHexString(i));
		}
	}

}
