package com.nizam.Testing;

import java.util.Scanner;

public class IntExchange {

	public static void main(String[] args) {
		// declaring variables
		int x = 0;
		int y = 0;
		int temp = 0;
		// creating scanner to read values from user through keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value for X");
		x = scanner.nextInt();
		System.out.println("Enter value for Y");
		y = scanner.nextInt();
		// storing the value in temp variable and swapping x and y values.
		temp = x;
		x = y;
		y = temp;
		System.out.println("The value for X is " + x + " and Y is " + y);

	}
}
