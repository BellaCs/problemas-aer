package aceptaelreto;
import java.util.*;

public class P413 {
	
	static Scanner s;
	
	static void cas(){
	    
        int blanc,negre,total;
        
        blanc = s.nextInt();
        negre = s.nextInt();
        
        total = blanc*negre;
        
        if (total % 2 == 1) {
        
            blanc = total / 2 + 1;
            negre = total / 2;
        
        } else {
        
            negre = total / 2;
            blanc = total /2;
            
        }
        
        System.out.printf("%d %d\n",blanc,negre);
    
    }

        
    public static void main(String[] args) {
       s = new Scanner(System.in);
        int n;
        
        n = s.nextInt();
        
        for (int i = 0; i < n; i++){
        
            cas();
        
        }
    }

}
