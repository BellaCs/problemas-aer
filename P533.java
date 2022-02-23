package aceptaelreto;
import java.util.*;

public class P533 {
	
	static Scanner s;
	
	static void cas() {
		
		int k,n,count = 0;
		
		k = s.nextInt() * 8;
		n = s.nextInt();
		
		while(n != 0) {
			
			if(k > 0) {
				
				k -= n;
				count++;
				
			}
			
			n = s.nextInt();
			
		}
		
		System.out.println((k <= 0) ? count:"SIGAMOS RECICLANDO");
		
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++)cas();
		
	}

}
