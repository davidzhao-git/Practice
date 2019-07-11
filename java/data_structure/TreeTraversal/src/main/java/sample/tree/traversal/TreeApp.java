package sample.tree.traversal;

public class TreeApp {
	
	public static void main(String[] args) {
			
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
			
		System.out.println("print out Inorder");
		tree.printInorder(tree.root);
		
		System.out.println("\n" + "print out Postorder");
		tree.printPostorder(tree.root);
		
		System.out.println("\n" + "print out Preorder");
		tree.printPreorder(tree.root);
	}
	
}


	