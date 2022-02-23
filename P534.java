package aceptaelreto;
import java.util.*;

public class P534 {

	static Scanner s;
	
	static int calculardistancia(int[] p, int n) {
		
		int dis = 0;
		
		
		for(int i = 0; i < n; i++) {
			
			if(p[i+1]-p[i] > dis) {
				
				dis = p[i+1] - p[i];
				
			}
			i++;
		}
		
		return dis;
	}
	
	static boolean cas() {
		
		int n = s.nextInt();
		
		if(n==0)return false;
		
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++)p[i]=s.nextInt();
		
		Arrays.sort(p);
		
		System.out.println(calculardistancia(p,n));
		
		return true;
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		while(cas());
		
	}
	
}
