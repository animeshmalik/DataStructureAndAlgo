package org.algo.problems;

public class ArrayAndSimpleQuery {

	public static void main(String[] args) {
		int[] numbers= {1 ,2, 3, 4, 5, 6, 7, 8};
		removeAndAddFront(numbers, 2, 4,2);
	}
	
	public static void removeAndAddFront(int[] numbers,int i,int j, int command){
        System.out.println("--------------");
        for(int q=0;q<numbers.length;q++){
            System.out.print(" "+numbers[q]);
        }
       
        System.out.println("i:"+i+" j:"+j);
        
        //split the array in 3 part
        int[] first=new int[i-1];
        int[] deleted=new int[j-i+1];
        int[] last=new int[numbers.length-j];
        int di=0;
        int li=0;
        for(int k=0;k<first.length;k++) {        	
        	first[k]=numbers[k];
        }
        for(int k=i-1;di<deleted.length;k++) {
        	
        	deleted[di++]=numbers[k];
        }
        for(int k=j;k<numbers.length;k++) {
        	
        	last[li++]=numbers[k];
        }
        if(command==1) {
        	//add deleted+first+last
        	for(int n=0;n<deleted.length;n++) {
        		numbers[n]=deleted[n];
        	}
        	for(int n=0;n<first.length;n++) {
        		numbers[n+deleted.length]=first[n];
        	}
        	/*for(int n=0;n<last.length;n++) {
        		numbers[n+deleted.length+first.length]=first[n];
        	}*/
        	
        }
        if(command==2) {
        	//add first+last+deleted
        	for(int n=0;n<first.length;n++) {
        		numbers[n]=first[n];
        	}
        	for(int n=0;n<last.length;n++) {
        		numbers[n+first.length]=last[n];
        	}
        	for(int n=0;n<deleted.length;n++) {
        		numbers[n+first.length+last.length]=deleted[n];
        	}
        	
        }
        
        for(int q=0;q<numbers.length;q++){
            System.out.print(" "+numbers[q]);
        }
        System.out.println();
        System.out.println("--------------");
    }
}
