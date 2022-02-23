package aceptaelreto;
import java.util.*;

public class P102 {
	
    static Scanner s;

    static int calcularvocals(String d) {

        int vocals = 0;
        char v;
        d = d.toLowerCase();

        for (int i = 0; i < d.length(); i++) {
            if (Character.isLetter(d.charAt(i))) {
                v = d.charAt(i);
                if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                    vocals++;
                }

            }

        }

        return vocals;
    }

    static String desencriptar(int d, String c) {

        String decript = "";
        int valor;
        char r, nueva;

        for (int i = 1; i < c.length(); i++) {

            r = Character.toLowerCase(c.charAt(i));

            if (Character.isLetter(r)) {
                valor = r + d;
                if (valor < 97) {

                    valor = 123 - (97 - valor);

                } else if (valor > 122) {

                    valor = 96 + (valor - 122);

                }

                nueva = (char) valor;
                if (Character.isUpperCase(c.charAt(i))) {
                    nueva = Character.toUpperCase(nueva);
                }

                decript += nueva;
            } else {

                decript += r;

            }

        }

        return decript;
    }

    static int desplazamiento(char p) {

        int der, izq;
        p = Character.toLowerCase(p);

        izq = (p < 'p')
                ? -((p - 'a') + (123 - 'p'))
                : -(p - 'p');
        der = (p > 'p')
                ? -(('z' - p) + ('p' - 96))
                : ('p' - p);

        return (Math.abs(izq) <= der) ? der : izq;
    }

    static boolean casDeProva() {
        String c;
        String decript;
        int desp, dec;

        c = s.nextLine();

        desp = desplazamiento(c.charAt(0));

        decript = desencriptar(desp, c);
        

        if (decript.equals("FIN")) {

            return false;
        } else {
            
            dec = calcularvocals(decript);
            System.out.println(dec);

            return true;
        }
    }

    public static void main(String[] args) {
        s = new Scanner(System.in);
        while (casDeProva());
        s.close();
    }


}
