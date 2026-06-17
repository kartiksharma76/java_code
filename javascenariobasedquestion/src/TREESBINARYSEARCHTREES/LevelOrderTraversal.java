package TREESBINARYSEARCHTREES;

import java.util.*;

public class LevelOrderTraversal {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int sz = q.size();
			List<Integer> level = new ArrayList<>();
			for (int i = 0; i < sz; i++) {
				TreeNode n = q.poll();
				level.add(n.val);
				if (n.left != null)
					q.add(n.left);
				if (n.right != null)
					q.add(n.right);
			}
			result.add(level);
		}
		return result;
	}

	public static void main(String[] args) {
		LevelOrderTraversal sol = new LevelOrderTraversal();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		System.out.println(sol.levelOrder(root)); // [[3],[9,20]]
	}
}
