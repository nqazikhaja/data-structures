package com.nizam.Testing;

import com.nizam.List.BasicLinkedList;

public class LinkedListTesting {

	
	public static void main(String[] args) {
		BasicLinkedList b = new BasicLinkedList<>();
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		b.add(10);
		b.printElements();
		
		System.out.println(b.contains(11));;
	}
}
