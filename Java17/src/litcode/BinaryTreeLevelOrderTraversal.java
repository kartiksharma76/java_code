package litcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class BinaryTreeLevelOrderTraversal {
	List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {

			int size = q.size();

			List<Integer> level = new ArrayList<>();

			for (int i = 0; i < size; i++) {

				TreeNode node = q.poll();
				level.add(node.val);

				if (node.left != null)
					q.add(node.left);

				if (node.right != null)
					q.add(node.right);
			}

			result.add(level);
		}

		return result;
	}

	public static void main(String[] args) {
		BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();

		// Test Case 1: Standard Binary Tree
		// 3
		// / \
		// 9 20
		// / \
		// 15 7
		TreeNode root1 = new TreeNode(3);
		root1.left = new TreeNode(9);
		root1.right = new TreeNode(20);
		root1.right.left = new TreeNode(15);
		root1.right.right = new TreeNode(7);

		System.out.println("Test 1 (Standard): " + traversal.levelOrder(root1));
		// Expected: [[3], [9, 20], [15, 7]]

		// Test Case 2: Null Root
		TreeNode root2 = null;
		System.out.println("Test 2 (Null): " + traversal.levelOrder(root2));
		// Expected: []

		// Test Case 3: Single Node
		TreeNode root3 = new TreeNode(1);
		System.out.println("Test 3 (Single Node): " + traversal.levelOrder(root3));
		// Expected: [[1]]

		// Test Case 4: Skewed Tree (Left)
		// 1
		// /
		// 2
		// /
		// 3
		TreeNode root4 = new TreeNode(1);
		root4.left = new TreeNode(2);
		root4.left.left = new TreeNode(3);
		System.out.println("Test 4 (Skewed): " + traversal.levelOrder(root4));
		// Expected: [[1], [2], [3]]
	}
}