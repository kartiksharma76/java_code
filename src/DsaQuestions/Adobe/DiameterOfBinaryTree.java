package DsaQuestions.Adobe;

public class DiameterOfBinaryTree {

    static int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {

        height(root);

        return diameter;
    }

    private static int height(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Longest path through current node
        int currentDiameter =
                leftHeight + rightHeight;

        diameter = Math.max(
                diameter,
                currentDiameter
        );

        // Return height to parent
        return 1 + Math.max(
                leftHeight,
                rightHeight
        );
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result =
                diameterOfBinaryTree(root);

        System.out.println(
                "Diameter = " + result
        );
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