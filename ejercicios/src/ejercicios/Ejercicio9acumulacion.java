package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio9acumulacion {

	public static void main(String[] args) {
		int acumnegativos = 0; // <0
		int acumbajos = 0; // >= 0 y <25
		int acummedios = 0; // >=25 y <25
		int acumaltos = 0; // >= 250
		//primer numero
		String str = JOptionPane.showInputDialog("introduzca un numero");
		int num = Integer.parseInt(str);
		
		if(num < 0){ //si es negativo lo acumulo correctamente
			acumnegativos = acumnegativos +1;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
			if(num < 25){
				acumbajos += 1;
			}
			else {
				if(num < 250) {
					acummedios += 1;
				}
				else {
					acumaltos +=1;
				}
			}
		}
		//segundo numero
		str = JOptionPane.showInputDialog("introduzca un numero");
		num = Integer.parseInt(str);
				
		if(num < 0){ //si es negativo lo acumulo correctamente
					acumnegativos = acumnegativos +1;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
		if(num < 25){
			acumbajos += 1;
		}
		else {
			if(num < 250) {
				acummedios += 1;
				}
				else {
					acumaltos +=1;
				}
			}
		}
		//tercer numero
		str = JOptionPane.showInputDialog("introduzca un numero");
		num = Integer.parseInt(str);
				
		if(num < 0){ //si es negativo lo acumulo correctamente
			acumnegativos = acumnegativos +1;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
			if(num < 25){
				acumbajos += 1;
			}
			else {
				if(num < 250) {
					acummedios += 1;
				}
				else {
					acumaltos +=1;
				}
			}
		}
		//cuarto numero
		str = JOptionPane.showInputDialog("introduzca un numero");
		num = Integer.parseInt(str);
						
		if(num < 0){ //si es negativo lo acumulo correctamente
			acumnegativos = acumnegativos +1;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
			if(num < 25){
				acumbajos += 1;
			}
			else {
				if(num < 250) {
					acummedios +=1;
				}
				else {
					acumaltos +=1;
				}
			}
		}
		//quinto numero
		str = JOptionPane.showInputDialog("introduzca un numero");
		num = Integer.parseInt(str);
						
		if(num < 0){ //si es negativo lo acumulo correctamente
			acumnegativos = acumnegativos +1;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
			if(num < 25){
				acumbajos += 1;
			}
			else {
				if(num < 250) {
					acummedios +=1;
				}
				else {
					acumaltos +=1;
				}
			}
		}

	}

}
