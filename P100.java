package aceptaelreto;
import java.util.*;

public class P100 {
	static Scanner s;
    
    static int ordenaASC(int n){
    
        int digito = 0;
        int auxiliar = 0;
        int ordenado = 0;
        
        for(int i = 0; i <= 9; i++){
            
            auxiliar = n;
            
            while(auxiliar > 0) {
            
                digito = auxiliar % 10;
                
                if(digito == i) {
                
                    ordenado = (ordenado * 10) + digito;
                                        
                }
                
                auxiliar /= 10;
            
            }
            
        }
        
        return ordenado;
        
    }
    
    static int ordenaDSC(int n) {
        
        
        int digito = 0;
        int auxiliar = 0;
        int ordenado = 0;
        
        for(int i = 9; i >= 0; i--) {
        
            auxiliar = n;
            
            while (auxiliar > 0) {
                        
                digito = auxiliar % 10;

                if (digito == i) {
                    
                    ordenado = (ordenado * 10) + digito;
                    
                }
                
                auxiliar /= 10;
                
            }
            
        }
        
        return ordenado;
    }
    
    public static void main(String[] args) {
       
        s = new Scanner(System.in);
       
       
        int casos, num, iteraciones, k, x, y;
       
       
        casos = s.nextInt();
       
        for(int i = 0; i<casos; i++){
           
            iteraciones = 1;
           
            num = s.nextInt();
           
            if (num == 6174){
               
                iteraciones = 0;
               
            } else if(num == 0){
               
                iteraciones = 8;
           
            } else {
               
                while(num < 1000) {
                   
                    num *= 10;
                   
                }
               
                y = ordenaASC(num);
                x = ordenaDSC(num);
                
                k = x - y;
                
                if (k == 0){
                    
                    iteraciones = 8;
                    
                } else {
                
                    while (k != 6174 && iteraciones <8) {
                        
                        iteraciones++;
                    
                        x = ordenaDSC(k);
                        
                        while (x < 1000) {
                            
                            x *= 10;
                            
                        }
                        
                        y = ordenaASC(k);
                        
                        k = x - y;
                                                       
                    }                    
                }                      
            }
            
            System.out.println(iteraciones);
            
        }      
    
        s.close();
    
    }
}
