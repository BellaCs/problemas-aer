package aceptaelreto;
import java.util.*;
public class P293 {
    static void cas(){
        
        int in,ar,cru,esc,an,res;
        
        in = s.nextInt();
        ar = s.nextInt();
        cru = s.nextInt();
        esc = s.nextInt();
        an = s.nextInt();
        
        res = in*6 + ar*8 + cru*10 + esc*(an*2);
    
        
        System.out.println(res);
    }

    static Scanner s;
    
    public static void main(String[] args) {
        s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i = 0; i<n; i++)cas();
        
        
    }
}
