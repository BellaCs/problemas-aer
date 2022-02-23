package aceptaelreto;

import java.util.Scanner;

public class p538 {
	static Scanner s;
	
	public static void main (String args[]) {
		s = new Scanner(System.in);
		
		
		
		int abuelo,iglesia;
		
		while (true) {

			abuelo = s.nextInt();
			iglesia = s.nextInt();
			if(abuelo == 0 && iglesia == 0)break;
			
			
			
			
			
			
			System.out.println(abuelo < iglesia  ? "SENIL" : "CUERDO");
		}
		
		
	}

}
