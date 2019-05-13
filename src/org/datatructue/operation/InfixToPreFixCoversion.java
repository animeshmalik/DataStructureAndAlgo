package org.datatructue.operation;

import org.datatructue.Stack;

/*
 * start reverse scaning
 * same as post fix
 * reverse the result
 * 
 */

public class InfixToPreFixCoversion {

	public static void main(String[] args) {
		String expression="a + b * c";
		System.out.println("prefix ="+ expression +" and preFix ="+convertInfixToPreFix(expression, " "));
		
		String expression1="( ( a * b ) + ( c * d ) ) - e";
		System.out.println("prefix ="+ expression1 +" and preFix ="+convertInfixToPreFix(expression1, " "));
	}
	public static String convertInfixToPreFix(String expession, String delimeter) {
		String result="";
		String[] exp=expession.split(delimeter);
		Stack<String> stack=new Stack<>(String.class);
		for(int i=exp.length-1;i>=0;i--) {
			if(exp[i].equals(")")) {   // opening paranthesis ... pushing into stack
				stack.push(exp[i]);
			}else if(exp[i].equals("(")) { // closing paranthesis ... need to pop all the operator util the opening paranthesis.
				while(!stack.isEmpty()&& !stack.getTopValue().equals(")")) {
					result=result+delimeter+stack.pop();
				}
				stack.pop(); // poping the oepning paranthesis also
			}
			else if(exp[i].equals("*")||exp[i].equals("/")||exp[i].equals("+")||exp[i].equals("-")) {  // if operator, 
				
				while(!stack.isEmpty() && !stack.getTopValue().equals(")") && stackOperator1HasHigherPrecendance(stack.getTopValue(), exp[i])) { // checking if top operator has lower precendance.
					result=result+delimeter+stack.pop(); // if lower, then poping 
					
				}
				stack.push(exp[i]);  // if higher preccendence then push the operator itself. Or push after all higher is popped.
			}else {
				result=result+delimeter+exp[i]; // operand just adding in expression.
			}
		}
		
		while(!stack.isEmpty()) {
			result=result+delimeter+stack.pop();
		}
		 StringBuilder input1 = new StringBuilder(); 
		input1.append(result);
		input1.reverse();
		return input1.toString();
	}
	
	public static boolean stackOperator1HasHigherPrecendance(String operator1, String operator2) {
		boolean res=true;
		
		if((operator1.equals("*") ||operator1.equals("/") )) {
			res=true;
		}else if(operator2.equals("*") || operator2.equals("/")) {
			res =false;
		}
		return res;
	}
}
