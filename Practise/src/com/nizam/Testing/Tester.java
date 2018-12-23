package com.nizam.Testing;

import com.nizam.Interfaces.MyStack;
import com.nizam.Stack.BasicListStack;
import com.nizam.Stack.BasicStack;

public class Tester {

	public static void main(String[] args) {
		
		//Underlying an array
		MyStack my = new BasicStack(); 
		my.push(5);
		my.push(6);
		my.push(10);
		System.out.println(my.contains(10));
		System.out.println(my.sizeOfStack());
		
		
		//Underlying array List
		MyStack my1 = new BasicListStack();
		my1.push(10);
		my1.pop();
		System.out.println(my1.sizeOfStack());
		my1.push(88);
		my1.push(89);
		System.out.println(my1.sizeOfStack());
		System.out.println(my1.contains(88));
		my1.pop();
		my1.pop();
		my1.pop();
		
		//Have to do linked list
		
	}
		
}
