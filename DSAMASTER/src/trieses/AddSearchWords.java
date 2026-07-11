package trieses;

// Design Add and Search Words Data Structure (supports '.' wildcard)
public class AddSearchWords {
    private static class Node {
        Node[] children = new Node[26];
        boolean isEnd = false;
    }
    private final Node root = new Node();

    public void addWord(String word) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (cur.children[idx] == null) cur.children[idx] = new Node();
            cur = cur.children[idx];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }
    private boolean dfs(String word, int idx, Node node) {
        if (node == null) return false;
        if (idx == word.length()) return node.isEnd;
        char c = word.charAt(idx);
        if (c == '.') {
            for (Node child : node.children) {
                if (dfs(word, idx + 1, child)) return true;
            }
            return false;
        } else {
            return dfs(word, idx + 1, node.children[c - 'a']);
        }
    }
}
