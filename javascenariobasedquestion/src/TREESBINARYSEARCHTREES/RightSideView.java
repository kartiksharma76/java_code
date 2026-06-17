package TREESBINARYSEARCHTREES;

import java.util.*;

public class RightSideView {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int sz = q.size();
			TreeNode last = null;
			for (int i = 0; i < sz; i++) {
				last = q.poll();
				if (last.left != null)
					q.add(last.left);
				if (last.right != null)
					q.add(last.right);
			}
			result.add(last.val);
		}
		return result;
	}

	public static void main(String[] args) {
		RightSideView sol = new RightSideView();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(4);
		System.out.println(sol.rightSideView(root)); // [1,3,4]
	}
}