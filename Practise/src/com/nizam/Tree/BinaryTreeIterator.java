package com.nizam.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeIterator {

	Stack<Node> stack = null;
	List data = null;

	BinaryTreeIterator(BinaryTree bTree) {
		stack = new Stack<>();
		data = new ArrayList<>();
		Node root = bTree.root;

		// flattening the tree
		inOrderTraversalIterative(root);

	}

	// without recursion
	public void inOrderTraversalIterative(Node root) {

		// to store nodes from BTree
		// Stack stack = new Stack();
		Node current = root;

		// current is null and stack is empty means we traversed the tree
		while (current != null || !stack.isEmpty()) {

			// traversing left sub tree and pushing to stack
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			current = (Node) stack.pop();
			data.add(current);

			// traversing right sub tree
			current = current.right;

		}

	}

	public int next() {
		Node current = (Node) data.remove(0);
		return current.data;
	}

	public boolean hasNext() {
		return (data.size() > 0) ? true : false;
	}

}
