package aceptaelreto;
import java.util.*;

public class P350 {
	
	static Scanner reader;

    public static void main(String[] args) {
        reader = new Scanner(System.in);
        while (casDeProva()) {
        }
    }
    static boolean casDeProva() {
        int segment1, segment2;
        float resultat;
        segment1 = reader.nextInt();
        segment2 = reader.nextInt();
        //sies0 = segment1 == 0 || segment2 == 0;
        if (segment1 == 0 && segment2 == 0) {
            return false;
        }
        resultat = segment1 * segment2 / 2f;
        System.out.printf("%.1f\n", resultat);
        return true;
    }

}
