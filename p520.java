package aceptaelreto;

import java.util.Scanner;
import java.util.ArrayList;

public class p520 {
	
	static Scanner s;
	
	static ArrayList<Integer> init(int nCubes){
		ArrayList<Integer> cubes = new ArrayList<Integer>();
		
		for(int i = 1; i<= nCubes;i++) {
			cubes.add(i);
		}
		
		return cubes;
	}
	
	public static void main(String args[]) {
		
		s = new Scanner(System.in);
		ArrayList<Integer> cubes;
		
		int ncubes,bol,cube1,cube2,aux;
		
		while(true) {
			
			ncubes = s.nextInt();
			bol = s.nextInt();
			if(ncubes == 0 && bol == 0)break;
			cubes = init(ncubes);
			while(true) {
				
				cube1 = s.nextInt();
				cube2 = s.nextInt();
				
				if(cube1 == 0 && cube2 == 0)break;
				
				
				aux = cubes.get(cube1-1);
				cubes.set(cube1-1, cubes.get(cube2-1));
				cubes.set(cube2-1, aux);
				
		
			}	
			System.out.println(cubes.indexOf(bol)+1);
		}
		
		
		
	}
	

}
