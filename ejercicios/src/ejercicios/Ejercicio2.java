package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("escribe un numero");
		int numero1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("escribe un numero");
		int numero2 = Integer.parseInt(str);
		
	if(numero1<numero2) {
		System.out.println(numero1);
	}
	else {
		System.out.println(numero2);
	}
	}
	
}
