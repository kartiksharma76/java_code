package binarytree;

public class SumRootToLeafNumbers {

    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode node, int currentNumber) {
        if (node == null) return 0;
        currentNumber = currentNumber * 10 + node.val;
        if (node.left == null && node.right == null) {
            return currentNumber;
        }
        return dfs(node.left, currentNumber) + dfs(node.right, currentNumber);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Sum of Root to Leaf Numbers", sumNumbers(root));
    }
}
