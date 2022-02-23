package aceptaelreto;

import java.util.Scanner;

public class p164 {
	static Scanner s;
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);

        int bIzq, bDer, aIzq, aDer;
        int base, altura;

        while (true) {

            bIzq = s.nextInt();
            aIzq = s.nextInt();
            bDer = s.nextInt();
            aDer = s.nextInt();

            base   = bDer - bIzq;
            altura = aDer - aIzq;

            if (base < 0 || altura < 0) break;
            System.out.println( base * altura );
        }

		
		
	}

}
