package tree;

public class BstTest2 {
public static void main(String[] args) {
	Bst2 tree= new Bst2();
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
