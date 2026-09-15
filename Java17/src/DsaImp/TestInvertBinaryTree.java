package DsaImp;

import java.util.LinkedList;
import java.util.Queue;

public class TestInvertBinaryTree {
    
    // Utility method to print tree level by level
    public static void printLevelOrder(TreeNode3 root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        
        Queue<TreeNode3> queue = new LinkedList<>();
        queue.offer(root);
        
        System.out.print("Level Order: ");
        while (!queue.isEmpty()) {
            TreeNode3 current = queue.poll();
            System.out.print(current.val + " ");
            
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        System.out.println();
    }
    
    // Utility method to create a sample tree
    public static TreeNode3 createSampleTree() {
        TreeNode3 root = new TreeNode3(1);
        root.left = new TreeNode3(2);
        root.right = new TreeNode3(3);
        root.left.left = new TreeNode3(4);
        root.left.right = new TreeNode3(5);
        root.right.left = new TreeNode3(6);
        root.right.right = new TreeNode3(7);
        return root;
    }
    
    public static void main(String[] args) {
        InvertBinaryTree inverter = new InvertBinaryTree();
        
        // Test Method 1
        System.out.println("=== Method 1: Immediate Swapping ===");
        TreeNode3 root1 = createSampleTree();
        System.out.print("Original: ");
        printLevelOrder(root1);
        
        TreeNode3 inverted1 = inverter.invertTreeRecursive(root1);
        System.out.print("Inverted: ");
        printLevelOrder(inverted1);
        
        // Test Method 2
        System.out.println("\n=== Method 2: Return Value Swapping ===");
        TreeNode3 root2 = createSampleTree();
        System.out.print("Original: ");
        printLevelOrder(root2);
        
        TreeNode3 inverted2 = inverter.invertTree(root2);
        System.out.print("Inverted: ");
        printLevelOrder(inverted2);
        
        // Test Method 3
        System.out.println("\n=== Method 3: Concise Approach ===");
        TreeNode3 root3 = createSampleTree();
        System.out.print("Original: ");
        printLevelOrder(root3);
        
        TreeNode3 inverted3 = inverter.invertTreeConcise(root3);
        System.out.print("Inverted: ");
        printLevelOrder(inverted3);
        
        // Test edge cases
        System.out.println("\n=== Edge Cases ===");
        System.out.println("Null tree: " + inverter.invertTree(null));
        
        TreeNode3 singleNode = new TreeNode3(10);
        System.out.print("Single node - Original: ");
        printLevelOrder(singleNode);
        TreeNode3 invertedSingle = inverter.invertTree(singleNode);
        System.out.print("Single node - Inverted: ");
        printLevelOrder(invertedSingle);
    }
}