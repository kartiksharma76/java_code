package DsaQuestions.uber;

public class BinaryTreeMaximumPathSum {

    static int maximumSum;

    public static int maxPathSum(TreeNode root) {

        maximumSum = Integer.MIN_VALUE;

        maxGain(root);

        return maximumSum;
    }

    private static int maxGain(TreeNode node) {

        if (node == null) {
            return 0;
        }

        // Maximum gain from left subtree
        int leftGain = Math.max(0, maxGain(node.left));

        // Maximum gain from right subtree
        int rightGain = Math.max(0, maxGain(node.right));

        // Path passing through current node
        int currentPath = node.val + leftGain + rightGain;

        // Update global maximum
        maximumSum = Math.max(maximumSum, currentPath);

        // Return one side only
        // because parent can use only
        // one branch
        return node.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);

        root.right.right = new TreeNode(7);

        int result = maxPathSum(root);

        System.out.println("Maximum Path Sum = " + result);
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