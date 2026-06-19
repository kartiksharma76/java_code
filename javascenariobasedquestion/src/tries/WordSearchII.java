package tries;

import java.util.*;

public class WordSearchII {
	static class TrieNode {
		TrieNode[] ch = new TrieNode[26];
		String word;
	}

	public List<String> findWords(char[][] board, String[] words) {
		TrieNode root = new TrieNode();
		for (String w : words) {
			TrieNode cur = root;
			for (char c : w.toCharArray()) {
				if (cur.ch[c - 'a'] == null)
					cur.ch[c - 'a'] = new TrieNode();
				cur = cur.ch[c - 'a'];
			}
			cur.word = w;
		}
		List<String> result = new ArrayList<>();
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				dfs(board, i, j, root, result);
		return result;
	}

	private void dfs(char[][] b, int i, int j, TrieNode node, List<String> res) {
		if (i < 0 || i >= b.length || j < 0 || j >= b[0].length || b[i][j] == '#')
			return;
		char c = b[i][j];
		TrieNode next = node.ch[c - 'a'];
		if (next == null)
			return;
		if (next.word != null) {
			res.add(next.word);
			next.word = null;
		}
		b[i][j] = '#';
		dfs(b, i + 1, j, next, res);
		dfs(b, i - 1, j, next, res);
		dfs(b, i, j + 1, next, res);
		dfs(b, i, j - 1, next, res);
		b[i][j] = c;
	}

	public static void main(String[] args) {
		WordSearchII sol = new WordSearchII();
		char[][] b = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' }, { 'i', 'f', 'l', 'v' } };
		System.out.println(sol.findWords(b, new String[] { "oath", "pea", "eat", "rain" }));
// [eat, oath]
	}
}