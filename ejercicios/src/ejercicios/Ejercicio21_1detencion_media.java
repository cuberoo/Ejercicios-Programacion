package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio21_1detencion_media {

	public static void main(String[] args) {
		int num = 1;
		int suma= 0;
		float media=0;
		float i=-1;
		
		while (num!=0) {
			num =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero que quieras sumar"));
			suma=num+suma;
			i++;
		}
//		do {
//			num =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero que quieras sumar"));
//			suma=num+suma;
//			i++;
//		} while(num!=0);
			media=suma/(i-1);
			System.out.println("la media de los numeros es: " + media);
	}

}
