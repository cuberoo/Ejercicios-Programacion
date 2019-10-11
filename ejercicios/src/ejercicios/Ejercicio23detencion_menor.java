package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio23detencion_menor {

	public static void main(String[] args) {
		int num = 1;
		int menor= 0;
		num =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero"));
		for (int i=0;num!=0;i++) {
			if(i==0) {
				menor =num;
			
			}
			else {
				if(num<menor && num !=0) {
					menor=num;
				}
			}
			}
		
			System.out.println("el numero menor es: "+ menor);
	}

}
