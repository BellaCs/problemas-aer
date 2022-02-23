package aceptaelreto;
import java.util.*;

public class P380 {
	
	static Scanner s;
	
	static boolean cas() {
		
		int n = s.nextInt();
				
		if(n == 0) return false;
		
		long total = 0;
		
		for(int i = 0; i<n;i++) total += s.nextInt();
		
		System.out.println(total);
		
		return true;
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		while(cas());
		
	}

}
