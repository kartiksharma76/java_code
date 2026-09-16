package DsaQuestions.microsoft;

public class ValidateBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private static boolean check(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        // Current node range check
        if (root.val <= min || root.val >= max) {
            return false;
        }
        // Check left and right subtree
        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);
        System.out.println("Valid BST: " + isValidBST(root));
    }
}
