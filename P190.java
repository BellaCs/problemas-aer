package aceptaelreto;
import java.util.*;

public class P190 {
static Scanner lector;
    
    static boolean cas(){
        long j, i;
        j = 1;
       
        long num1 = lector.nextLong();
        long num2 = lector.nextLong();
        if (num2 > num1) 
          return false;
               
        
        for (i = num2 +1 ; i <= num1; i++ ){
            j *= i;
        }
        
        System.out.println(j);
        return true;
    }

    public static void main(String[] args) {
       lector = new Scanner(System.in);
       
       while(cas());
        
       lector.close();
        
    }
}
