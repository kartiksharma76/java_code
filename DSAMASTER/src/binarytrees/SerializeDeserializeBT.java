package binarytrees;

import java.util.*;

// Serialize and Deserialize Binary Tree
public class SerializeDeserializeBT {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }
    private void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) { sb.append("#,"); return; }
        sb.append(node.val).append(',');
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    public TreeNode deserialize(String data) {
        Deque<String> tokens = new ArrayDeque<>(Arrays.asList(data.split(",")));
        return deserializeHelper(tokens);
    }
    private TreeNode deserializeHelper(Deque<String> tokens) {
        String token = tokens.poll();
        if (token == null || token.equals("#")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(token));
        node.left = deserializeHelper(tokens);
        node.right = deserializeHelper(tokens);
        return node;
    }
}
