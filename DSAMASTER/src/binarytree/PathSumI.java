package binarytree;

public class PathSumI {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        int remaining = targetSum - root.val;
        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        // 1 -> 2 -> 4 -> 7 = 14
        TreeUtil.print("Has Path Sum 14", hasPathSum(root, 14));
        TreeUtil.print("Has Path Sum 100", hasPathSum(root, 100));
    }
}
