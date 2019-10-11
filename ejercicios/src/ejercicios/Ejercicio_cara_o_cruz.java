package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_cara_o_cruz {

	public static void main(String[] args) {
		int usuario=0;
		int maquina=0;
		for(;maquina!=2 && usuario!=2;) {
			int variable = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero\n 1-para cara\n 2-para cruz"));
			int azar = ((int)Math.round(Math.random()*(2-1)+1));
			if(variable==azar) {
				System.out.println("ganaste compiñero!!!");
				usuario++;
			}
			else {
				System.out.println("perdiste!!");
				maquina++;
			}
		}
	}
	}
