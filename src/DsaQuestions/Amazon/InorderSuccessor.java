package DsaQuestions.Amazon;

public class InorderSuccessor {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public  static TreeNode successor(TreeNode root,int key){
        TreeNode successor = null;
        while(root != null){
            if(key < root.val){
                successor = root;
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return successor;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);

        TreeNode ans = successor(root, 15);

        if(ans != null){
            System.out.println(ans.val);
        }else{
            System.out.println("No Successor");
        }
    }
}
