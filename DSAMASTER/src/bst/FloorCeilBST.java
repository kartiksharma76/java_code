package bst;

// Floor and Ceil in a BST
public class FloorCeilBST {
    public int floor(TreeNode root, int key) {
        int floorVal = -1;
        while (root != null) {
            if (root.val == key) return root.val;
            if (root.val < key) { floorVal = root.val; root = root.right; }
            else root = root.left;
        }
        return floorVal;
    }
    public int ceil(TreeNode root, int key) {
        int ceilVal = -1;
        while (root != null) {
            if (root.val == key) return root.val;
            if (root.val > key) { ceilVal = root.val; root = root.left; }
            else root = root.right;
        }
        return ceilVal;
    }
}
