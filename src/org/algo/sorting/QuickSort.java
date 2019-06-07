package org.algo.sorting;

public class QuickSort {

	public static void sort(int[] array,int startIndex,int endIndex) {
		if(startIndex<endIndex) { // base exit condition
			int pivotIndex=partition(array, startIndex, endIndex);
			sort(array, startIndex, pivotIndex-1);
			sort(array, pivotIndex+1, endIndex);
		}
	}
	
	public static int partition(int[] array, int startIndex,int endIndex) {
		int pivot=array[endIndex];
		int pivotIndex=startIndex;
		for(int i=startIndex;i<endIndex;i++ ) { // moving all small element than pivot to left and larger element right to pivot
			if(array[i]<=pivot) {
				// swap array[i], array[pivotiIndex]
				int temp=array[i];
				array[i]=array[pivotIndex];
				array[pivotIndex]=temp;
				pivotIndex++;
				
			}
		}
		//swap the pivot( index index) to pivotIndex
		int temp=array[pivotIndex];
		array[pivotIndex]=pivot;
		array[endIndex]=temp;
		return pivotIndex;
	}
	
	public static void main(String[] args) {
		int a[]= {4,2,5,6,1,9,8,6};
		sort(a,0,a.length-1);
		for(int i:a)
			System.out.println(i);
	}
}
