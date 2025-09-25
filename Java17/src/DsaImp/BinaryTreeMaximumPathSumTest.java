package DsaImp;

public class BinaryTreeMaximumPathSumTest {
public static void main(String[] args) {
	BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();
	TreeNode4 root = new TreeNode4(1);
	root.left = new TreeNode4(2);
	root.right = new TreeNode4(3);

	System.out.println("Test 1: " + solution.maxPathSum(root));
}
}
