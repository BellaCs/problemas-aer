package aceptaelreto;
import java.util.*;

public class P300 {
	static Scanner reader;   
    public static void main(String[] args){
        reader = new Scanner(System.in);
        int numCasos,i;
        numCasos = reader.nextInt();
        for( i=0 ; i < numCasos; i++){
            casDeProva();
        }
    }
    static void casDeProva(){
        String palabra;
        palabra = reader.next();
        int resultadoA = palabra.indexOf("a"); 
        int resultadoE = palabra.indexOf("e");
        int resultadoI = palabra.indexOf("i");
        int resultadoO = palabra.indexOf("o");
        int resultadoU = palabra.indexOf("u");
        if(resultadoA != -1 && resultadoE != -1 && resultadoI != -1 && resultadoO != -1 && resultadoU != -1){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
