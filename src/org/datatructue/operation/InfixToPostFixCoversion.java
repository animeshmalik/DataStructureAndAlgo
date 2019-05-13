package org.datatructue.operation;

import org.datatructue.Stack;


/*
 * create stack
 * result
 * scan expressions from left to right
 * 		if epx is operand
 * `		result <-- result + exp[i]
 * 		else if exp is operator
 * 			while (not empty stack && StackOperatorHasHigherPreccedenceThanExpOperator)
 * 				result <-- result+stack.pop()
 * 			stack.push(exp[i])
 *		once all done pop all the element and add to result
 *
 *
 *with parenthesis
 *----------------------
 * create stack
 * result
 * scan expressions from left to right
 * 		if( exp is opening parenthesis)
 * 			push (exp[i])
 * 		else if closing parenthesis
 * 			pop all the element in stack until opening perenthesis as below
 * 			while ( not empty stack && !stack.getTopValue().equals("(")
 * 				result <--result+ stack.pop();
 * 			pop the opening parenthesis
 * 		else if epx is operand
 * `		result <-- result + exp[i]
 * 		else if exp is operator
 * 			while (not empty stack && StackOperatorHasHigherPreccedenceThanExpOperator && !stack.getTopValue().equals("("))
 * 				result <-- result+stack.pop()
 * 			stack.push(exp[i])
 * repeat 
 *once all done pop all the element and add to result
 * 
 */

public class InfixToPostFixCoversion {

	public static void main(String[] args) {
		String expression="a + b * c * x - d * e";
		System.out.println("Infix ="+ expression +" and postFix ="+convertInfixToPostFix(expression, " "));
		
		String expressionP="( ( a + b * c ) * d - e ) * f";
		//String expressionP="( ( a + b ) - c )";
		System.out.println("Infix ="+ expressionP +" and postFix ="+convertInfixToPostFix(expressionP, " "));
		
		String expressionX="( ( a + b ) * c - d ) * e";
		//String expressionP="( ( a + b ) - c )";
		System.out.println("Infix ="+ expressionX +" and postFix ="+convertInfixToPostFix(expressionX, " "));
		String expressionY="a * ( b + c )";
		//String expressionP="( ( a + b ) - c )";
		System.out.println("Infix ="+ expressionY +" and postFix ="+convertInfixToPostFix(expressionY, " "));
		String expressionZ="a + b * c";
		System.out.println("Infix ="+ expressionZ +" and postFix ="+convertInfixToPostFix(expressionZ, " "));
	}
	
	public static String convertInfixToPostFix(String expession, String delimeter) {
		String result="";
		String[] exp=expession.split(delimeter);
		Stack<String> stack=new Stack<>(String.class);
		for(int i=0;i<exp.length;i++) {
			if(exp[i].equals("(")) {   // opening paranthesis ... pushing into stack
				stack.push(exp[i]);
			}else if(exp[i].equals(")")) { // closing paranthesis ... need to pop all the operator util the opening paranthesis.
				while(!stack.isEmpty()&& !stack.getTopValue().equals("(")) {
					result=result+delimeter+stack.pop();
				}
				stack.pop(); // poping the oepning paranthesis also
			}
			else if(exp[i].equals("*")||exp[i].equals("/")||exp[i].equals("+")||exp[i].equals("-")) {  // if operator, 
				
				while(!stack.isEmpty() && !stack.getTopValue().equals("(") && stackOperator1HasHigherPrecendance(stack.getTopValue(), exp[i])) { // checking if top operator has higher preccendence.
					result=result+delimeter+stack.pop(); // if lower, then poping 
					
				}
				stack.push(exp[i]);  // if epx operator higher preccendence then push the operator itself. Or push after all higher is popped.
			}else {
				result=result+delimeter+exp[i]; // operand just adding in expression.
			}
		}
		
		while(!stack.isEmpty()) {
			result=result+delimeter+stack.pop();
		}
		
		return result;
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
