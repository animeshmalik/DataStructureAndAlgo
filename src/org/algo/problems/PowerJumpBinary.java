package org.algo.problems;

public class PowerJumpBinary {

	public static int powerJump(String game) {
		char lastValue=game.charAt(game.length()-1);
		int currentPowJump=0,minPowJump=0;
		int currentIdex=0;
		
		for(int i=0;i<game.length();i++) {
			if(game.charAt(i)==lastValue) {
				currentPowJump=i+1;
				currentIdex=i;
				minPowJump=currentPowJump;
				break;
			}
			
		}
		for(int i=currentIdex+1;i<game.length();i++) {
			if(game.charAt(i)==lastValue) {
				currentPowJump=i-currentIdex;
				currentIdex=i;
				minPowJump=Math.max(currentPowJump, minPowJump);
				
			}
		}
		
	return minPowJump;	
	}
	
	public static void main(String[] args) {
		String game="01010010";
		System.err.println(powerJump(game));
	}
}
