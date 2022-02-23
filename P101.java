package aceptaelreto;
import java.util.*;

public class P101 {
	
    static Scanner s;
    
    static boolean diagonales(int[][] c, int cm) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = c.length -1, j = 0; i >= 0; i--, j++) {
            
            diagonal1 += c[i][j];
            diagonal2 += c[j][i];
        
        }
        
        return (diagonal1 == cm && diagonal2 == cm);
    
    }

    static int sumacolumna(int i, int[][] c) {

        int cm = 0;

        for (int[] c1 : c) {
            cm += c1[i];
        }

        return cm;

    }

    static int sumafila(int i, int[][] c) {

        int cm = 0;

        for (int p = 0; p < c.length; p++) {

            cm += c[i][p];

        }

        return cm;

    }

    static int lateralespar(int[][] c) {

        int cm2 = 0;
        cm2 += c[0][c.length / 2]; //arriba
        cm2 += c[0][(c.length / 2) - 1];

        cm2 += c[c.length / 2][0]; //derecha
        cm2 += c[(c.length / 2) - 1][0];

        cm2 += c[c.length - 1][c.length / 2]; //abajo
        cm2 += c[c.length - 1][(c.length / 2) - 1];

        cm2 += c[c.length / 2][c.length - 1]; //izquierda
        cm2 += c[(c.length / 2) - 1][c.length - 1];

        return cm2;

    }

    static int centropar(int[][] c) {

        int cm2 = 0;

        cm2 += c[c.length / 2][c.length / 2];  //arriba derecha      
        cm2 += c[c.length / 2][(c.length / 2) - 1]; //arriba izquierda
        cm2 += c[(c.length / 2) - 1][c.length / 2]; //abajo derecha
        cm2 += c[(c.length / 2) - 1][(c.length / 2) - 1]; //abajo izquierda

        return cm2;

    }

    static int lateralesimpar(int[][] c) {

        int cm2 = 0;
        cm2 += c[0][c.length / 2]; //arriba
        cm2 += c[c.length / 2][0]; //izquierda
        cm2 += c[c.length / 2][c.length - 1]; //derecha
        cm2 += c[c.length - 1][c.length / 2]; //abajo

        return cm2;

    }

    static int esquinas(int[][] c) {

        int cm2 = 0;

        cm2 += c[0][0]; //arriba izquierda
        cm2 += c[0][c.length - 1]; //arriba derecha
        cm2 += c[c.length - 1][0]; //abajo izquierda
        cm2 += c[c.length - 1][c.length - 1]; //abajo derecha

        return cm2;

    }

    static int constantemagica(int[][] c) {

        int cm = 0;

        for (int[] c1 : c) {
            cm += c1[1];
        }

        return cm;

    }

    static boolean casDeProva() {

        boolean esoterico;
        boolean diabolico;
        int[][] c;
        int[] rep;
        int nums, cm, cm2, numero;

        nums = s.nextInt();

        if (nums == 0) {

            return false;

        } else {

            c = new int[nums][nums];
            rep = new int[nums * nums];

            esoterico = true;
            diabolico = true;

            for (int i = 0; i < nums; i++) {

                for (int o = 0; o < nums; o++) {

                    numero = s.nextInt();

                    c[i][o] = numero;

                    if (numero > (nums * nums) || rep[numero - 1] == 1) {

                        esoterico = false;

                    } else if (numero <= (nums * nums)) {

                        rep[numero - 1] = 1;

                    }

                }

            }

            cm = constantemagica(c);
            cm2 = (4 * cm) / nums;

            for (int i = 0; i < c.length; i++) {

                if (sumafila(i, c) != cm) {

                    diabolico = false;
                    break;

                }

                if (sumacolumna(i, c) != cm) {

                    diabolico = false;
                    break;

                }

            }
            if (diabolico && !diagonales(c, cm))
                diabolico = false;

            if (diabolico && esoterico) {

                if (cm2 != esquinas(c)) {

                    diabolico = false;
                } else {

                    if (nums % 2 == 1) {

                        if (c[c.length / 2][c.length / 2] * 4 != cm2) {

                            esoterico = false;

                        } else {

                            if (lateralesimpar(c) != cm2) {
                                esoterico = false;
                            }

                        }

                    } else if (nums % 2 == 0) {

                        if (centropar(c) != cm2) {

                            esoterico = false;

                        } else {

                            if (lateralespar(c) != (cm2 * 2)) {
                                esoterico = false;
                            }

                        }

                    }

                }

            }

            if (diabolico && esoterico) {
                System.out.println("ESOTERICO");
            } else if (diabolico) {
                System.out.println("DIABOLICO");
            } else {
                System.out.println("NO");
            }

            return true;
        }
    }

    public static void main(String[] args) {

        s = new Scanner(System.in);

        while (casDeProva());
    }

}
