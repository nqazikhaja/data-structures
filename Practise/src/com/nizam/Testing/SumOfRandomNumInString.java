package com.nizam.Testing;

import java.util.ArrayList;
import java.util.List;

public class SumOfRandomNumInString {

	public static void main(String[] args) {
		SumOfRandomNumInString s = new SumOfRandomNumInString();
		System.out.println(s.sumOfIntInString("10a20b"));
		//System.out.println(s.stringToInt("100"));
		//System.out.println(s.sumOfDigits("12abc2"));
		
	}

	// Method to convert string to int
	public int stringToInt(String str) {
		int base = 10;
		int exponent = str.length() - 1;
		int multiply = (int) Math.pow(base, exponent);
		int number = 0;
		for (int i = 0; i < str.length(); i++) {
			Character charecter = str.charAt(i);
			int num = charecter.getNumericValue(charecter);
			num = (int) (num * multiply);
			number = number + num;
			multiply = multiply / 10;
		}
		return number;
	}
	
	
	
	public int sumOfDigits(String str) {
		int sum =0;
		for(int i=0;i<str.length();i++) {
			Character currentChar = str.charAt(i);
			if(currentChar.isDigit(currentChar)) {
				int num = currentChar.getNumericValue(currentChar);
				sum = sum+num;
			}
			
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	
	

	// Method to do the sum of numbers in string
	public int sumOfIntInString(String input) {
		int sum = 0;
		try {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < input.length(); i++) {
				Character currentCharecter = input.charAt(i);
				if (currentCharecter.isDigit(currentCharecter)) {
					sb.append(currentCharecter.toString());					
				} else {
					if (!sb.toString().isEmpty()) {	
						int num = stringToInt(sb.toString());
						sum = sum + num;
					}
					sb = new StringBuilder();
				}
				if(i == input.length()-1) {
					System.out.println("adas"+sb.toString());
					int num = stringToInt(sb.toString());
					sum = sum + num;
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sum;
	}
}
