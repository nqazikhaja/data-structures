package com.nizam.Queue;

public class BasicQueue<X> {

	private X[] data;
	private int front;
	private int end;

	public BasicQueue() {
		data = (X[]) new Object[1000];
		front = -1;
		end = -1;

	}
	//Method to check the size
	public int size() {
		if (front == -1 & end == -1) {
			return 0;
		} else {
			return (end - front) + 1;
		}

	}

	// Method to add a new element
	public void enQueue(X item) {

		if ((end + 1) % data.length == front)
			throw new IllegalAccessError("Queue is full. Please resize");

		if (size() == 0) {
			front++;
			end++;
			data[end] = item;

		} else {
			end++;
			data[end] = item;
		}
		System.out.println(item + " added to Queue");

	}
	
	
	//Method to delete element in Queue
	public X deQueue() {
		X item = null;
		if (size() == 0)
			throw new IllegalAccessError("Queue is Empty");
		else {
			System.out.println(data[front]);
			item = data[front];
			data[front] = null;
			front++;
		}
		System.out.println("deleting..." + item + " from the Queue");
		return item;

	}
	
	//Method to check the element in the Queue
	public boolean contains(X item) {
		for (int i = front; i <= end; i++) {
			if (data[i] == item) {
				return true;
			}
		}
		return false;
	}
	
	//Method to access elements
	public X access(int position) {
		X newItem =null;
		for(int i = front; i<=end;i++) {
			if(i==position) {
				newItem= data[i];
				return newItem;
			}
		}
		
		throw new IllegalAccessError("Please check the position, it might not be correct");
	}

	//Method to print the elements in the Queue
	public void printQueue() {
		for (int i = front; i <= end; i++) {
			System.out.println("data in the Queue is .. " + data[i]);
		}
	}
}
