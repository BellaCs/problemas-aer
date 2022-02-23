package aceptaelreto;

import java.util.Scanner;

public class p435 {
	
	static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int[] repNums = new int[10];
		
		
		
		while(s.hasNext()) {
			init(repNums);
			
			String[] nums = s.nextLine().split("");
			for(String num : nums) {
				try{
				
					int numr = Integer.parseInt(num);
					repNums[numr]++;
				
				} catch (Exception e) {
				
				}
			}
			
			System.out.println(subnormal(repNums) ? "subnormal" : "no subnormal" );
			
		}
		
	}
	
	static boolean subnormal(int[] nums){
    	int value = nums[0];
    	boolean subnormal = true;
    	for(int i=1;i<nums.length;i++){
    		if(nums[i] != value){
    			subnormal = false;
    			break;
    		}
    	}
    	return subnormal;
    }
	
	static void init(int[] repNums) {
		
		for(int i = 0;i<10;i++) {
			repNums[i] = 0;
		}
		
	}
	
}
