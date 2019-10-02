package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8_acumulativos {

	public static void main(String[] args) {
		
		int acumnegativos = 0; // <0
		int acumbajos = 0; // >= 0 y <25
		int acummedios = 0; // >=25 y <25
		int acumaltos = 0; // >= 250
		//primer numero
		String str = JOptionPane.showInputDialog("introduzca un numero");
		int num = Integer.parseInt(str);
		
		if(num < 0){ //si es negativo lo acumulo correctamente
			acumnegativos = acumnegativos +num;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
			if(num < 25){
				acumbajos += num;
			}
			else {
				if(num < 250) {
					acummedios += num;
				}
				else {
					acumaltos +=num;
				}
			}
		}
		//segundo numero
		str = JOptionPane.showInputDialog("introduzca un numero");
		num = Integer.parseInt(str);
				
		if(num < 0){ //si es negativo lo acumulo correctamente
					acumnegativos = acumnegativos +num;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
		if(num < 25){
			acumbajos += num;
		}
		else {
			if(num < 250) {
				acummedios += num;
				}
				else {
					acumaltos +=num;
				}
			}
		}
		//tercer numero
		str = JOptionPane.showInputDialog("introduzca un numero");
		num = Integer.parseInt(str);
				
		if(num < 0){ //si es negativo lo acumulo correctamente
			acumnegativos = acumnegativos +num;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
			if(num < 25){
				acumbajos += num;
			}
			else {
				if(num < 250) {
					acummedios += num;
				}
				else {
					acumaltos +=num;
				}
			}
		}
		//cuarto numero
		str = JOptionPane.showInputDialog("introduzca un numero");
		num = Integer.parseInt(str);
						
		if(num < 0){ //si es negativo lo acumulo correctamente
			acumnegativos = acumnegativos +num;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
			if(num < 25){
				acumbajos += num;
			}
			else {
				if(num < 250) {
					acummedios += num;
				}
				else {
					acumaltos +=num;
				}
			}
		}
		//quinto numero
		str = JOptionPane.showInputDialog("introduzca un numero");
		num = Integer.parseInt(str);
						
		if(num < 0){ //si es negativo lo acumulo correctamente
			acumnegativos = acumnegativos +num;
		}
		else { //no ponemos que el numero sea menor de cero por que ya esta comtemplado
			if(num < 25){
				acumbajos += num;
			}
			else {
				if(num < 250) {
					acummedios += num;
				}
				else {
					acumaltos +=num;
				}
			}
		}
		System.out.println("la suma de los numeros negativos es" + acumnegativos);
		System.out.println("la suma de los numeros bajos es" + acumbajos);
		System.out.println("la suma de los numeros medios es" + acummedios);
		System.out.println("la suma de los numeros altos es" + acumaltos);
	}

}
