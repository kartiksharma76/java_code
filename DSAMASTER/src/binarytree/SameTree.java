package binarytree;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = TreeUtil.buildSampleTree();
        TreeNode t2 = TreeUtil.buildSampleTree();
        TreeUtil.print("Same Tree (identical copies)", isSameTree(t1, t2));
        t2.right.right.right.val = 99;
        TreeUtil.print("Same Tree (after mutation)", isSameTree(t1, t2));
    }
}
