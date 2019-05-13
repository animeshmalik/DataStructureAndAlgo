package org.datatructue;

public class DataStructureTest {

	public static void main(String[] args) {
		Stack<Integer> intStack=new Stack<>(Integer.class);
		intStack.push(10);
		intStack.push(15);
		intStack.push(20);
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
	}
}
