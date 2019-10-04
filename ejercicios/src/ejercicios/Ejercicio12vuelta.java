package ejercicios;

public class Ejercicio12vuelta {

	public static void main(String[] args) {
		int precio =6742;//67,42€
		int pago =100 ;//100€
		
		int cambio= pago-precio;
		
		//calculo la cantida de billetes de 100.00€
	System.out.println("devuelvo" +(cambio/10000)+ "billetes de 100.00€");
	cambio = cambio % 10000;
	
	//calculo la cantida de billetes de 50.00€
	System.out.println("devuelvo" +(cambio/5000)+ "billetes de 50.00€");
	cambio = cambio % 5000;
	
	//calculo la cantida de billetes de 20.00€
	System.out.println("devuelvo" +(cambio/2000)+ "billetes de 20.00€");
	cambio = cambio % 2000;
	
	//calculo la cantida de billetes de 10.00€
	System.out.println("devuelvo" +(cambio/1000)+ "billetes de 10.00€");
	cambio = cambio % 1000;
	
	//calculo la cantida de billetes de 5.00€
	System.out.println("devuelvo" +(cambio/500)+ "billetes de 5.00€");
	cambio = cambio % 500;
	
	//calculo la cantida de monedas de 2.00€
	System.out.println("devuelvo" +(cambio/200)+ "billetes de 2.00€");
	cambio = cambio % 200;
	
	//calculo la cantida de moneda de 1.00€
	System.out.println("devuelvo" +(cambio/100)+ "billetes de 1.00€");
	cambio = cambio % 100;
	
	//calculo la cantida de monedas de 0.50€
	System.out.println("devuelvo" +(cambio/50)+ "billetes de 0.50€");
	cambio = cambio % 50;
	
	//calculo la cantida de moneda de 0.20€
		System.out.println("devuelvo" +(cambio/20)+ "billetes de 0.20€");
		cambio = cambio % 20;

	}

}
