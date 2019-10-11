package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio22detencion_mayor_menor {

	public static void main(String[] args) {
		int num = 1;
		int mayor= 0;
		num =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero"));
		for (int i=0;num!=0;i++) {
			if(i==0) {
				mayor =num;
			
			}
			else {
				if(num>mayor && num !=0) {
					mayor=num;
				}
			}
			}
		
			System.out.println("el numero mayor es: "+ mayor);
	}

}
