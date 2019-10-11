package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio20_1detencion {

	public static void main(String[] args) {
		int num = 1;
		int suma= 0;
		do {
			num =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero que quieras sumar"));
			suma=num+suma;
		}while(num!=0);
		
			System.out.println("la suma de los numeros es: " + suma);
			
//		while(num!=0) {
//			num =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero que quieras sumar"));
//			suma=num+suma;
//		}
	}

}
