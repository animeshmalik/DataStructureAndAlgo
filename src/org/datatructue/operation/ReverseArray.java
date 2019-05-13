package org.datatructue.operation;

import java.lang.reflect.Array;

public class ReverseArray<T> {

	public  T[] reverse(Class<T> clazz,T[] array, int length) {
		final T[] resultArr=(T[])Array.newInstance(clazz, length);
		int j=length;
		for(int i=0;i<length;i++) {
			resultArr[i]=array[j-i-1];
			//j--;
		}
		return resultArr;
	}
	public static void main(String[] args) 
    { 
        Integer [] arr = {10, 20, 30, 40, 50}; 
        ReverseArray<Integer> ri=new ReverseArray<>();
        Integer[] result=ri.reverse(Integer.class,arr, arr.length); 
        for(int i=0;i<result.length;i++) {
        	System.out.println(result[i]);
        }
    } 
}
