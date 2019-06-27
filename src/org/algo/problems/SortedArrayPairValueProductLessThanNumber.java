package org.algo.problems;

public class SortedArrayPairValueProductLessThanNumber {

	public static int getFirstValue(int[] array,int number) {
		int ret=-1;
		//int mid=array.length/2;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]*array[i+1]>number) {
				return i;
			}
		}
		
		return ret;
	}
	public static void main(String[] args) {
		int [] array= {1,2,3,4,5,6,7,8,9,10,11,12};
		int number=7;
		int i=getFirstValueB(array, number);
		System.out.println("pair :"+ array[i-1]+" ,"+array[i]);
	}
	
	public static int getFirstValueB(int[] array,int number) {
		int ret=-1;
		int low=0;
		int high=array.length-1;
		/*for(int i=0;i<array.length-1;i++) {
			if(array[i]*array[i+1]>number) {
				return i;
			}
		}*/
		
		while(low<=high) {
			 int mid = (low + high) / 2;
			if(array[mid]*array[mid]>number && array[mid]*array[mid-1]<=number) {
				ret=mid;
				break;
			}
			//search in right
			if(array[mid]*array[mid]<=number) {
				low=mid+1;
			}
			else if(array[mid]*array[mid]>number) {
				high=mid-1;
			}
		}
		
		return ret;
	}
}
