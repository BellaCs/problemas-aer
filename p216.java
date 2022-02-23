package aceptaelreto;
import java.util.*;

public class p216 {
	
	static void casdeprova() {
		
		int gotes;
		
		gotes = s.nextInt();
		
		int h,m,s;
		String resp;
		
		h = gotes /3600;
		gotes  %= 3600;
		m = gotes / 60;
		gotes %= 60;
		s = gotes;
		
		
		resp = h >= 10 
				? h + ":"
				: "0" + h + ":";
		
		resp += m >= 10 
				? m + ":"
				: "0" + m + ":";
		
		resp += s >= 10 
				? s
				: "0" + s;
		
		System.out.println(resp);
	}
	
	static Scanner s;
	
	public static void main(String args[]) {
		
		s = new Scanner(System.in);
		
		int casos;
		
		casos = s.nextInt();
		
		for(int n = 0; n < casos; n++)casdeprova();
		
	}

}
