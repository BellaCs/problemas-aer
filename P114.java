package aceptaelreto;
import java.util.*;


public class P114 {
	
	static void cas() {
		
		int fact = 1;
		int n;
		
		n = s.nextInt();
		
		if(n < 5) {
		
			for(int i = n; i>0; i--) {
			
				fact *= i;
			
			} 
		
			System.out.println(fact%10);
			
		}else {
			
			System.out.println(0);
			
		}
		
	}

	static Scanner s;
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) cas();
		
	}
	
}
