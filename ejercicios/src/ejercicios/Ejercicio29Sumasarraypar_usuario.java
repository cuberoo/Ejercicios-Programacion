package ejercicios;

public class Ejercicio29Sumasarraypar_usuario {

	public static void main(String[] args) {
		int[] array = utils.obtenernumero(150, 0, 100);
		utils.mostrar_array(array);
		int sumapar=0;
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
				sumapar += array[i];
				}
		}
		System.out.println("\nla suma de los numeros pares es " + sumapar);
		
	}

}
