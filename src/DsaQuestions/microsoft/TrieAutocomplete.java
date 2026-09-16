package DsaQuestions.microsoft;

public class TrieAutocomplete {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;

    }

    private TrieNode root;

    public TrieAutocomplete() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = getNode(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    private TrieNode getNode(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                return null;
            }
            current = current.children[index];
        }
        return current;
    }

    public static void main(String[] args) {
        TrieAutocomplete trie = new TrieAutocomplete();
        trie.insert("apple");
        trie.insert("application");
        trie.insert("app");
        trie.insert("banana");

        System.out.println("Search apple: " + trie.search("apple"));
        System.out.println("Search app: " + trie.search("app"));
        System.out.println("Search appl: " + trie.search("appl"));
        System.out.println("Starts with appl: " + trie.startsWith("appl"));
        System.out.println("Starts with ban: " + trie.startsWith("ban"));

    }
}
