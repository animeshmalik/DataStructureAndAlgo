package org.algo.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerBouquets {

	public static int flowerBougests(int p,int q, String s) {
		if(s==null ||s.isEmpty()) {
			return 0;
		}
		
		List<int[]> jobs=new ArrayList<>();
		String type1="000";
		for(int i=0;i<s.length()-2;i++) {
			if(s.substring(i, i+3).equals(type1)) {
				int[] j= {i,i+2,p};				
				jobs.add(j);
			}else {
				String x=s.substring(i, i+2);
				if(x.equals("01")||x.equals("10")) {
					int[] j= {i,i+1,q};				
					jobs.add(j);
				}
			}
		}
		
		if(jobs.isEmpty())
			return 0;
		
		return findMaxProfit(jobs);
	}
	
	public static int findMaxProfit(List<int[]> jobs) {
		List<Integer> tab=new ArrayList<>();
		for(int i=0;i<jobs.size();i++) {
			tab.add(jobs.get(i)[2]);
		}
		for(int i=0;i<jobs.size();i++) {
			for(int j=i+1;j<jobs.size();j++) {
				if(jobs.get(i)[1]<jobs.get(j)[0]) {
					int max=Math.max(tab.get(j),jobs.get(j)[2]+tab.get(i));
					tab.add(j, max);
				}
			}
		}
		int max=tab.get(0);
		for(int x=0;x<tab.size()-1;x++) {
			max=Math.max(max, tab.get(x));
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(flowerBougests(2,3,"0001000"));
	}
}
