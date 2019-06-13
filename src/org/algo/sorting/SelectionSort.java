package org.algo.sorting;

public class SelectionSort {
	
	public static void sort(int[] array) {
		int lenght=array.length;
		for(int i=0;i<lenght-1;i++) { // loop n times
			int minIndex=i; // first select the first index as index of Min
			for(int j=i+1;j<lenght;j++) {
				if(array[j]<array[minIndex]) { // finding the next min index
					minIndex=j;
				}
			}
			if(minIndex!=i) {// swap if got new minIndex
				int temp=array[i];
				array[i]=array[minIndex];
				array[minIndex]=temp;
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
