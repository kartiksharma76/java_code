package DsaImp;

public class BinaryTreeMaximumPathSum {
	private int maxSum;

	public int maxPathSum(TreeNode4 root) {
		maxSum = Integer.MIN_VALUE;
		maxGain(root);
		return maxSum;
	}

	private int maxGain(TreeNode4 node) {
		if (node == null) {
			return 0;
		}
		int leftGain = Math.max(maxGain(node.left), 0);
		int rightGain = Math.max(maxGain(node.right), 0);

		int priceNewPath = node.val + leftGain + rightGain;
		maxSum = Math.max(maxSum, priceNewPath);
		return node.val + Math.max(leftGain, rightGain);
	}
}

class TreeNode4 {
	int val;
	TreeNode4 left;
	TreeNode4 right;

	TreeNode4(int val) {
		this.val = val;
	}

	TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static void main(String[] args) {
		BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();
		TreeNode4 root = new TreeNode4(1);
		root.left = new TreeNode4(2);
		root.right = new TreeNode4(3);

		System.out.println("Test 1: " + solution.maxPathSum(root));
	}
}