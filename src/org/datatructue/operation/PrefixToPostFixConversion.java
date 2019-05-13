package org.datatructue.operation;

import org.datatructue.Stack;

/*
 * 
 * Read the Prefix expression in reverse order (from right to left)
		If the symbol is an operand, then push it onto the Stack
		If the symbol is an operator, then pop two operands from the Stack
			Create a string by concatenating the two operands and the operator after them.
			string = operand1 + operand2 + operator
			And push the resultant string back to Stack
	Repeat the above steps until end of Prefix expression.
 */
public class PrefixToPostFixConversion {
	public static void main(String args[])  
	{ 
	    String pre_exp = "*-A/BC-/AKL"; 
	    System.out.println("Postfix : " + preToPost(pre_exp)); 
	    String pre_exp1 = "+a*bc"; 
	    System.out.println("Postfix : " + preToPost(pre_exp1)); 
	    
	    
	} 

	static boolean isOperator(char x)  
	{ 
	    switch (x)  
	    { 
	        case '+': 
	        case '-': 
	        case '/': 
	        case '*': 
	        return true; 
	    } 
	    return false; 
	} 
	
	static String preToPost(String pre_exp) {
		Stack<String> stack=new Stack<>(String.class);
		
		// length of expression 
	    int length = pre_exp.length(); 
	    
	    // reading from right to left 
	    for (int i = length - 1; i >= 0; i--)  
	    { 
	    	 // check if symbol is operator 
	        if (isOperator(pre_exp.charAt(i)))  
	        { 
	        	// pop two operands from stack 
	            String op1 = stack.pop(); 
	            String op2 = stack.pop();
	  
	            // concat the operands and operator 
	            String temp = op1 + op2 + pre_exp.charAt(i); 
	  
	            // Push String temp back to stack 
	            stack.push(temp); 
	        	
	        }
	     // if symbol is an operand 
	        else
	        { 
	            // push the operand to the stack 
	            stack.push( pre_exp.charAt(i)+""); 
	        } 
	    }
		return stack.pop();
	}
	
}
