package ejercicios;

public class Ejercicio24_array {

	public static void main(String[] args) {
		int numero[] = new int [5];
		int suma=0;
		int media=0;
		int mayor=0;
		int menor=0;
		
	for(int i =0; i< numero.length;i++) {
		numero[i]= (int) Math.round(Math.random()*100);
		suma += numero[i];
		media= (int) ((float) suma/numero[i]);
		if(i == 0) {
			mayor= numero [i];
			menor= numero [i];
		}
		else {
			if(menor>numero[i]) {
				menor=numero[i];
			}
			if(mayor<numero[i]) {
					mayor=numero[i];
				
			}
		}
		System.out.println(numero[i]);
	}
		System.out.println("la suma de los numeros es "+ suma);
		System.out.println("la media de los numeros es " + media);
		System.out.println("el numero mayor es "+ mayor);
		System.out.println("el numero menor es "+ menor);
	}

}
