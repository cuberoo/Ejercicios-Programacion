package ejercicios;

public class Ejercicionumeromil {

	public static void main(String[] args) {
		int suma=0;
		int media=0;
		int mayor=0;
		int menor=0;
		
		for (int i=0;i>1000;i++) {
			int numero = (int) Math.round(Math.random()*1000);
			suma=numero+suma;
			if(i==0) {
				numero=mayor;
				numero=menor;
			}
			else {
				
			}
		}
	}

}
