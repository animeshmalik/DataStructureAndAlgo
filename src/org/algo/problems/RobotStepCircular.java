package org.algo.problems;

public class RobotStepCircular {

	public static boolean isCircular(char[] path) {
		
		int north = 0;
		int east =1;
		int south =2;
		int west =3;
		int direction = north;
		int x=0,y=0;
		
		for(int i=0;i<path.length;i++) {
			if(path[i]=='R') {
				direction=(direction+1)%4;  // if start point 0,0 -- directtion will be 1 EAST
			}else if(path[i]=='L') {
				direction=(4+direction-1)%4; // if start point 0,0 -- direction will be 3 WEST
			}else {// path G
				if(direction==0) {
					y++;
				}else if(direction==1) {
					x++;
				}else if(direction==2) {
					y--;
				}else { // direction 3
					x--;
				}
			}
		}
		return x==0&&y==0;
	}
	public static void main(String[] args) {
		String path_ = "GLGLGLG"; 
	    char path[] = path_.toCharArray(); 
	  
	    if (isCircular(path)) 
	      System.out.println("Given sequence" + 
	      " of moves is circular"); 
	    else
	      System.out.println("Given sequence" + 
	      " of moves is NOT circular"); 
	}
}
