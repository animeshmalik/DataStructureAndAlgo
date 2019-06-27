package org.algo.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/*
 * let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }. The intervals {1,3} and {2,4} overlap with each other,
 *  so they should be merged and become {1, 4}. Similarly {5, 7} and {6, 8} should be merged and become {5, 8}
 *
 1. Sort the intervals based on increasing order of 
    starting time.
2. Push the first interval on to a stack.
3. For each interval do the following
   a. If the current interval does not overlap with the stack 
       top, push it.
   b. If the current interval overlaps with stack top and ending
       time of current interval is more than that of stack top, 
       update stack top with the ending  time of current interval.
4. At the end stack contains the merged intervals. 
 */
public class MergeOverlappingIntervals {
	
	public static void mergeIntervals(Interval arr[])  {
		 // Test if the given set has at least one interval  
        if (arr.length <= 0)  
            return;  

        // Create an empty stack of intervals  
        Stack<Interval> stack=new Stack<>();
        
        // sort the intervals in increasing order of start time  
/*        Arrays.sort(arr,new Comparator<Interval>() {
        	@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.start-o2.start;
			}
		});*/
        
        Arrays.sort(arr,(o1,o2)-> {
				return o1.start-o2.start;
			}
		);
        
     // push the first interval to stack  
        stack.push(arr[0]); 
        
        // Start from the next interval and merge if necessary  
        for(int i=1;i<arr.length;i++) {
        	Interval top=stack.peek();
        	if(top.end<arr[i].start) {
        		stack.push(arr[i]);
        	}else if(top.end<arr[i].end) {
        		top.end=arr[i].end;
        		stack.pop();
        		stack.push(top);
        	}
        }
        
     // Print contents of stack  
        System.out.print("The Merged Intervals are: "); 
        while (!stack.isEmpty())  
        {  
            Interval t = stack.pop();  
            System.out.print("["+t.start+","+t.end+"] "); 
        }   
	}
	
	public static void main(String[] args) {
		Interval arr[]=new Interval[5]; 
        arr[0]=new Interval(6,8); 
        arr[1]=new Interval(1,9); 
        arr[2]=new Interval(2,4); 
        arr[3]=new Interval(4,7); 
        arr[4]=new Interval(10,20);
        mergeIntervals(arr);
	}

}

class Interval 
{ 
    int start,end; 
    Interval(int start, int end) 
    { 
        this.start=start; 
        this.end=end; 
    } 
} 