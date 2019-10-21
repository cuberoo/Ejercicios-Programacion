package ejercicios;

public class Ejercicio32rotacion {

	public static void main(String[] args) {
		int array[]= utils.obtenernumero(5, 0, 5);
		utils.mostrar_array(array);
		int aux= array[array.length -1];
		
		for (int i = array.length-1; i > 0; i--) {
			array[i]= array[i-1];
		}
		array[0]=aux;
		utils.mostrar_array(array);
	}

}
