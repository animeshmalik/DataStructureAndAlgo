package org.datatructue.operation;

import org.datatructue.Stack;

/*
 * 
 * Create Stack
 * scan exp from left to right
 * 		if(exp[i] is operand)
 * 			push(exp[i]
 * 		else if( exp[i] is operator)
 * 			operand2=pop()
 * 			operand1 = pop()
 * 			result<-- performed(exp[i],operand1,operand2)
 * 			push (result)
 * repeat
 * return the top of the stack
 * 
 */
public class PostFixEvaluation {

	public static void main(String[] args) {
		
		String exp="2,3,*,5,4,*,+,9,-";
		evalutePostfix(exp, ",");
		
		String exp1="1 2 3 4 * * + 5 6 * -";
		String exp2="1 2 3 * 4 * + 5 6 * -";
		evalutePostfix(exp1, " ");
		evalutePostfix(exp2, " ");
		
	}
	
	public static void evalutePostfix(String expression, String delimeter) {
		
		String[] elements=expression.split(delimeter);
		Stack<String> stack=new Stack<>(String.class);
		for(int i=0;i<elements.length;i++) {
			if(elements[i].equals("*")||elements[i].equals("/")||elements[i].equals("+")||elements[i].equals("-")) {
				String op2=stack.pop();
				String op1=stack.pop();
				String result=performOperation(elements[i], op1, op2);
				stack.push(result);
			}else {
				stack.push(elements[i]);				
			
			}
		}
		System.out.println(stack.pop());
	}
	
	public static String performOperation(String operator,String operand1,String operand2) {
	//	String result=null;
		int op1=Integer.parseInt(operand1);
		int op2=Integer.parseInt(operand2);
		 if (operator.equals("+"))
	        {
	            return String.valueOf(op1 + op2);
	        }
	        else if (operator.equals("-"))
	        {
	            return String.valueOf(op1 - op2);
	        }
	        else if (operator.equals("*"))
	        {
	            return String.valueOf(op1 * op2);
	        }
	        else if (operator.equals("/"))
	        {
	            return String.valueOf(op1 / op2);
	        }
	        else
	        {
	            throw new RuntimeException("invalid operator");
	        }
	//	return result;
	}
	
}
