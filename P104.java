package aceptaelreto;
import java.util.*;

class movils {
	
    int pi,di,pd,dd;
    movils der, izq;
    
    movils(int pi,int di,int pd,int dd) {
        this.pi = pi; this.di = di; this.pd = pd; this.dd = dd;
    }
    
}

public class P104 {
	
	static Scanner s;
    
    static boolean equilibrio(movils m) {
        
        boolean izq = true;
        if (m.pi == 0) {
            
            m.izq = new movils(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
            izq = equilibrio(m.izq);
            m.pi = m.izq.pi + m.izq.pd;
            
        }
        
        boolean der = true;
        if (m.pd == 0) {
        
            m.der = new movils(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());        
            der = equilibrio(m.der);
            m.pd = m.der.pi + m.der.pd;
            
        }
        
        return (der && izq) && (m.pi * m.di == m.pd * m.dd); 
    }       
    
    static boolean cas() {
        
        movils m = new movils(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
         
               
        if (m.pi == 0 && m.pd == 0 && m.di == 0 && m.dd == 0) return false;
        
        System.out.println(equilibrio(m)? "SI" : "NO");
        return true;    
    }

    public static void main(String[] args) {
        s = new Scanner(System.in);

        while (cas());  
        
        s.close();
    }

}
