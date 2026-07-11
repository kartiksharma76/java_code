package trieses;

import java.util.*;

// Longest Word with All Prefixes (Longest word such that every prefix is also in the list)
public class LongestWordWithAllPrefixes {
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

    public String longestWord(String[] words) {
        for (String w : words) insert(w);
        StringBuilder best = new StringBuilder();
        dfs(root, new StringBuilder(), best);
        return best.toString();
    }

    private void dfs(Node node, StringBuilder path, StringBuilder best) {
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null && node.children[i].isEnd) {
                path.append((char) ('a' + i));
                if (path.length() > best.length() ||
                   (path.length() == best.length() && path.toString().compareTo(best.toString()) < 0)) {
                    best.setLength(0);
                    best.append(path);
                }
                dfs(node.children[i], path, best);
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}
