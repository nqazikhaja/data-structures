package BinarySearchTree;
public class MyBinarySearchTree<X extends Comparable<X>> {
  
  public Node root;
  public int size;
  public boolean flag;
  public boolean flagLeft = false;
  public boolean flagRight = false;
  
  MyBinarySearchTree(){
    this.root=null;
    this.size=0;
  }
  
  
 public static void main(String[] args){
   
    MyBinarySearchTree<Integer> myBinary = new MyBinarySearchTree<Integer>();
 
   myBinary.add(50);
   myBinary.add(25);
   myBinary.add(55);
   myBinary.add(15);
   myBinary.add(27);
   myBinary.add(53);
   myBinary.add(57);
    System.out.println(myBinary.size);
   System.out.println("Left Child is "+myBinary.root.getLeft().getData());
   
   //System.out.println(myBinary.contains(15));
   System.out.println(myBinary.delete(25));
   System.out.println(myBinary.size);
   System.out.println(myBinary.root.getLeft().getLeft());
   //System.out.println(" has "+myBinary.contains(5));
  }
  
  
  
  public void add(X data){
    Node newNode = new Node(data);
    
    if(this.root == null){
      root = newNode;
      System.out.println("Root is set to :" +root.getData());
      size++;
    }else{
      insert(root,newNode);
    }
  }
  
 
  private void insert(Node parent,Node child){
    
    if(child.getData().compareTo(parent.getData()) < 0){
      if(parent.getLeft() == null){
        parent.setLeft(child);
        child.setParent(parent);
        size++;
      }else{
        	insert(parent.getLeft(),child);
      }
    }else if(child.getData().compareTo(parent.getData()) > 0){
      if(parent.getRight() == null){
        parent.setRight(child);
        child.setParent(parent);
        size++;
        
      }else{
        	insert(parent.getRight(),child);
      }
    }else{
      System.out.println("ELement already exits!!");
    }   
    
  }
  
  
  
  public Node contains(X item){
    Node nodeToDelete = null;
    if(root == null){
      System.out.println("Tree is Empty!!");
    }else {
     nodeToDelete = find(root,item);
    }
  	return nodeToDelete;
  }
  
  
  private Node find(Node parent,X item){
   
    if(item.equals(parent.getData())){
      return parent;
    } else if(item.compareTo(parent.getData()) < 0){
      if(parent.getLeft() == null){
        return null;
      }else{
        	return find(parent.getLeft(),item);
      }
    }else if( item.compareTo(parent.getData()) > 0){
      	if(parent.getRight() == null){
          return null;
        }else{
          return find(parent.getRight(),item);
        }
    }
    return null;
  }
  
  
  
  
  public boolean delete(X item){
    Node deleteNode=null;
    deleteNode = contains(item);
    System.out.println(deleteNode.getData());
    
    if(deleteNode !=null){
      //Node to be deleted has no children
      if(deleteNode.getLeft() == null && deleteNode.getRight() == null){
        System.out.println("Node to be deleted has no children!! ");
        if((deleteNode.getData()).compareTo(deleteNode.getParent().getData()) < 0){
          System.out.println("deleting left");
          deleteNode.getParent().setLeft(null);
          size--;
          return true;
        }
        else if((deleteNode.getData()).compareTo(deleteNode.getParent().getData()) > 0){
          System.out.println("deleting right");
          deleteNode.getParent().setRight(null);
          size--;
          return true;
          
        }
        
      }//Node has only one child
      else if(deleteNode.getLeft() !=null && deleteNode.getRight() == null){
        	System.out.println("Node has only Left child...");
        	deleteNode.getParent().setLeft(deleteNode.getLeft());
        	size--;
        	return true;
         	}
      else if(deleteNode.getRight() !=null && deleteNode.getLeft() == null){
        	System.out.println("Node has only Right child...");
        	deleteNode.getParent().setRight(deleteNode.getRight());	
        	size--;
        	return true;
      }
      
      //Node has two children
      else if(deleteNode.getLeft() != null && deleteNode.getRight() != null){
        System.out.println("Node has two children");
        
        Node nodeTobeDeletedParent = deleteNode.getParent();
        Node leftSubTree = deleteNode.getLeft();
        Node rightSubTree = deleteNode.getRight();
        
        if(deleteNode.getData().compareTo(deleteNode.getParent().getData()) > 0){
          	flagRight = true;
        }else if((deleteNode.getData()).compareTo(deleteNode.getParent().getData()) < 0 ){
          	flagLeft = true;
        }
        
        
        Node largestNode = LargestInLeftSubTree(deleteNode.getLeft());
        System.out.println("largest in left subtree is "+largestNode.getData());
        
        Node largestNodeParent = largestNode.getParent();
        
        if(largestNodeParent == deleteNode) {
        	if(flagLeft) {
        		nodeTobeDeletedParent.setLeft(largestNode);
        		largestNode.setRight(rightSubTree);
        	}else if(flagRight) {
        		nodeTobeDeletedParent.setRight(largestNode);
        		largestNode.setLeft(leftSubTree);
        	}
        }else {
        	//deleting the largest in left sub tree
            largestNodeParent.setRight(null);
            
            largestNode.setLeft(leftSubTree);
            largestNode.setRight(rightSubTree);
        }
        
        
        
        if(flagLeft){
          //setting largest node as left child to NodeTobeDeleted's parent
          nodeTobeDeletedParent.setLeft(largestNode);
          
        }else if(flagRight){
           //setting largest node as right child to NodeTobeDeleted's parent
           nodeTobeDeletedParent.setRight(largestNode);
        }
        
        //deleting the node
        deleteNode= null;
        size--;
        
        return true;
      }
        
    }
 
    return false;
  }
  
  
  public Node LargestInLeftSubTree(Node leftRoot){
    Node largest = leftRoot.getRight();
    
    if(largest != null) {
    	LargestInLeftSubTree(largest.getRight());
    }
    
    System.out.println(largest);
   
    	 /*while(largest.getRight() != null){
    	      largest = largest.getRight();
    	    }*/
    
   
    return leftRoot;
  }
  
  
  
  
  public class Node{
    private Node left;
    private Node right;
   	private Node parent;
    private X data;
    
    
    //Constructor to initialize Node
    public Node(X data){
      this.left=null;
      this.right=null;
      this.parent=null;
      this.data=data;
    }
    
    public void setLeft(Node left){
      this.left=left;
    }
    
    public Node getLeft(){
      return left;
    }
    
     public void setRight(Node right){
      this.right=right;
    }
    
    public Node getRight(){
      return right;
    }
    
     public void setParent(Node parent){
      this.parent=parent;
    }
    
    public Node getParent(){
      return parent;
    }
    
     public void setData(X data){
      this.data=data;
    }
    
    public X getData(){
      return data;
    }
    
   
  }
  
  
  
  
  
  
  
  
  
  
  
}

