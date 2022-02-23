package aceptaelreto;
import java.util.*;

public class P337 {
static Scanner s;
    
    static String igual(int[] b, int[] d, int ig){
    
            boolean igual = true;
            int i = 1;
            int num;
            
            while(igual && i != 6){
                num = b[i] + d[i];
                if(num != ig)
                    igual = false;
                else
                    i++;
    
            }
            
            return igual ? "SI":"NO";
    
    }
    
    static void llegir(int[] n){
        
        for(int i = 0; i < 6; i++)
            n[i] = s.nextInt();     
    
    }
    
    static void cas(){
    
        int[] d,b;
        
        d = new int[6];
        b = new int[6];
        
        llegir(d);
        llegir(b);
        
        int ig = d[0]+ b[0];
        
        String resp = igual(d,b,ig);
        
        System.out.printf("%s\n",resp);
        
    }
    
    public static void main(String[] args) {
        s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i = 0; i<n; i++) cas();
        
    }
    
}
