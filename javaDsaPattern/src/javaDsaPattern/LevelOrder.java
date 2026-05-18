package javaDsaPattern;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	public static void level(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.val + " ");
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
		}
	}

}
