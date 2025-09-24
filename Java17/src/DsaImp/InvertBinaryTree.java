package DsaImp;

public class InvertBinaryTree {
    
    // Method 1: Recursive with immediate swapping
    public TreeNode3 invertTreeRecursive(TreeNode3 root) {
        if (root == null) {
            return null;
        }
        
        // Swap left and right children
        TreeNode3 temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // Recursively invert subtrees
        invertTreeRecursive(root.left);
        invertTreeRecursive(root.right);
        
        return root;
    }
    
    // Method 2: Recursive with return values (cleaner approach)
    public TreeNode3 invertTree(TreeNode3 root) {
        if (root == null) return null;
        
        // First recursively invert subtrees
        TreeNode3 left = invertTree(root.left);
        TreeNode3 right = invertTree(root.right);
        
        // Then swap the inverted subtrees
        root.left = right;
        root.right = left;
        
        return root;
    }
    
    // Method 3: One-liner recursive (most concise)
    public TreeNode3 invertTreeConcise(TreeNode3 root) {
        if (root == null) return null;
        
        TreeNode3 temp = root.left;
        root.left = invertTreeConcise(root.right);
        root.right = invertTreeConcise(temp);
        
        return root;
    }
}

class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;
    
    TreeNode3(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    
    // Utility method for testing
    public static void printTree(TreeNode3 root) {
        if (root == null) return;
        
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}