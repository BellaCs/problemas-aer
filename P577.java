package aceptaelreto;

import java.util.Scanner;


public class p577 {
	
	static Scanner s;
	
	public static void main(String args[]) {
		
		s = new Scanner(System.in);
		
		int casos = s.nextInt();
		
		for(int i = 0; i< casos;i++) {
			
			int min = s.nextInt();
			int max = s.nextInt();
			int total = s.nextInt();
			
			if(min + max < total) min = total - max;
			
			System.out.println(total - min + 1);
			
		}
		
	}

}
