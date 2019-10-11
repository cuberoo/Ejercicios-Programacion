package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio19multiplo_usuario {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("escribe un numero:"));
		int multiplo=0;
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("escribe el limite de los multiplos:"));
		maximo=maximo-1;
		for(int i=0; multiplo<maximo; i++) {
			multiplo=numero*i;
			System.out.println(multiplo);
		}
	}

}
