package DsaQuestions.Walmart;

public class ValidateBST {

    public static boolean isValidBST(TreeNode root) {

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node, long min, long max) {

        if (node == null) {
            return true;
        }

        // Current value must be within valid range
        if (node.val <= min || node.val >= max) {

            return false;
        }

        // Left subtree:
        // values must be smaller than current node
        boolean leftValid = validate(node.left, min, node.val);

        // Right subtree:
        // values must be greater than current node
        boolean rightValid = validate(node.right, node.val, max);

        return leftValid && rightValid;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(8);

        boolean result = isValidBST(root);

        System.out.println("Is Valid BST = " + result);
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