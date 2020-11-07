package datastructures;


class Dnode{
	int data;
	Dnode prev, next;
	
	Dnode(int data)
	{
		this.data = data;
		prev = next = null;
	}
}
public class BinaryTreeToLinkedList {

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
		
		Dnode node = null;
		
		treetoDll(root, node);

	}
	
	public static void treetoDll(Node root, Dnode head)
	{
		
		if(root == null)
			return;
		
		treetoDll(root.left, head);	
		if(head.prev == null)
			head.data = root.data;
		else
		{
			
		}
		
	}

}
