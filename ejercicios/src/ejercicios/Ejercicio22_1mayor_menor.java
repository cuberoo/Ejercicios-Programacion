package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio22_1mayor_menor {

	public static void main(String[] args) {
		int num = 1;
		int mayor= 0;
		while (num!=0) {
			num =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero"));
				mayor =num;
				if(num>mayor && num !=0) {
					mayor=num;
				}
			}
			System.out.println("el numero mayor es: "+ mayor);
			}
	}


