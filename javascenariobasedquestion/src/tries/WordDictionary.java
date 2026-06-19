package tries;

public class WordDictionary {
	static class TrieNode {
		TrieNode[] ch = new TrieNode[26];
		boolean end;
	}

	TrieNode root = new TrieNode();

	public void addWord(String word) {
		TrieNode cur = root;
		for (char c : word.toCharArray()) {
			if (cur.ch[c - 'a'] == null)
				cur.ch[c - 'a'] = new TrieNode();
			cur = cur.ch[c - 'a'];
		}
		cur.end = true;

	}

	public boolean search(String word) {
		return dfs(word, 0, root);
	}

	private boolean dfs(String word, int i, TrieNode node) {
		if (i == word.length())
			return node.end;
		char c = word.charAt(i);
		if (c == '.') {
			for (TrieNode ch : node.ch)
				if (ch != null && dfs(word, i + 1, ch))
					return true;
			return false;
		}
		return node.ch[c - 'a'] != null && dfs(word, i + 1, node.ch[c - 'a']);
	}

	public static void main(String[] args) {
		WordDictionary wd = new WordDictionary();
		wd.addWord("bad");
		wd.addWord("dad");
		wd.addWord("mad");
		System.out.println(wd.search("pad")); // false
		System.out.println(wd.search(".ad")); // true

	}
}