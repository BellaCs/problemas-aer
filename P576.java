package aceptaelreto;

import java.util.Scanner;

public class p576 {
	static Scanner s;
	
	public static void main(String args[]) {
		
		s = new Scanner(System.in);
		
		int sec = s.nextInt();
		while(sec != 0) {
			
			int numDef = 0;
			
			int defPag = s.nextInt();
			
			while(defPag != 0) {
				numDef += defPag;
				defPag = s.nextInt();
			}
			
			int tempsTotal = numDef * sec;
			
			int h = tempsTotal/3600;
			tempsTotal %= 3600;
			int min = tempsTotal/60;
			int segons = tempsTotal % 60;
			
			String hores = h<10 ? "0"+h : h+"";
			String minuts = min<10 ? "0"+min : min+"";
			String seg = segons<10 ? "0"+segons : segons+"";
			
			System.out.println(hores+":"+minuts+":"+seg);
			sec = s.nextInt();
		}
		
	}
	

}
