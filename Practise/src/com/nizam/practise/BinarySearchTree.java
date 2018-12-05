package com.nizam.practise;



//defining a node
 class  Node{
	
	 Node left,right;
	 int data;
	 public Node() {
		 
	 }
	 
	public Node(int data) {
		this.data=data;
	}
	
	
	public void insert(int value) {
		if(value <= data) {
			if(left == null) {
				left = new Node(data);
				System.out.println("successfully inserted new node in the left");
			}
			left.insert(value);
			System.out.println("successfully inserted in the left");
		}else if(value > data){
			if(right == null) {
				right = new Node(data);
				System.out.println("successfully inserted in the right");
			}
			right.insert(value);
			System.out.println("successfully inserted in the right");
		}
		
		
	 }	
	
	
	
}

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	
		
	}

}
