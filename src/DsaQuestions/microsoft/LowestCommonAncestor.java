package DsaQuestions.microsoft;

import com.sun.source.tree.Tree;

public class LowestCommonAncestor {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode lca(TreeNode root, int p, int q){
        if(root == null){
            return  null;
        }
        if(root.val == p || root.val == q){
            return root;
        }
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        }
        return right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        int p = 7;
        int q = 4;

        TreeNode result = lca(root, p, q);

        System.out.println("LCA = " + result.val);
    }
}
