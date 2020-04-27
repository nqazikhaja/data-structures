package com.nizam.Testing;

public class ReverseOfString {

	public static void main(String[] args) {
		ReverseOfString rev = new ReverseOfString();
		System.out.println("Without recursion "+rev.reverse("abc"));;
		System.out.println("With recursion "+rev.reverseUsingRecursion("abc"));;
	}
	
	//Method without recursion
	public String reverse(String input) {
		int length = input.length();
		StringBuilder sb = new StringBuilder();
		for(int i= length-1;i>=0;i--) {
			sb.append(input.charAt(i));
			
		}return sb.toString();
	}
	
	
	//Method with Recursion
	public String reverseUsingRecursion(String input) {
		int length= input.length();
		StringBuilder sb = new StringBuilder();
		if(length ==1)
			return input;
		else {
			sb.append(input.charAt(length-1));
			input = input.substring(0, length-1);
			return sb+reverseUsingRecursion(input);
		}
	}
}
