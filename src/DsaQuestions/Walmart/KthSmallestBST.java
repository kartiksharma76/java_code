package DsaQuestions.Walmart;

import java.util.ArrayDeque;
import java.util.Deque;

public class KthSmallestBST {

    public static int kthSmallest(TreeNode root, int k) {

        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {

            // Go to the leftmost node
            while (current != null) {

                stack.push(current);
                current = current.left;
            }

            // Smallest remaining node
            current = stack.pop();

            k--;

            if (k == 0) {
                return current.val;
            }

            // Move to right subtree
            current = current.right;
        }

        return -1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(8);

        int k = 3;

        int result = kthSmallest(root, k);

        System.out.println("Kth Smallest Element = " + result);
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}