package DsaQuestions.GoldmanSachs;

public class CheckBinaryTreeIsBST {
    public static boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        boolean leftValid = validate(node.left, lower, node.val);
        if (!leftValid) {
            return false;
        }
        return validate(node.right, node.val, upper);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);

        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);

        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);

        root.right.right = new TreeNode(8);

        System.out.println("Is Valid BST = " + isValidBST(root));
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

