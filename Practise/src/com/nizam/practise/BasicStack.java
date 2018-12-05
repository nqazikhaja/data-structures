package com.nizam.practise;

public class BasicStack<x> {

	private x[] data;
	private int counter;

	@SuppressWarnings("unchecked")
	public BasicStack() {
		data = (x[]) new Object[1000];
		counter = 0;
	}

	// Method to add data onto stack
	public void push(x newItem) {
		data[counter] = newItem;
		counter++;

	}

	public void printElements() {

		while (counter > 0) {

			System.out.println("why this is null? " + data[counter - 1]);
			counter--;
		}
		if (counter == 0) {
			System.out.println("There are no elements in the stack");
		}
	}

	public static void main(String[] args) {
		BasicStack<Integer> stk = new BasicStack<Integer>();
		// stk.printElements();
		stk.push(6);
		stk.printElements();
	}
}
