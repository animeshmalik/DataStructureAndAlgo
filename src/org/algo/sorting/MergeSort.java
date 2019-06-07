package org.algo.sorting;

public class MergeSort {

	public static void sort(int[] array) {
		int lenght=array.length;
		if(lenght==1) // single element in array. will be sorted always
			return;
		int mid=lenght/2;
		int[] left=new int[mid]; // split the array in two part
		int[] right= new int[lenght-mid]; //
		for(int i=0;i<mid;i++) { // copy the left part
			left[i]=array[i];
			
		}
		for(int i=mid;i<lenght;i++) { // copy the right part
			right[i-mid]=array[i];
			
		}
		sort(left); // sort the left
		sort(right); // sort the right
		merge(left, right, array); // merge left and right
	}
	
	public static void merge(int[] left,int[] right, int[] array) {
		int nl=left.length;
		int nr=right.length;
		int i=0,j=0,k=0;
		while(i<nl && j<nr) { // comparing the left with right and copy the smallest in merged array
			if(left[i]<=right[j]) { // if left is smallest. copy left to  merged array and increase left index
				array[k]=left[i];
				i++;
			}else { // if right is smallest. copy right to merged array and increase right index
				array[k]=right[j];
				j++;		
			}
			k++; // increase the index of merged array
		}
		
		while(i<nl) { // remaining element in left is copied to merged array
			array[k]=left[i];
			i++;
			k++;
		}
		
		while(j<nr) { // remaining element in right is copied to merged array
			array[k]=right[j];
			j++;
			k++;
					
		}
			
	}

	public static void main(String[] args) {
		int a[]= {4,2,5,6,1,9,8,6};
		sort(a);
		for(int i:a)
			System.out.println(i);
	}
}
