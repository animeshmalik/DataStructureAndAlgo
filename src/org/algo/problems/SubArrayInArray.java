package org.algo.problems;

public class SubArrayInArray {

	public static boolean isSubarray(int[] array,int[] subarray) {
		boolean ret=false;
		int i=0,j=0;
		while(i<array.length&&j<subarray.length) { // traverse the both arrya same time
			if(array[i]==subarray[j]) {// if elements are same increase i and j for checking the next element
				i++;
				j++;
				if(j==subarray.length) { // if subarray reached to last element return
					return true;
				}
			}else {// if elements are not equals reset the index of subarray and compare with array's next elements
				j=0;
				i++;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int[] s= {4,5};
		System.err.println(isSubarray(a, s));
	}
}
