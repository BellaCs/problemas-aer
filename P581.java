package aceptaelreto;

import java.util.Scanner;
import java.util.ArrayList;

public class p581 {
	static Scanner s;
	
	
	
	static void cas() {
		
		int nAmigos = s.nextInt();
		int cuenta = s.nextInt();
		ArrayList<Integer> amigos = init(nAmigos);
		
		System.out.println(trobar(amigos, cuenta));
				
	}
		
	
	
	static int trobar(ArrayList<Integer> nums, int cuenta) {
      		
      	int cuentaFirst = cuenta;
		
			if(nums.size() == 1)  return 1;
			else if(cuenta == 1)  return nums.size();
			else {
				while(nums.size() > 1) {
					int index = cuentaFirst%nums.size() -1;
					if(index == -1) index = nums.size() -1;
					nums.remove(index);
                  	cuentaFirst = cuenta + index;
				}
              	
				return nums.get(0);
			}	
	}
	
	static ArrayList<Integer> init(int nA) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 1;i <= nA;i++) {
			nums.add(i);
		}
		
		return nums;
	}
	
	public static void main(String args[]) {
		s = new Scanner(System.in);
		
		int casos = s.nextInt();
		
		for(int i = 0;i< casos;i++) {
			
			cas();
			
		}
		
		s.close();
	}

}
