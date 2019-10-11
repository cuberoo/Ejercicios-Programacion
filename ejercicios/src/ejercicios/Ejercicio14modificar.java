package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio14modificar {

	public static void main(String[] args) {
	int suma=0;
	int num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero: "));
		for(int i =0; i<num;i++ ) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("escribe un numero"));
			if(numero>=10) {
				suma=numero+suma;
			}
		}
		System.out.println("el resultado de la suma es: " + suma);
	}

}
