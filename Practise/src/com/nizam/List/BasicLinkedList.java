package com.nizam.List;

public class BasicLinkedList<X> {

	private Node head;
	private Node tail;
	private int counter;

	public BasicLinkedList() {
		head = tail = null;
		counter = 0;

	}

	// Method for size of Linked List
	public int size() {
		return counter;
	}

//Method to add a New Node at the end	
	public void add(X item) {
		if (size() == 0) {
			head = new Node(item);
			tail = head;
		} else {
			Node newLastNode = new Node(item);
			tail.setNextNode(newLastNode);
			tail = newLastNode;
		}
		counter++;
	}

//Method to remove the first node 
	public X remove() {
		X itemRemoved = null;
		if (size() == 0)
			throw new IllegalAccessError("List is empty");
		else {
			itemRemoved = (X) head.getData();
			head = head.getNextNode();
			counter--;

		}
		return itemRemoved;
	}

//Method to traverse through Linked List and print elements
	public void printElements() {
		Node tempNode = head;
		while (tempNode.nextNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.nextNode;
		}
		System.out.println(tempNode.data);
	}

//Method to check an element in the linked list
	public boolean contains(X item) {
		boolean result = false;
		Node tempNode = head;
		while (tempNode.nextNode != null) {
			if (tempNode.data == item)
				result = true;
			tempNode = tempNode.nextNode;
		}
		if (tempNode.nextNode == null) {
			if (tempNode.data == item)
				result = true;
		}

		return result;
	}

}
