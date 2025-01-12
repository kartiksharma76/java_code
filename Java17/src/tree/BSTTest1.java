package tree;

public class BSTTest1 {
public static void main(String[] args) {
	BST1 tree= new BST1();
	tree.inseart('B');
	tree.inseart('C');
	tree.inseart('A');
	tree.inseart('E');
	tree.inseart('D');
	tree.inseart('G');
	tree.inseart('H');
	tree.inseart('F');
	tree.inseart('I');
	tree.traversepostorder();
	
}
}
