package trieses;

import java.util.*;

// Word Search II - find all words from dictionary that exist in the grid
public class WordSearchII {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode cur = root;
            for (char c : w.toCharArray()) {
                int idx = c - 'a';
                if (cur.children[idx] == null) cur.children[idx] = new TrieNode();
                cur = cur.children[idx];
            }
            cur.word = w;
        }
        List<String> res = new ArrayList<>();
        int rows = board.length, cols = board[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                dfs(board, r, c, root, res);
            }
        }
        return res;
    }

    private void dfs(char[][] board, int r, int c, TrieNode node, List<String> res) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] == '#') return;
        char ch = board[r][c];
        int idx = ch - 'a';
        TrieNode next = node.children[idx];
        if (next == null) return;
        if (next.word != null) {
            res.add(next.word);
            next.word = null; // avoid duplicates
        }
        board[r][c] = '#';
        dfs(board, r + 1, c, next, res);
        dfs(board, r - 1, c, next, res);
        dfs(board, r, c + 1, next, res);
        dfs(board, r, c - 1, next, res);
        board[r][c] = ch;
    }
}
