package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio21detencion_media {

	public static void main(String[] args) {
		int num = 1;
		int suma= 0;
		float media=0;
		float i;
		
		for (i=-1;num!=0;i++) {
			num =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero que quieras sumar"));
			suma=num+suma;
		}
			media=suma/(i-1);
			System.out.println("la media de los numeros es: " + media);
	}

}
