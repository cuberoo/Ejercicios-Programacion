package ejercicios;

public class Ejercicio33_ordenamiento_burbuja {

	public static void main(String[] args) {
		int array[]=utils.obtenernumero(5, 0, 5);
		utils.mostrar_array(array);
		int contador=1;
		for (int i = 0 ; i < array.length -1 || i< array[i]-contador; i++) {
			int aux =array[i];
			if(array[i]>array[i+1]) {
				array[i]=array[i+1];
				array[i+1] = aux;
			}
			
			contador++;
			
		}
		System.out.println(" ");
		utils.mostrar_array(array);

	}

}
