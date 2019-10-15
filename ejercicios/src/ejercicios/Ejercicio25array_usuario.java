package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio25array_usuario {

	public static void main(String[] args) {
		int array[] = new int [150];
		int mayor =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero mayor del array"));
		int menor =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero menor del array"));
		for(int i=0;i<array.length;i++) {
			array[i]= (int) Math.round(Math.random()*(mayor-menor)+menor);
			System.out.println(array[i]);
		}
		
	}

}
