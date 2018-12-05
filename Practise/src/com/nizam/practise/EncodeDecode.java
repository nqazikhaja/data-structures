package com.nizam.practise;

public class EncodeDecode {

	
	public static String encode(String text) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<text.length();i++) {
			char c = text.charAt(i);
			System.out.println(c);
			System.out.println(" pronting this"+(c += c+i));
			sb.append(c += c+i);
			//System.out.println(sb);
			
		}

		return sb.reverse().toString();
		
		
	}
	
	
	public static String decode(String text) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<text.length();i++) {
			
			char c = text.charAt(i);
			sb.append(c -= c-i);
			
		}
		
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(encode("Niz"));
		System.out.println(decode("ǮƧĸ"));
		
	}

}
