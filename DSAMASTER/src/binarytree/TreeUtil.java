package binarytree;

import java.util.List;

/**
 * Helper utilities shared by the demo `main` methods of every problem class.
 *
 * Sample tree built by buildSampleTree():
 *
 *              1
 *            /   \
 *           2     3
 *          / \      \
 *         4   5      6
 *        /             \
 *       7               8
 */
public class TreeUtil {

    public static TreeNode buildSampleTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        return root;
    }

    public static void print(String label, Object value) {
        System.out.println(label + ": " + value);
    }

    public static void printLevels(String label, List<List<Integer>> levels) {
        System.out.println(label + ":");
        for (List<Integer> level : levels) {
            System.out.println("  " + level);
        }
    }
}
