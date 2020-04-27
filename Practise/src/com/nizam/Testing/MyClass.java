package com.nizam.Testing;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
	private Map<String,Integer> map;

	public MyClass() {
		map = new HashMap<>();
		map.put("foo", 1);
		map.put("bar", 3);
		
	}
	
	public int getValue(String input, int retries) {
		System.out.println("hi");
		try {
			
			return map.get(input);
		}catch(Exception e ) {
			if(retries > 3) {
				throw e;
			}
		}
		
		return getValue(input,retries+1);
			
	}
	
	
	
	public static void main(String[] args) {
		MyClass my = new MyClass();
		System.out.println(my.getValue("baaz", 1));
		
	}
}
