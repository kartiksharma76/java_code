package RGPV;

public class TreeTest {
public static void main(String[] args) {
	Tree tree=new Tree() ;
	tree.insert(20);
	tree.insert(10);
	tree.insert(40);
	tree.insert(50);
	tree.insert(70);
	tree.insert(80);
	tree.inorder();
	System.out.println();
	tree.preorder();
	System.out.println();
	tree.postorder();
}
}
