package binarytree;

public class MergeTwoBinaryTrees {

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }

    public static void main(String[] args) {
        TreeNode t1 = TreeUtil.buildSampleTree();
        TreeNode t2 = TreeUtil.buildSampleTree();
        TreeNode merged = mergeTrees(t1, t2);
        TreeUtil.print("Merged tree (preorder)", PreorderTraversal.preorderRecursive(merged));
    }
}
