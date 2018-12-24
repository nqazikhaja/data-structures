package com.nizam.List;
//Class to represent Node structure
	public class Node<X>{
		public Node nextNode;
		public X data;
		
		public Node(X item) {
			this.nextNode= null;
			this.data=item; 
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public X getData() {
			return data;
		}

		public void setData(X data) {
			this.data = data;
		}
		
	}