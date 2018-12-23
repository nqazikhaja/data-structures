package com.nizam.Stack;

import java.util.ArrayList;
import java.util.List;

import com.nizam.Interfaces.MyStack;

public class BasicListStack<T> implements MyStack<T>{
	
	private List<T> data;
	private int counter;
	
	public BasicListStack(){
		
		data = new ArrayList<T>();
		counter=0;
	}

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		data.add(item);
		counter++;
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(counter==0) {
			throw new IllegalAccessError("No elements in the stack");
		}
		
		return data.remove(--counter);
	}

	@Override
	public boolean contains(T item) {
		// TODO Auto-generated method stub
		if(data.contains(item))
			return true;
		
		return false;
	}

	@Override
	public T access(T item) {
		// TODO Auto-generated method stub
		T x = pop();
		if(x==item) {
			return x;
		}
		
		return null;
	}

	@Override
	public int sizeOfStack() {
		// TODO Auto-generated method stub
		return counter;
	}

}
