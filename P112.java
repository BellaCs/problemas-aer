package aceptaelreto;
import java.util.*;

public class P112 {
	
	static Scanner s;
	
	static boolean cas() {
		
		
		float tram; // metros
		float vel;  // km/h
		float temps; // segundos
		double velkm;
		
		tram = s.nextInt();
		vel = s.nextInt();
		temps = s.nextInt();
		
		if(tram == 0 && vel == 0 && temps == 0)return false;
		
		tram /= 1000;
		temps /= 3600;
		
		velkm = tram/temps;
		
		if(tram <= 0 || vel <= 0 || temps <= 0) System.out.print("ERROR\n");
		else if(velkm > vel*1.2) System.out.print("PUNTOS\n");
		else if (velkm > vel) System.out.print("MULTA\n");
		else System.out.print("OK\n");
		
		return true;
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		while(cas());		
		
		s.close();
	}

}
