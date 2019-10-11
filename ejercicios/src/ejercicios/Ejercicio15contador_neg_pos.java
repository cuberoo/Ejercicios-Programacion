package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio15contador_neg_pos {

	public static void main(String[] args) {
	int suma=0;
	int contadorneg=0, contadorpos=0;
	int num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero: "));
		for(int i =0; i<num;i++ ) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("escribe un numero"));
			if(numero<0) {
				contadorneg++;
			}
			else {
				contadorpos++;
			}
		}
		System.out.println("numeros positivos introducidos son: " + contadorpos + "numeros negativos son: " + contadorneg);
	}

}
