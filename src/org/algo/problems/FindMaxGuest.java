package org.algo.problems;

import java.util.Arrays;

public class FindMaxGuest {
	
	public static void findMaxGuests(int[] arrl,int[] exit) {
		Arrays.sort(arrl);
		Arrays.sort(exit);
		// guests_in indicates number of guests at a time 
	    int guests_in = 1, max_guests = 1, time = arrl[0]; 
	    int i = 1, j = 0; 
	  
	    // Similar to merge in merge sort to process 
	    // all events in sorted order 
	    while (i < arrl.length && j < exit.length) 
	    { 
	        // If next event in sorted order is arrival, 
	        // increment count of guests 
	        if (arrl[i] <= exit[j]) 
	        { 
	            guests_in++; 
	  
	            // Update max_guests if needed 
	            if (guests_in > max_guests) 
	            { 
	                max_guests = guests_in; 
	                time = arrl[i]; 
	            } 
	            i++; //increment index of arrival array 
	        } 
	        else // If event is exit, decrement count 
	        { // of guests. 
	            guests_in--; 
	            j++; 
	        } 
	    } 
		
		System.out.println(max_guests+" guests at "+time);
	}
	public static void main(String[] args) {
		int arrl[] = {1, 2, 10, 5, 5}; 
        int exit[] = {4, 5, 12, 9, 12}; 
        int n = arrl.length; 
        findMaxGuests(arrl, exit); 
	}

}
