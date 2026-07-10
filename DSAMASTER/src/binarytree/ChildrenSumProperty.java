package binarytree;

public class ChildrenSumProperty {

    // Checks whether every node already satisfies: node.val == left.val + right.val
    // (missing children count as 0)
    public static boolean isChildrenSumSatisfied(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        int leftVal = (root.left != null) ? root.left.val : 0;
        int rightVal = (root.right != null) ? root.right.val : 0;
        return root.val == leftVal + rightVal
                && isChildrenSumSatisfied(root.left)
                && isChildrenSumSatisfied(root.right);
    }

    // Classic conversion: adjusts node values (only increasing them) so every
    // node satisfies the children sum property, without changing the leaf values.
    public static void convertTree(TreeNode root) {
        if (root == null) return;
        int childSum = 0;
        if (root.left != null) childSum += root.left.val;
        if (root.right != null) childSum += root.right.val;

        if (childSum >= root.val) {
            root.val = childSum;
        } else {
            // push the deficit down into whichever child exists
            if (root.left != null) root.left.val = root.val;
            else if (root.right != null) root.right.val = root.val;
        }

        convertTree(root.left);
        convertTree(root.right);

        // After recursing, re-sum in case children changed
        int total = 0;
        if (root.left != null) total += root.left.val;
        if (root.right != null) total += root.right.val;
        if (root.left != null || root.right != null) root.val = total;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50,
                new TreeNode(10,
                        new TreeNode(4), new TreeNode(6)),
                new TreeNode(30,
                        new TreeNode(11), new TreeNode(19)));

        TreeUtil.print("Satisfies property before conversion", isChildrenSumSatisfied(root));
        convertTree(root);
        TreeUtil.print("Preorder after conversion", PreorderTraversal.preorderRecursive(root));
        TreeUtil.print("Satisfies property after conversion", isChildrenSumSatisfied(root));
    }
}
