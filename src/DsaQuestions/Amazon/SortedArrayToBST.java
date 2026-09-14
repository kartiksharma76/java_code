package DsaQuestions.Amazon;

public class SortedArrayToBST {
    static class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    public  static  TreeNode sortedArrayToBst(
            int[] nums, int left, int right
    ){
        if(left > right){
            return  null;
        }
        int mid = left + (right - left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBst(nums, left, mid - 1);

        root.right = sortedArrayToBst(nums, mid + 1, right);
        return  root;
    }
    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBst(nums, 0, nums.length - 1);
        inorder(root);
    }

}
