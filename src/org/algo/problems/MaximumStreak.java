package org.algo.problems;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 
 * Apart from the silver coins, the country also issues gold coins which can be used as any value. With the given silver and gold coins, find out the maximum continous denomination streak you can achieve.

For example, if you have 4 silver coins of value 2, 3, 5 and 9 and 1 gold coin. You can have a maximum streak of 4 coins by using the gold coin as value 4.

Input format :

The first line contains 2 integers, S and G. S is the number of silver coins you have and G is the number of gold coins you have. S lines follow, each line is the value of the corresponding silver coin

Output format :

One integer, representing the maximum streak you can have using the coin.

Sample Input 1 :

4 1 2 3 5 7

Sample Output 1:

4

Explanation:

The sequence is 2, 3, 4 and 5. The value of the gold coin is 4.

Sample Input 2:

7 3 1 9 5 7 3 4 10

Sample Output 2:

10

Explanation:

The sequence is 1, 2, 3, 4, 5, 6, 7, 8, 9 and 10. The value of gold coins are 2, 6, 8.
 */
public class MaximumStreak {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scanner = new Scanner(System.in);
	    
	        int sCoinCount = scanner.nextInt();
	        int gCoinCount = scanner.nextInt();
	        int[] sCoins=new int[sCoinCount];
	        for(int i=0;i<sCoinCount;i++){
	            sCoins[i]=scanner.nextInt();
	        }
	        scanner.close();
	        Arrays.sort(sCoins);
	        System.out.print(getMaxContinousStrek(0,gCoinCount,sCoins));
	        
	        
	        /*//fraud
	        int[] a= {2,3 ,4 ,2 ,3 ,6 ,8 ,4, 5};
	        int d=5;
	        activityNotifications(a, d); */
	    }
	     public static int getMaxContinousStrek(int startIndex,int gN, int[] s ){
	        if(startIndex==s.length){
	            return 1;
	        }
	        int c=1;
	        int gCount=gN;
	        for(int i=startIndex;i<s.length-1;i++){
	            if(s[i]+1==s[i+1]){
	                c++;
	            }else{
	         // add gold
	                if(gCount>0){
	                  for(int g=1;g<=gN;g++){
	                     if(s[i]+g+1==s[i+1]){
	                        c=c+g+1;
	                        gCount=gCount-g;
	                         break;
	                        
	                    }
	                    
	                 }  
	                }else{
	                    break;
	                }
	                
	            }
	        }
	         c=c+gCount;
	        int cNext=getMaxContinousStrek(startIndex+1,gN,s);
	     return c>cNext  ?c: cNext;
	    }
	     
	     
	     static int activityNotifications(int[] expenditure, int d) {
	         
	    	    int n=0;
	    	    int[] firstD= new int[expenditure.length];
	    	    for(int i=0;i<expenditure.length;i++) {
	    	    	firstD[i]=expenditure[i];
	    	    }
	    	    Arrays.sort(firstD);
	    	    for(int i=d;i<expenditure.length;i++){
	    	    	int m=firstD[i/2];
	    	    	if(expenditure[i]>=(m*2)){
	    	            n++;
	    	        }
	    	    }
	    	    
	    	   System.out.println(n);
	    	    return n;
	    	    }
}
