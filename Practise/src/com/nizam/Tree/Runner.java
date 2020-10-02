package com.nizam.Tree;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bTree = new BinaryTree();

		Node one = new Node(1);
		bTree.root = one;

		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);

		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;

		BinaryTreeIterator bTreeIrerator = new BinaryTreeIterator(bTree);

		while (bTreeIrerator.hasNext()) {
			System.out.println(bTreeIrerator.next());
		}

	}

}
