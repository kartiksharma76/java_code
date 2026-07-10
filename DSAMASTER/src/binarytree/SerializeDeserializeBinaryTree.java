package binarytree;

import java.util.*;

public class SerializeDeserializeBinaryTree {

    private static final String NULL_MARKER = "#";
    private static final String DELIMITER = ",";

    // Preorder serialization with explicit null markers
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private static void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULL_MARKER).append(DELIMITER);
            return;
        }
        sb.append(node.val).append(DELIMITER);
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    public static TreeNode deserialize(String data) {
        Deque<String> tokens = new ArrayDeque<>(Arrays.asList(data.split(DELIMITER)));
        return deserializeHelper(tokens);
    }

    private static TreeNode deserializeHelper(Deque<String> tokens) {
        String token = tokens.poll();
        if (token == null || token.equals(NULL_MARKER)) return null;
        TreeNode node = new TreeNode(Integer.parseInt(token));
        node.left = deserializeHelper(tokens);
        node.right = deserializeHelper(tokens);
        return node;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        String serialized = serialize(root);
        TreeUtil.print("Serialized", serialized);

        TreeNode restored = deserialize(serialized);
        TreeUtil.print("Restored (preorder)", PreorderTraversal.preorderRecursive(restored));
        TreeUtil.print("Matches original?", SameTree.isSameTree(root, restored));
    }
}
