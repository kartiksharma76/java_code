package trieses;

// Number of Distinct Substrings in a String (using Trie, O(n^2))
public class DistinctSubstringsCount {
    private static class Node {
        Node[] children = new Node[26];
    }
    public int countDistinctSubstrings(String s) {
        Node root = new Node();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Node cur = root;
            for (int j = i; j < s.length(); j++) {
                int idx = s.charAt(j) - 'a';
                if (cur.children[idx] == null) {
                    cur.children[idx] = new Node();
                    count++;
                }
                cur = cur.children[idx];
            }
        }
        return count + 1; // +1 for empty substring, remove if not counted
    }
}
