package com.nizam.Tree;


import java.util.Stack;


public class BinaryTree {
	Node root;
	
	BinaryTree(){
		this.root=null;
	}
	
	
	public void postOrderTraversalIterative(BinaryTree bTree) {
		Stack<Node> stack1 = new Stack<Node>();
		stack1.push(bTree.root);
		Stack<Node> stack2 = new Stack<Node>();

		while (!stack1.isEmpty()) {
			Node current = stack1.pop();
			stack2.push(current);
			if (current.left != null)
				stack1.push(current.left);
			if (current.right != null)
				stack1.push(current.right);

		}

		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop().data);
		}

	}
	
	
	
	
	
	
	//without recursion
	public void inOrderTraversalIterative(Node root){
	
	 //to store nodes from BTree	
	 Stack stack = new Stack();
	 Node current = root;
	 
	 //current is null and stack is empty means we traversed the tree
	 while(current !=null || !stack.isEmpty()) {
		
		//traversing left sub tree and pushing to stack
		while(current != null) {
			stack.push(current);
			current = current.left;
		}
		
		current = (Node) stack.pop();
		System.out.println(current.data);
		
		//traversing right sub tree
		current = current.right;
		
		
	 }
		
	}
	
	//Method to Traverse Tree in PreOrder Iterative
	public void preOrderTraversalIterative(BinaryTree bTree) {
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(bTree.root);
		
		
		while(!stack.isEmpty()) {
			Node current = stack.pop();
			System.out.println(current.data);
			
			if(current.right !=null) {
				stack.push(current.right);
			}
			if(current.left !=null) {
				stack.push(current.left);
			}
			
		}
	}
	
	// Left,Root,Right
	public void inOrderRecursive(Node root) {
		if (root == null)
			return;

		inOrderRecursive(root.left);
		System.out.println(root.data);
		inOrderRecursive(root.right);
	}

	// left,right,root
	public void postOrderRecursive(Node root) {
		if (root == null)
			return;

		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.println(root.data);
	}

	// Root,left,right
	public void preOrderRecursive(Node root) {
		if (root == null)
			return;

		System.out.println(root.data);
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);

	}

}


 class Node{
	
	int data;
	Node right;
	Node left;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
 }




