package org.datatructue.operation;

import org.datatructue.Stack;

/*
 * create stack
 * scan exp right to left
 * 		if exp[i] is operand
 * 			push (exp[i])
 * 		else if exp[i] is operator
 * 			operand1=pop()
 * 			operand2=pop()
 * 			result <-- perfomer (exp[i], operand1, operand2)
 * 			push (result)
 * repeat
 * return top of the stack
 * 
 */
public class PrefixEvalution {

	public static void main(String[] args) {
		String exp="-,+,*,2,3,*,5,4,9";
		evalutePrefix(exp, ",");
	}
	
	public static void evalutePrefix(String expression,String delimeter) {
		String[] eList=expression.split(delimeter);
		String[] elements=new ReverseArray<String>().reverse(String.class,eList,eList.length);
		Stack<String> stack=new Stack<>(String.class);
		for(int i=0;i<elements.length;i++) {
			if(elements[i].equals("*")||elements[i].equals("/")||elements[i].equals("+")||elements[i].equals("-")) {
				String op1=stack.pop();
				String op2=stack.pop();
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
