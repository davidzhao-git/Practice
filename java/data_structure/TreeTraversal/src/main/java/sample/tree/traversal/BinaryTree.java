package sample.tree.traversal;

public class BinaryTree {
	
	public Node root;
	
	BinaryTree() {
		root = null;
	}
	
	// Left, Root, Right 
	public void printInorder(Node node) {
		
		if (node == null) {
			return;
		}
	
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);	
	}
	
	// Root, Left, Right
	public void printPreorder(Node node) {
		
		if (node == null) {
			return;
		}
		
		System.out.print(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	// Left, Right, Root
	public void printPostorder(Node node) {
		
		if (node == null) {
			return;
		}
		
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key + " ");
	}
	
}
