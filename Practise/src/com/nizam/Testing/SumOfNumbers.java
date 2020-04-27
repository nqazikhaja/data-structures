package com.nizam.Testing;

public class SumOfNumbers {

	public static void main(String[] args) {
		SumOfNumbers sum = new SumOfNumbers();
		System.out.println(sum.sum(1023)); ;
	}
	public int sum(int num) {
		if(num<10) 
			return num;
		else {
			int rem = num%10;
			return rem+sum(num/10);
		}
		
	}
}
