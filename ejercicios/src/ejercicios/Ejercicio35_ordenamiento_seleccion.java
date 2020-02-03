package ejercicios;

public class Ejercicio35_ordenamiento_seleccion {

	public static void main(String[] args) {
		int[] array = utils.obtenernumero(5, 0, 5);
		utils.mostrar_array(array);
		int auxiliar = 0;
		int j;
		
		for (int i = 0; i < array.length; i++) {
			auxiliar = array[i];
			// se guada en auxiliar el numero donde estamos
			for (j = i+1; j < array.length - 1; j++) {
				if (array[j] < array[auxiliar]) {
					auxiliar=j;
					// comparamos si el numero de auxiliar es el mas bajo
				}	
			}
			
			int vector=array[i];
			array[i]=array[auxiliar];
			array[auxiliar]=vector; 
		}
		System.out.println();
		utils.mostrar_array(array);
	}
	

}
