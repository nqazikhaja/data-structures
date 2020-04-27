package com.nizam.Testing;

public class Factorial {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.factorial(10));
	}
	
	public int factorial(int num) {
		if(num ==1)
			return 1;
		else
			return num* factorial(num-1);
		
	}
}
