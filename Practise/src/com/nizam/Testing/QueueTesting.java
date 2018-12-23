package com.nizam.Testing;

import com.nizam.Queue.BasicQueue;

public class QueueTesting {

	public static void main(String[] args) {
		BasicQueue b = new BasicQueue();
		b.enQueue(5);
		b.enQueue(6);
		b.enQueue(7);
		
		b.printQueue();
		
		 System.out.println(b.contains(7));
		System.out.println( b.access(10));
		
	}
}
