package aceptaelreto;
import java.util.*;

public class P105 {
	
	static Scanner s;
	
	static String calcularmenor(float[] d, String[] menor){
		
		String m = menor[0];
		float min = d[0];
		boolean empate = false;
		
		for (int i = 1; i < 6; i++){
				
			if (d[i] < min) {
				min = d[i];
				m = menor[i];
				empate = false;
			} else if (d[i] == min){
				
				empate = true;
					
			}
				
		}  
		
		return (empate)? "EMPATE":m;
		
	}
	
	static String calcularmayor(float[] d, String[] mayor){
		
		String m = mayor[0];
		float max = d[0];
		boolean empate = false;
		
		
		for (int i = 1; i < 6; i++){
			
			if (d[i] > max) {
				max = d[i];
				m = mayor[i];
				empate = false;
			} else if (d[i] == max){
				
				empate = true;
				
			}
			
		}
		
		return (empate)? "EMPATE":m;
		
	}
	
	static float calcularmitjana(float[] d) {
		
		float total = 0;
		
		for (int i = 0; i < 6; i++) {
			
			total += d[i];
			
		}
		
		return total/6;
		
	}
	
	static boolean cas() {
		
		String[] dia = {"MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};
		float[] d = new float[6];
		String M,m,mitj;
		float media;
		
		d[0] = s.nextFloat();
		
		if (d[0] == -1)return false;
		
		for (int i = 1; i < 6;i++)
			d[i] = s.nextFloat();
		
		M = calcularmayor(d, dia);
		m = calcularmenor(d, dia);
		media = calcularmitjana(d);
		
		mitj = (d[5] > media) ? "SI":"NO";
		
		System.out.printf("%s %s %s\n",M,m,mitj);	
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		while(cas());
		
		s.close();		
		
	}

}
