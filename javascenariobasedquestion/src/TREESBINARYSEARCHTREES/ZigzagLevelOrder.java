package TREESBINARYSEARCHTREES;

import java.util.*;

public class ZigzagLevelOrder {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		boolean leftToRight = true;
		while (!q.isEmpty()) {
			int sz = q.size();
			LinkedList<Integer> level = new LinkedList<>();
			for (int i = 0; i < sz; i++) {
				TreeNode n = q.poll();
				if (leftToRight)
					level.addLast(n.val);
				else
					level.addFirst(n.val);
				if (n.left != null)
					q.add(n.left);
				if (n.right != null)
					q.add(n.right);
			}
			result.add(level);
			leftToRight = !leftToRight;
		}
		return result;
	}

	public static void main(String[] args) {
		ZigzagLevelOrder sol = new ZigzagLevelOrder();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(sol.zigzagLevelOrder(root)); // [[3],[20,9],[15,7]]
	}
}
