package aceptaelreto;

import java.util.Scanner;

public class p186 {

	static Scanner s;
	
	public static void main (String args[]) {
		s = new Scanner(System.in);
		
		int[] teams;
		
		int team,nteams,nglob,winner;
		
		while (true) {

			nteams = s.nextInt();
			nglob = s.nextInt();
			if(nteams == 0 && nglob == 0)break;
			teams = init(nteams);
			
			for(int i = 0;i < nglob;i++) {
				
				team = s.nextInt();
				s.next();
				
				teams[team-1]++;
				
			}
			
			winner = getMax(teams);
			
			System.out.println(winner == 0 ? "EMPATE" : winner);
		}
		
		
	}
	
	static int getMax(int scores[]){
    	int maxValue = scores[0];
    	int index = 0;
    	boolean tie = false;
    	for(int i=1;i<scores.length;i++){
    		if(scores[i] > maxValue){
    			maxValue = scores[i];
    			index = i;
    			tie = false;
    		}else if(scores[i] == maxValue){
  				tie = true;    			
    		}
    	}
    	if(tie) return 0;
    	return index+1;
    }
	
	static int[] init(int team) {
		int[] teams = new int[team];
		
		for(int i = 0; i < team; i++) {
			teams[i] = 0;
		}
		
		return teams;
	}
}
