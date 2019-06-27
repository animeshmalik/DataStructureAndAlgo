package org.algo.problems;

public class MaxStreakEmployee {

	public static int maxStreak(int noOfEmployee, String[] attendance) {
		int currentStrek=0, maxStreak=0;	
		boolean fullAttendance=true;
		for(int i=0;i<attendance.length;i++) {
			fullAttendance=true;
			for(int j=0;j<noOfEmployee;j++) {
				if(attendance[i].charAt(j)!='Y') {
					fullAttendance=false;
					break;
				}
			}
			
			if(fullAttendance) {
				currentStrek=currentStrek+1;
			}else {
				currentStrek=0;
			}
			maxStreak=Math.max(currentStrek, maxStreak);
		}
		
		return maxStreak;
	}
	public static void main(String[] args) {
		String[] s= {"YYY", "YYY", "YNN", "YYN", "YYN","YYY"};
		System.out.println(maxStreak(3, s));
	}
}
