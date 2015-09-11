/**
 * implementing Binary Tree Uses the Node Class
 * 
 * @author william
 *
 */
public class BinaryTree {
	private Node root;

	public Node find(int key) {
		Node current = root; // set the current node to the root

		while (current.iData != key) {
			if (key < current.iData) {
				current = current.leftChild; //go left
			} else {
				current = current.rightChild; //go right
			}
			
			if(current == null){ //no child
				return null; //didn't find it
			}
		}
		
		return current; //found it

	}
	
	public void insert(int id, float dd){
		Node newNode = new Node();
		newNode.iData = id;
		newNode.fData = dd;
		Node current = root; //set the current node to the root
		Node parent;	//keeps track of the current node's parent
		
		while(true){	//loop that exits internally
			parent = current;
			if(id < current.iData){	//go left
				current = current.leftChild;
				
				if(current == null){	//if end of line
					//insert on the left
					parent.leftChild = newNode;
					return; //end loop
				}
			}else{	//go right
				current = current.rightChild;
				
				if(current == null){
					parent.rightChild = newNode;
					return; //end loop
				}
			}
		}
	}
	
	public void inOrder(Node localRoot){
		if(localRoot != null){
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	
	public void preOrder(Node localRoot){
		if(localRoot != null){
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void postOrder(Node localRoot){
		if(localRoot != null){
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	
	public Node minimmum(){
		Node current, last = null;
		current = root;
		while(current != null){
			last = current;
			current = current.leftChild;
		}
		
		return last;
	}
	
	public Node maximum(){
		Node current, last = null;
		current = root;
		
		while(current != null){
			last = current;
			current = current.rightChild;
		}
		
		return last;
	}
	
	public boolean delete(int key){
		Node current = root;	
		Node parent = root;
		boolean isLeftChild = true;
		
		//search for the node
		while(current.iData != key){
			parent = current;
			if(key < current.iData){	//go left
				isLeftChild = true;
				current = current.leftChild;
			}else{	//go right
				isLeftChild = false;
				current = current.rightChild;
			}
			
			if(current == null)
				return false;
		}
		
		//No children
		if(current.leftChild == null && current.rightChild == null){  //it is a leaf Node
			if(current == root){
				root = null;
			}
			else if(isLeftChild){
				current.leftChild = null;
			}
			else{
				current.rightChild = null;
			}
		}else if(current.rightChild == null){ // has no right child, replace with left subtree
			if(current == root){
				root = current.leftChild;
			}else if(isLeftChild){	//left child of parent
				parent.leftChild = current.leftChild;
			}else{	//right child of parent
				parent.rightChild = current.rightChild;
			}
		}
	}
	
	public Node getSuccessor(Node delNode){
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;	// Go to the right child
		
		while(current != null){	//No more right children
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor != delNode.rightChild){
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
			}
			return successor;
	}
	
}
