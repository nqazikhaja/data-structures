package BinarySearchTree;


//BST without recursion
public class BST {
	
	Node root;
	int closet =0;
	int[] diffArr= {};
	
	
	BST(){
		this.root=null;
	}
	
	//adding a node in BST
	public void add(int data) {
		Node node = new Node(data);
		if(root==null) {
			root=node;
			System.out.println("Root is : "+root.data);
		}else {
			Node current = root;
			while(current !=null) {
				
				Node parent = current;
				if(node.data < current.data ) {
					current = current.left;
					if(current == null) {
						parent.left=node;
						System.out.println("added node ("+node.data+") to left of ("+parent.data+")");
					}
				}else if(node.data >= current.data ) {
					current = current.right;
					if(current == null) {
						parent.right=node;
						System.out.println("added node ("+node.data+") to right of ("+parent.data+")");
					}
				}
					
			}
		}
		
	}
	
	//search
	public boolean search(int data) {
		
		Node current = root;
		if(root!= null) {
			while(current !=null) {
				if(data < current.data) {
					if(current.data==data)
						return true;
					current = current.left;
					
				}else if(data >= current.data) {
					if(current.data==data)
						return true;
					current = current.right;
					
				}
			}
		}
		return false;
		
	}
	
	
	//method to find closet value to provide node
	public int findClosetValue(int data) {
		Node current = root;
		while(current !=null) {
			int diff = Math.abs(data-current.data);
			if(diffArr.length != 0) {
				if(diff < diffArr[0]) {
					diffArr[0]=diff;
					closet=current.data;
				}
			}else {
				diffArr= new int[1];
				diffArr[0]=diff;
				closet=current.data;
			}
			
			if(data==current.data) 
				return current.data;
			
				
			else if(data < current.data)
				current = current.left;
			else if(data >= current.data)
				current = current.right;
		}
		return closet;
	}

}


class Node{
	Node left;
	Node right;
	int data;
	
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
