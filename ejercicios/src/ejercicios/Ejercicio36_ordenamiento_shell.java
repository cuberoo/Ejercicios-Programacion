package ejercicios;

public class Ejercicio36_ordenamiento_shell {

	public static void main(String[] args) {
		int array[] = utils.obtenernumero(5, 0, 5);
		utils.mostrar_array(array);
		int salto;
		for (salto=array.length; salto != 0; salto/=2) {
			boolean cambio=true;
			while(cambio) {
				cambio=false;
				for (int i = salto; i < array.length; i++) {
					if(array[i - salto]>array[i]) {
						int aux;
						aux=array[i];
						array[i]=array[i-salto];
						array[i-salto]=aux;
						
					}
				}
			}
		}
		System.out.println();
		utils.mostrar_array(array);

	}

}
