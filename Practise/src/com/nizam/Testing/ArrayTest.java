package com.nizam.Testing;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		int[] b;
		b = new int[5];
		b[0]=10;
		b[1]=1;
		b[2]=2;
		b[3]=3;
		b[4]=4;
		
		
		
		
		int max = 0;
		
		for(int i=0;i<b.length;i++) {
			if(b[i] > max)
				max=b[i];
		}
		
		System.out.println(max);
		
		/*double[] a ;
		a = new double[10];
		
		a[0]= 50;
		a[1]=20;
		a[2]=30;
		a[3]=40;*/
		
		
		
		
		//System.out.println(a);
		
		
		/*double max = Double.NEGATIVE_INFINITY;
		System.out.println("max value "+max);
		for(int i=0;i<a.length;i++) {	
			if(a[i] > max)
				max=a[i];
			System.out.println(max);
		}
		
		System.out.println("Maximum is "+max);
	}*/
}
}
