package ejercicios;

public class Ejercicio32rotacionusuario {

	public static void main(String[] args) {
		int array[] = utils.obtenernumero(5, 0, 5);
		utils.mostrar_array(array);
		int aux = array[array.length - 1];
		int direccion = utils
				.obtenernumusuario("escribe direccion\n" + "\n0- ciclo a la derecha" + "\n1- ciclo izquierda");
		int numciclos = utils.obtenernumusuario("escribe numero");

		for (int i = 0; i < numciclos; i++) {
			switch (direccion) {
			case 0: // derecha

				for (int j = array.length - 1; j > 0; j--) {
					array[j] = array[j - 1];
				}
				array[0] = aux;
				utils.mostrar_array(array);
				break;
			case 1: // izquierda
				aux = array[0];
				for (int j = 0; j < array.length; j++) {
					array[j] = array[j + 1];
				}
				array[array.length - 1] = aux;
				break;
			}
			utils.mostrar_array(array);

		}
	}

}
