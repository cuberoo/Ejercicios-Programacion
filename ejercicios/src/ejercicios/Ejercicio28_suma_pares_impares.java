package ejercicios;

public class Ejercicio28_suma_pares_impares {

	public static void main(String[] args) {
		int[] array = utils.obtenernumero(150, 0, 100);
		utils.mostrar_array(array);
		int sumapar=0;
		int sumaimpar=0;
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
				sumapar += array[i];
				}
			else {
				sumaimpar += array[i];
			}
		}
		System.out.println("\nla suma de los numeros pares es " + sumapar);
		System.out.println("la suma de los numeros impares es " + sumaimpar);
	}

}
