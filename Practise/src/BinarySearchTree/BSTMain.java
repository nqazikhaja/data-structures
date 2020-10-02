package BinarySearchTree;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST bst = new BST();
		bst.add(100);
		bst.add(502);
		bst.add(55000);
		bst.add(1001);
		bst.add(4500);
		
		
		//System.out.println("value found : "+bst.search(20));
		
		System.out.println("closet value is : "+bst.findClosetValue(4501));
		

	}

}
