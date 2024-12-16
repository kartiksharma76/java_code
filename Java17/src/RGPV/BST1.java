package RGPV;

public class BST1 {
	private Node root;
	public void insert(int key) {
		root=insertHelper(root,key);
	}
	private Node insertHelper(Node root, int key) {
	   if (root==null) {
		   root=new Node(key);
		return root;
	}
	   if (key<root.key) {
		 root.left=insertHelper(root.left,key);  
	   
}else if(key>root.key) {
	root.right=insertHelper(root.right,key);
}
	   return root;
	   
}
	public boolean search(int key) {
		return searchHelper(root,key=key)!=null;
	}
	private Node searchHelper(Node root, int key) {
	if (root==null||root.key==key) {
		return root;
		
	}
	if (key<root.key) {
		return searchHelper(root.left,key);
	}
	return searchHelper(root.right,key);
	}
	public void inorder() {
		traverseInorder(root);
	}
	public void traverseInorder(Node root) {
		if (root==null) {
			return;
		}
		traverseInorder(root.left);
		System.out.println(root.key+" ");
		traverseInorder(root.right);
	}
	
class Node{
private int key;
private	 Node left;
private	 Node right;
	public Node(int data) {
		super();
		key = data;
		left=right=null;
	}
}
}
	