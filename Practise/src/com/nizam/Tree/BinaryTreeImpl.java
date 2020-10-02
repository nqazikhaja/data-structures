package com.nizam.Tree;


public class BinaryTreeImpl {
	
	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		
		Node one = new Node(1);
		bTree.root=one;
		
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
	
		
		one.left=two;
		one.right=three;
		two.left=four;
		two.right=five;
		
		
		bTree.inOrderTraversalIterative(bTree.root);
		
		bTree.preOrderTraversalIterative(bTree);
		
	}

}
