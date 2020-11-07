package datastructures;


class Node{
	Node left, right;
	int data;
	Node(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}
}
public class InvertABinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node root = null;
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
        printInorder(root);
        
        Node s =  invertTree(root);
        System.out.println();
        printInorder(root);
	}
	
	public static void printInorder(Node root)
	{
		if(root == null)
			return;
		
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
		
	}
	
	public static Node invertTree(Node root)
	{
		
		
		if(root == null)
			return root;
		
			Node s= invertTree(root.right);
			root.right =invertTree(root.left);
			root.left = s;
			return root;
	
	}

}
