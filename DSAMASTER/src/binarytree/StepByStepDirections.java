package binarytree;

public class StepByStepDirections {

    public static String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToDest = new StringBuilder();
        findPath(root, startValue, pathToStart);
        findPath(root, destValue, pathToDest);

        // Strip the common prefix (path down to the LCA)
        int i = 0;
        while (i < pathToStart.length() && i < pathToDest.length()
                && pathToStart.charAt(i) == pathToDest.charAt(i)) {
            i++;
        }

        StringBuilder result = new StringBuilder();
        // For every remaining step in the start path, go "Up"
        for (int j = i; j < pathToStart.length(); j++) {
            result.append('U');
        }
        // Then follow the remaining destination path directly
        result.append(pathToDest.substring(i));

        return result.toString();
    }

    // Builds the L/R path from root to the node with the given value.
    private static boolean findPath(TreeNode node, int value, StringBuilder path) {
        if (node == null) return false;
        if (node.val == value) return true;

        path.append('L');
        if (findPath(node.left, value, path)) return true;
        path.setLength(path.length() - 1);

        path.append('R');
        if (findPath(node.right, value, path)) return true;
        path.setLength(path.length() - 1);

        return false;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        // From node 7 (1->2->4->7) to node 8 (1->3->6->8)
        TreeUtil.print("Directions from 7 to 8", getDirections(root, 7, 8));
    }
}
