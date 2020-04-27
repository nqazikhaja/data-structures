package com.nizam.Testing;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverse(1534236469));
		//System.out.println(s.reverseRecursive(-123));
	}
	
	//Method to reverse a number
	public int reverse(int num) {
		int reversedNum=0;
		System.out.println("her num "+num);
		if(num > 2147483645) {
			    
			System.out.println("herer");
			return 0;
		}else {
			System.out.println("not herer");
			boolean negative = false;
			if(num<0) {
				negative = true;
				num = Math.abs(num);
			}			
			int length = String.valueOf(num).length();
			int base=10;
			int exponent = length-1;
			int multiplier = (int) Math.pow(base, exponent);
			
			for(int i =0;i<length;i++) {
				int remainder = num%10;
				System.out.println("remainder is "+remainder);
				int digit = remainder*multiplier;
				multiplier=multiplier/10;
				System.out.println("multiplier is "+multiplier);
				num = num/10;
				System.out.println("num is"+num);
			
				reversedNum = reversedNum+digit;
			}
			if(negative) 
				reversedNum=reversedNum*(-1);
			
			return reversedNum;
		}
		
		

	}
	
	
	/*
	//Method to reverse a number using recursion
	public int reverseRecursive(int num) {
		
		
		if(num<0) {
			boolean negative =true;
			System.out.println(negative);
			num = Math.abs(num);
		}
		
		if(num < 10) {
	

			return num;
		}
			
		else {
			int length = String.valueOf(num).length();
			int exponent = length-1;
			int multiplier = (int) Math.pow(10, exponent);
			int remainder = (num%10)*multiplier;
			if(negative) {
				
			}
			return remainder+reverseRecursive(num/10);
		
		}
		
	}*/
}
