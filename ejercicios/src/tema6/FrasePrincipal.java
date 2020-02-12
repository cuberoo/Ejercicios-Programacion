package tema6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FrasePrincipal {

	public static void main(String[] args) {
		try {
			FraseConBombilla();
		} catch (EspaciosException e ) {
			System.out.println( e.getMessage());
		}
		catch( MinimoDePalabrasException e) {
			System.out.println(e.getMessage());
		}
		catch(NoEstaBombilla e) {
			System.out.println(e.getMessage());
		}
		catch(InsultosException e) {
			System.out.println(e.getMessage());
		}

	}
	
	private static String FraseConBombilla() throws EspaciosException, MinimoDePalabrasException, NoEstaBombilla, InsultosException {
		
		String frase = JOptionPane.showInputDialog("introduzca una frase con la palabra bombilla");
		
		if(frase.trim().equals("")) {
			throw new EspaciosException("esta frase no tiene ninguna palabra");
		}
		String palabras[] = frase.split(" [ ]{1, }");
		if (palabras.length<3) {
			throw new MinimoDePalabrasException("Es necesario mas de 3 plabras");
	}
		if(frase.toUpperCase().indexOf("BOMBILLA") == 1){
			throw new NoEstaBombilla("no esta la palabra bombilla");
		}
		String insultos[]= new String [] {"tonto","tonta","idiota"};
		for(String insulto: insultos) {
			if(frase.toUpperCase().indexOf(insulto) == 1) {
				throw new InsultosException("no hay que insultar");
			}
		}
		
		
		return frase;
	}
}
