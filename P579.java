package aceptaelreto;

import java.util.Scanner;

public class p579 {
	
	static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
    
       while(prova()){
        }
    }
    
    static boolean prova(){
  
        int casos = lector.nextInt();
        int prio[] = new int[casos];
        int durada[] = new int[casos];
        
        if(casos == 0){
            return false;
        }
        for (int i = 0; i < casos; i++) {
           prio[i] = lector.nextInt();
           durada[i]=	lector.nextInt();
        }
        for (int i = 0; i < casos; i++) {
          int index = getMax(prio, durada);
          
            System.out.println(prio[index]+" "+durada[index]);
            prio[index] = 0;
            durada[index] = 0; 
        }
  
        System.out.println("---");
        return true;
    }
    static int getMax(int[] prio , int durada[]){
    	int maxValue = prio[0];
    	int index = 0;
    	for(int i=1;i<prio.length;i++){
    		if(prio[i] > maxValue){
    			maxValue = prio[i];
    			index = i;
    		}else if(prio[i] == maxValue){
    			if(durada[i] < durada[index]){
    				index = i;
    			}
    		}
    	}
    	return index;
    }

}
