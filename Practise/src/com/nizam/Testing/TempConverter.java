package com.nizam.Testing;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		// declaring variables to store celsius and farenheit
		double celsius = 0;
		double farenheit = 0;
		//creating scanner to read input from Keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temperature in celsius: ");
		// reading and parsing the value to double
		celsius = Double.parseDouble(scanner.nextLine());
		farenheit = (celsius * 9.0 / 5.0) + 32;
		System.out.println(celsius + " Celsius degrees are " + farenheit + " Farenheit degrees");

	}
}
