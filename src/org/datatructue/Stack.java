package org.datatructue;

import java.lang.reflect.Array;

public class  Stack<T> {

	private final int DEFAULT_SIZE=50;
	private int top;
	private T[] elements;
	
	public Stack(Class<T> clazz){
		top=-1;
		final T[] e=(T[])Array.newInstance(clazz, DEFAULT_SIZE);
		this.elements=e;
	}
	public Stack(Class<T> clazz, int capacity) {
		top=-1;
		final T[] e=(T[])Array.newInstance(clazz, capacity);
		this.elements=e;
    }

	public void push(T element) {
		top++;
		if(top<elements.length) {
			elements[top]=element;
		}else {
			throw new RuntimeException("Stack is full");
		}
	}
	public T pop() {
		if(top<0) {
			throw new RuntimeException("stack is empty");
		}
		T data=elements[top];
		elements[top]=null;
		top--;
		return data;
	}
	public boolean isEmpty() {
		return top<0;
	}
	public T getTopValue() {
		return elements[top];
	}
}
