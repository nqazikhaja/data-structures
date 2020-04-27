package com.nizam.Tree;

public class MyBinarySearchTree<X> {
	private Node root;
	private Node left;
	private Node right;

	public MyBinarySearchTree() {
		root = left = right = null;
	}

	
	//Method to insert a new element recursively
	public void insert(int key) {
		//setting up the root first time
		root = addRecursive(root, key);

	}
	
	public boolean contains(int value) {
		return containsRecursive(root, value);
	}
	
	
	public Node addRecursive(Node root,int key) {
		Node newNode;
		if(root == null)
			return new Node(key);
		
		if(key < root.getKey()) {
			newNode = addRecursive(root.getLeft(), key);
			root.setLeft(newNode);
			
		}else if(key > root.getKey()) {
			newNode = addRecursive(root.getRight(), key);
			root.setRight(newNode);
		}
		
		return root;
		
			
	}
	
	
	
	public boolean containsRecursive(Node root,int value) {
		if(root ==null) {
			return false;
		}
		if(root.getKey() == value) {
			return true;
		}else if(value <= root.getKey()) {
			return containsRecursive(root.getLeft(), value);
		}else if(value > root.getKey()) {
			return containsRecursive(root.getRight(), value);
		}
		
		return false;
	}

	public void printBinaryTree() {
		System.out.println(root);
		

	}

	@Override
	public String toString() {
		return "MyBinarySearchTree [root=" + root + ", left=" + left + ", right=" + right + "]";
	}

}
