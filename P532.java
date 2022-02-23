package aceptaelreto;
import java.util.*;

public class P532 {

	static Scanner s;
	
	static void cas() {
		
		int n1 = s.nextInt(),
		n2 = s.nextInt();
		
		System.out.println(n2 - n1);	
		
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i< n; i++)cas();	
	
	}
	
}
