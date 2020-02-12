package tema6;

public class Ejerciciomath {

	public static void main(String[] args) {
//ejercicio 2 bloque math
		double x = 0;
		boolean terminado = false;
		while (!terminado) {
			x += 0.001;
			double y = Math.sqrt(x);
			double z = Math.log(x);

			if (Math.abs(y - z) > 0.001)
				;
			{
				terminado = true;
				System.out.println("sqrt:  " + y + "\n" + "log:  " + z +"\n");
			}

		}
//ejercicio 3 bloque math
		//PI();
		//hipotenusa();
		maximosLocales();
	}
	public static void PI() {
		double x1=0;
		float pares=0;
		double dividor=1;
		do {
			if(pares%2==0) {
				x1+=4/dividor;
			}
			else
				x1-=4/dividor;
			pares++;
			dividor+=2;
		}while(!(Math.abs(x1-Math.PI)<0.000001));
		System.out.println("mi numero PI es:  " + x1);
	
	}
	
	public static void hipotenusa() {
		//ejercicio 4 bloque math
		int x =4;
		int y =5;
		System.out.println("la hipotenusa de " + x + " y de " + y + " es: " + Math.hypot(x, y));
		
	}
	
	public static void maximosLocales() {
		double x =0;
		double y=0;
		double x1=1;
		double y2=2;
		
		for(int i =0; i<5; i++) {
			do {
				y2=x1;
				x1=y;
				y=x*Math.sin(x);
				x+=0.01;
			} while(!(x1>y&&x1>y2));
			
			System.out.println("y2:" + y2 + "\n" + "x1: " + x1 + "\n" + "y: " + y );
			
			System.out.println(x + "\n");
		}
	}
}
