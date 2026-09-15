package binarytrees;

// Step-By-Step Directions From a Binary Tree Node to Another
public class StepByStepDirections {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToDest = new StringBuilder();
        findPath(root, startValue, pathToStart);
        findPath(root, destValue, pathToDest);

        int i = 0;
        while (i < pathToStart.length() && i < pathToDest.length()
               && pathToStart.charAt(i) == pathToDest.charAt(i)) {
            i++;
        }
        StringBuilder res = new StringBuilder();
        for (int j = i; j < pathToStart.length(); j++) res.append('U');
        res.append(pathToDest.substring(i));
        return res.toString();
    }

    private boolean findPath(TreeNode node, int value, StringBuilder path) {
        if (node == null) return false;
        if (node.val == value) return true;
        path.append('L');
        if (findPath(node.left, value, path)) return true;
        path.setCharAt(path.length() - 1, 'R');
        if (findPath(node.right, value, path)) return true;
        path.deleteCharAt(path.length() - 1);
        return false;
    }
}
