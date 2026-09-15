package trieses;

// Implement Trie (Prefix Tree)
public class ImplementTrie {
    private static class Node {
        Node[] children = new Node[26];
        boolean isEnd = false;
    }
    private final Node root = new Node();

    public void insert(String word) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (cur.children[idx] == null) cur.children[idx] = new Node();
            cur = cur.children[idx];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        Node node = traverse(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return traverse(prefix) != null;
    }

    private Node traverse(String s) {
        Node cur = root;
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            if (cur.children[idx] == null) return null;
            cur = cur.children[idx];
        }
        return cur;
    }
}
