package aceptaelreto;
import java.util.*;


public class P154 {

    static Scanner s;

    static boolean cas() {

        char c1, c2, c3;
        String l, r;
        int n;

        n = s.nextInt();
        l = s.next();

        if (n == 9999 && l.equals("ZZZ")) {
            return false;
        }

        if (n == 9999) {

            c3 = l.charAt(2);

            if (c3 == 'Z') {

                c2 = l.charAt(1);

                if (c2 == 'Z') {

                    c1 = l.charAt(0);                   

                    c1++;

                    if (c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U') {
                        c1++;
                    }

                    r = c1 + "BB" ;

                    System.out.printf("0000 %s\n", r);

                    

                } else {

                    c2++;

                    if (c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U') {
                        c2++;
                    }

                    r = l.substring(0, 1) + c2 + 'B';

                    System.out.printf("0000 %s\n", r);

                }

            } else {

                c3++;

                if (c3 == 'E' || c3 == 'I' || c3 == 'O' || c3 == 'U') {
                    c3++;
                }

                r = l.substring(0, 2) + c3;

                System.out.printf("0000 %s\n", r);

            }

        } else {

            System.out.printf("%04d %s\n", n + 1, l);

        }

        return true;

    }

    public static void main(String[] args) {

        s = new Scanner(System.in);

        while (cas());

    }
	
}
