package org.algo.sorting;

public class BubbleSort {
	
	public static void sort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					//swap
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		int a[]= {4,2,5,6,1,9,8,6};
		sort(a);
		for(int i:a)
			System.out.println(i);
	}
}
