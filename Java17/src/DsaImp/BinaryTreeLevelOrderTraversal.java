package DsaImp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode2 root) {
		List<List<Integer>> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Queue<TreeNode2> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> currentLevel = new ArrayList<>();

			for (int i = 0; i < levelSize; i++) {
				TreeNode2 currentNode = queue.poll();
				currentLevel.add(currentNode.val);

				if (currentNode.left != null) {
					queue.offer(currentNode.left);
				}
				if (currentNode.right != null) {
					queue.offer(currentNode.right);
				}
			}

			result.add(currentLevel);
		}

		return result;
	}

	static class TreeNode2 {
		int val;
		TreeNode2 left;
		TreeNode2 right;

		TreeNode2(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
		TreeNode2 root = new TreeNode2(3);
		root.left = new TreeNode2(9);
		root.right = new TreeNode2(20);
		root.right.left = new TreeNode2(15);
		root.right.right = new TreeNode2(7);

		List<List<Integer>> result = solution.levelOrder(root);

		System.out.println("Level Order Traversal:");
		for (List<Integer> level : result) {
			System.out.println(level);
		}

	}
}