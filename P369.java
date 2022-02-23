package aceptaelreto;
import java.util.*;

public class P369 {
	
	 static Scanner s;
	    
	    static boolean cas() {
	    
	        int i;
	        
	        i = s.nextInt();
	        
	    if (i == 0) 
	        return false;
	        
	    for (int n = 0; n<i; n++) 
	        System.out.print(1);
	    
	    System.out.println(); 
	    
	    return true;
	      
	    }
	    
	    public static void main(String[] args) {
	        s = new Scanner(System.in);
	        
	        while(cas());
	    }
	
}
