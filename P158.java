package aceptaelreto;
import java.util.*;

public class P158 {

    static Scanner s;
    
    
    static void llegir(int[] n, int m){
        
        for(int i = 0; i < m; i++)
            n[i] = s.nextInt();     
    
    }
    
    static void cas(){
    
        int amunt = 0;
        int avall = 0;
        int[] m;
        
        int n = s.nextInt();
        
        m = new int[n];
        
        llegir(m,n);
        
        for(int i = 0; i < n -1;i++){
            
            if(m[i] < m[i+1])      
                amunt++;                
            else if(m[i] > m[i+1])
                avall++;
        
        }
        
        System.out.printf("%d %d\n",amunt,avall);
        
    }
    
    public static void main(String[] args) {
        s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i = 0; i<n; i++)cas();
        
    }
    
}
