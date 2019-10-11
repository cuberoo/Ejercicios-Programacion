package ejercicios;

import javax.swing.JOptionPane;

public class Ejerciciojuego {

	public static void main(String[] args) {
		int numero = (int) Math.round(Math.random()*100);
		int tirada =-1;
		for(;numero!=tirada;) {
			tirada =Integer.parseInt(JOptionPane.showInputDialog("busca el numero pensado (0-100)"));
			
			if(tirada > numero) {
				JOptionPane.showMessageDialog(null, "mi numero es inferior a "+ tirada);
				
			}
			else {
				if(tirada<numero) {
					JOptionPane.showMessageDialog(null, "mi numero es superior a "+ tirada);
				}
				else {
					JOptionPane.showMessageDialog(null, "ehnorabuena cruk lo has adivinado"); 
				}
			}
		}
	}

}
