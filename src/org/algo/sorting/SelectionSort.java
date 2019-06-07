package org.algo.sorting;

public class SelectionSort {
	
	public static void sort(int[] array) {
		int lenght=array.length;
		for(int i=0;i<lenght-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<lenght;j++) {
				if(array[j]<array[minIndex]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {// swap
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
