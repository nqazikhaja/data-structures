package com.nizam.Testing;

public class Factorial {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.factorial(10));
		System.out.println(factorialRecursive(10));
	}

	// factorial Iterative - way 1
	public int factorial(int num) {
		if (num == 1)
			return 1;
		else
			return num * factorial(num - 1);

	}

	// factorial iterative - way 2
	public static int fact(int n) {
		int fact = 1;

		while (n != 1) {
			fact = fact * n;
			n = n - 1;
		}
		return fact;
	}

	// n factorial recursive
	/* Recursion : A method calling itself until a break condition is met */
	public static int factorialRecursive(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorialRecursive(n - 1);
	}

}
