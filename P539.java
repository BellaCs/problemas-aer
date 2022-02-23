package aceptaelreto;
import java.util.*;

public class P539 {
    static boolean cas(){
        
        int decada,any;
        
        if(!s.hasNext())
            return false;
        
        decada = s.nextInt();
        any = s.nextInt();
        
        if(any%10 + 1 == 10){
        
            any = 0;
            System.out.println((decada%10 == any%10)? "FELIZ DECADA NUEVA":"TOCA ESPERAR");
            return true;
        }else{
            
        System.out.println((decada%10 == any%10+1)? "FELIZ DECADA NUEVA":"TOCA ESPERAR");
        return true;
        
        }
        
    }

    static Scanner s;
    public static void main(String[] args) {
        s = new Scanner(System.in);
        
        while(cas());
        
    }
}
