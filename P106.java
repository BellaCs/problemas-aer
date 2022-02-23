package aceptaelreto;
import java.util.*;

public class P106 {
	
	 static Scanner reader;

	    public static void main(String[] args) {
	        reader = new Scanner(System.in);
	        while (cas());
	    }

	    static boolean cas() {
	        String num, pais13;
	        boolean correct;
	        int n;
	        num = reader.nextLine();
	        n = num.length();

	        if (num.equals("0")) {
	            return false;
	        } else {
	            if (n < 14) {
	                correct = correcte(num, n);
	                if (correct) {
	                    if (n > 8) {
	                        if (n < 13) pais13 = "EEUU";
	                        else pais13 = pais(num);
	                        System.out.println("SI " + pais13);

	                        return true;
	                    } else {

	                        System.out.println("SI");
	                        return true;
	                    }
	                } else {
	                    System.out.println("NO");
	                    return true;
	                }
	            } else {
	            
	                System.out.println("NO");
	                return true;
	                
	            }
	        }
	    }

	    static String pais(String n) {
	        String codigo;

	        codigo = n.substring(0, 3);

	        if (codigo.equals("380")) {
	            return "Bulgaria";
	        } else if (codigo.equals("539")) {
	            return "Irlanda";
	        } else if (codigo.equals("560")) {
	            return "Portugal";
	        } else if (codigo.equals("759")) {
	            return "Venezuela";
	        } else if (codigo.equals("850")) {
	            return "Cuba";
	        } else if (codigo.equals("890")) {
	            return "India";
	        } else {

	            codigo = n.substring(0, 2);
	            if (codigo.equals("50")) {
	                return "Inglaterra";
	            } else if (codigo.equals("70")) {
	                return "Noruega";
	            } else if (codigo.charAt(0) == '0') {
	                return "EEUU";
	            }

	        }

	        return "Desconocido";

	    }

	    static boolean correcte(String s, int n) {

	        int t;
	        int suma = 0;
	        int cont = 0;

	        for (int i = n - 2; i >= 0; i--) {
	            t = Integer.parseInt("" + s.charAt(i));
	            if (cont == 0) {

	                suma += t * 3;
	                cont = 1;

	            } else {

	                suma += t;
	                cont = 0;

	            }

	        }
	        int control = Integer.parseInt("" + s.charAt(n - 1));

	        return ((suma + control) % 10 == 0);
	    }

}
