package com.nizam.Interfaces;

public interface MyStack<T> {
	
	public void push(T item);
	public T pop();
	public boolean contains(T item);
	public T access(T item);
	public int sizeOfStack();

}
