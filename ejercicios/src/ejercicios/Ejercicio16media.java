package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio16media {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("escribe cuantos numeros quieres que sea la media: "));
		int suma =0;
		int media =0;
		for (int i =0; i<num; i++) {
			int numusuario = Integer.parseInt(JOptionPane.showInputDialog("introduce los numeros para hacer las medias: "));
			suma=numusuario+suma;
		}
		media=suma/num;
		System.out.println("la media de los numeros es: " + media);
	}

}
