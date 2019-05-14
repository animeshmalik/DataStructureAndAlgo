package org.algo.StringArray;

/*
 * An array arr[0], arr[1], ....., arr[N-1] is called decreasing if arr[i] >= arr[i+1] for each i: 0 <= i < N-1
 * 
 * You are given a sequence of numbers arr[0], arr[1], …, arr[N – 1] and a positive integer K. 
 * In each operation, you may subtract K from any element of the array. You are required to find the minimum number of operations to make the given array decreasing.
 */
public class MakingDecreasingArray {

	// Function to count minimum no of operation 
    public static int min_noOf_operation(int arr[],  
                                      int n, int k) 
    { 
        int noOfSubtraction; 
        int res = 0; 
          
        for (int i = 1; i < n; i++) { 
            noOfSubtraction = 0; 
  
            if (arr[i] > arr[i - 1]) { 
      
                // Count how many times  
                // we have to subtract. 
                noOfSubtraction = (arr[i] - arr[i - 1]) / k; 
  
                // Check an additional subtraction  
                // is required or not. 
                if ((arr[i] - arr[i - 1]) % k != 0) 
                    noOfSubtraction++; 
  
                // Modify the value of arr[i] 
                arr[i] = arr[i] - k * noOfSubtraction; 
            } 
  
            // Count total no of subtraction 
            res = res + noOfSubtraction; 
        } 
  
        return res; 
    } 
    
    public static void main(String[] args) {
    	int[] arr = { 1, 1, 2, 3 }; 
        int N = 4; 
        int k = 5; 
        System.out.println(min_noOf_operation(arr, 
                                           N, k));  
	}
}
