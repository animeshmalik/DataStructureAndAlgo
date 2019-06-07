package org.algo.sorting;

public class InsertionSort {

	public static void sort(int[] array) {
		for(int i=1;i<array.length;i++) {
			int value=array[i]; // take the value and create the hole
			int hole=i; //mark the hole
			while(hole>0 && array[hole-1]>value) {
				//shift right
				array[hole]=array[hole-1];
				hole=hole-1;
			}
			array[hole]=value;
		}
	}

	public static void main(String[] args) {
		int a[]= {4,2,5,6,1,9,8,6};
		sort(a);
		for(int i:a)
			System.out.println(i);
	}
}
