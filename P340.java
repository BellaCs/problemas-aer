package aceptaelreto;
import java.util.*;
public class P340 {
	
    static Scanner s;
    
    static void cas(){
    
        int a,b,resp;
        
        a = s.nextInt();
        b = s.nextInt();
        
        resp = 4 + (a-1)*3 + (b-1)*3 + ((a-1)*(b-1))*2;
        
        System.out.println(resp);
        
    
    }
    
    public static void main(String[] args) {
        s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i = 0; i<n; i++) cas();
    }

}
