package tries;

public class Trie {
	private TrieNode root = new TrieNode();

	static class TrieNode {
		TrieNode[] children = new TrieNode[26];
		boolean isEnd;
	}

	public void insert(String word) {
		TrieNode cur = root;
		for (char c : word.toCharArray()) {
			if (cur.children[c - 'a'] == null)
				cur.children[c - 'a'] = new TrieNode();
			cur = cur.children[c - 'a'];

		}
		cur.isEnd = true;
	}

	public boolean search(String word) {
		TrieNode cur = root;
		for (char c : word.toCharArray()) {
			if (cur.children[c - 'a'] == null)
				return false;
			cur = cur.children[c - 'a'];
		}
		return cur.isEnd;
	}

	public boolean startsWith(String prefix) {
		TrieNode cur = root;
		for (char c : prefix.toCharArray()) {
			if (cur.children[c - 'a'] == null)
				return false;
			cur = cur.children[c - 'a'];
		}
		return true;
	}

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("apple");
		System.out.println(trie.search("apple")); // true
		System.out.println(trie.search("app")); // false
		System.out.println(trie.startsWith("app")); // true
	}
}
