package aceptaelreto;
import java.util.*;

public class P148 {
	
	static Scanner s;
	
	static int dia = 1440;
	
	static boolean cas(){
		
		String hora;
		int total;
	
		hora = s.nextLine();
		
		if(hora.equals("00:00"))return false;
		
		total = Integer.parseInt(hora.substring(0,2)) * 60 + Integer.parseInt(hora.substring(3,5));
		
		System.out.println(dia - total);
		
		return true;
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		while(cas());
		
		s.close();
		
	}

}
