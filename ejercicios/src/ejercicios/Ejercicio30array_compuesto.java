package ejercicios;

public class Ejercicio30array_compuesto {

	public static void main(String[] args) {
		int primerarray[]= utils.obtenernumero(150, 0, 100);
		int segunrarray[]= utils.obtenernumero(150, 0, 100);
		int tercerrarray[]= new int[150];
		
		utils.mostrar_array(primerarray);
		utils.mostrar_array(segunrarray);
		
		for (int i = 0; i < tercerrarray.length; i++) {
			if(i%2==0) {
				tercerrarray[i]=primerarray[i];
			}
			else {
				tercerrarray[i]=segunrarray[i];
			}
		}
	}

}
