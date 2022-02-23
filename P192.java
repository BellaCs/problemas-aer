package aceptaelreto;
import java.util.*;

public class P192 {

	static Scanner s;
	
	static void init(int i, int[] t) {
		if(i >= 20001 || t[i] == 1) return;
		
		t[i] = 1;
		init(i*3, t);
		init(i+5, t);
		
	}
	
	public static void main(String args[]) {
		
		s = new Scanner(System.in);
		
		int[] table = new int[20001];
		
		init(1, table);
		
		int n;
		
		n = s.nextInt();
		
		while(n != 0) {
			System.out.println(table[n] != 0 ? "SI" : "NO");
        	n = s.nextInt();
		}
		
	}
	
}
