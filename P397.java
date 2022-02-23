package aceptaelreto;
import java.util.*;

public class P397 {
	
	static Scanner reader;
    public static void main(String[] args) {
        reader = new Scanner(System.in);
        int numCasos,i;
        numCasos = reader.nextInt();
        for(i=0;i<numCasos;i++){
            casDeProva();
        }
    }
    static void casDeProva(){
        long num;
        num = reader.nextLong();
         
        if(num%3 == 1){
            System.out.println("NO");
        }else{
            System.out.println("SI");
        }
      
    }

}
