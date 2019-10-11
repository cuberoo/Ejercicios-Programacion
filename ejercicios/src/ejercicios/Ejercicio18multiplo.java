package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio18multiplo {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("escribe un numero"));
		int multiplo=0;
		for(int i=0; multiplo<99; i++) {
			multiplo=numero*i;
			System.out.println(multiplo);
		}
		}
	}
