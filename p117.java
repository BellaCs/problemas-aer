package aceptaelreto;

import java.util.*;


public class p117 {
	
	static void cas() {
		
		String saludo = s.nextLine();
		
		String[] p = saludo.split(" ");
		
		System.out.println("Hola, "+p[1]+".");
		
	}
	
	static Scanner s;
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		String num = s.nextLine();
		
		int n = Integer.parseInt(num);
		
		for(int i = 0; i<n; i++)cas();	
	}

}
