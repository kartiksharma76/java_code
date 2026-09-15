package litcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.text.View;

class RightSideView {
	int val;
	RightSideView left;
	RightSideView right;

	public RightSideView(int val) {
		this.val = val;
	}
}

public class BinaryTreeSideView {
	public static List<Integer> binaryTreeView(RightSideView root) {
		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;

		Queue<RightSideView> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				RightSideView view = queue.poll();

				if (i == size - 1) {
					result.add(view.val);
				}
				if (view.left != null)
					queue.add(view.left);

				if (view.right != null)
					queue.add(view.right);
			}

		}
		return result;

	}

	public static void main(String[] args) {
		RightSideView root = new RightSideView(1);
		root.left = new RightSideView(2);
		root.right = new RightSideView(3);
		root.left.right = new RightSideView(5);
		root.right.right = new RightSideView(4);
		List<Integer> result = binaryTreeView(root);
		System.out.println(result);

	}
}
