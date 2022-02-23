package aceptaelreto;
import java.util.*;

public class P234 {
	
	static Scanner s;
	
	static long sumaArray(long[] n, int m, long v) {
		
		Arrays.sort(n);
		int left = 0;
		int right = m - 1;
		int resp = 0;
		
		while(left < right) {
			
			if(n[left] + n[right] >= v) {
				
				right--;
				resp++;				
			}
			left++;
			
		}
		
		return resp;
	}
	
	static void llegir(long[] n, long m){
        
        for(int i = 0; i < m; i++)
            n[i] = s.nextLong();     
    
    }
	
	static void cas() {
		
		int n;
		long v;
		long[] piles;
		
		n = s.nextInt();
		
		v = s.nextLong();
		
		piles = new long[n];
		
		llegir(piles, n);
		
		
		
		System.out.println(sumaArray(piles, n,v));		
		
		
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 0; i <n; i++) cas();
		
	}

}


