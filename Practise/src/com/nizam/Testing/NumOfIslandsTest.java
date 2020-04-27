package com.nizam.Testing;

public class NumOfIslandsTest {

	
	public static void main(String[] args) {
		
		NumOfIslandsTest n = new NumOfIslandsTest();
		char[][] grid= new char[][] {
			
			{'1','2','3'},
			{'1','2'}
			
		};
		
		n.numOfIsland(grid);
		
		
		
	}
	public int numOfIsland(char[][] grid) {
		
		int rows = grid.length;
		System.out.println("size "+rows);
		
		int col = grid[0].length;
		System.out.println(col);
		
		
		return 0;
	}
}
