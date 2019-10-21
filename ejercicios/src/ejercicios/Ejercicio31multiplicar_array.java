package ejercicios;


public class Ejercicio31multiplicar_array {

	public static void main(String[] args) {
		int array[]= utils.obtenernumero(150, 0, 100);
		int numusu = utils.obtenernumusuario("dame un numero");
		
		utils.mostrar_array(array);
	
		for (int i = 0; i < array.length; i++) {
			array[i] *= numusu;
			
		}
		
		utils.mostrar_array(array);
	}

}
