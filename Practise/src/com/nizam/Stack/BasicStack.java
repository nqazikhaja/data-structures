package com.nizam.Stack;

import com.nizam.Interfaces.MyStack;

public class BasicStack<T> implements MyStack<T>{
	
	private T[] data;
	private int counter;
	
	public BasicStack() {
		data = (T[]) new Object[3];
		counter=0;
	}

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		data[counter++]=item;
		
	}

	@Override
	public T pop() {
		
		// TODO Auto-generated method stub
		return data[--counter];
	}

	@Override
	public boolean contains(T item) {
		// TODO Auto-generated method stub
		for(int i =0;i<counter;i++) {
			if(data[i]==item) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T access(T item) {
		// TODO Auto-generated method stub
		T x = pop();
		if(x==item) {
			return x;
		}
		return (T) new IllegalAccessError("Element not found");
	}

	@Override
	public int sizeOfStack() {
		// TODO Auto-generated method stub
		return counter;
	}
}

	

