package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13bucles {

	public static void main(String[] args) {
	int suma=0;
		for(int i =0; i<4;i++ ) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("escribe un numero"));
			if(numero>=10) {
				suma=numero+suma;
			}
		}
		System.out.println("el resultado de la suma es: " + suma);
	}

}
