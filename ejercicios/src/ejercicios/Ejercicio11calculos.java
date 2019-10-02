package ejercicios;

public class Ejercicio11calculos {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("escribe un numero del uno al tres");
		int num =	Integer.parseInt(str);
		
		switch(num){
			case 1://se realiza una division
				str = JOptionPane.showInputDialog("escribe cateto 1 :");
				num = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe cateto 2 :");
				int num1 = Integer.parseInt(str);
				hypo = math.sqrt (math.pow(num, 2) + math.pow(num1, 2));
				break;
			case 2:
				str = JOptionPane.showInputDialog("escribe un numero");
				num = Integer.parseInt(str);
				
				break;
			case 3:
				str = JOptionPane.showInputDialog("escribe un dividendo");
				int dividendo = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe un divisor");
				int divisor = Integer.parseInt(str);
				System.out.println("el conciente es " + (dividendo /(float)divisor));
				break;
			case 4 :
				break;
			case 5 :
				break;
			default:
				System.out.println("este numero no es valido");
		}


	}

}
