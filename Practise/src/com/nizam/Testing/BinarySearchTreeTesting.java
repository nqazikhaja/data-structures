package com.nizam.Testing;

import com.nizam.Tree.MyBinarySearchTree;

public class BinarySearchTreeTesting {
	public static void main(String[] args) {
		MyBinarySearchTree binarySearchTree = new MyBinarySearchTree<>();
		binarySearchTree.insert(10);
		binarySearchTree.insert(5);
		binarySearchTree.insert(15);
		//binarySearchTree.insert(7);
		//binarySearchTree.printBinaryTree();
		System.out.println(binarySearchTree.contains(10));
	}

}
