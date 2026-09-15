package graph;

import java.util.*;

public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return res;

        Map<String, List<String>> parents = new HashMap<>();
        Set<String> currentLevel = new HashSet<>();
        currentLevel.add(beginWord);
        wordSet.remove(beginWord);
        boolean found = false;

        while (!currentLevel.isEmpty() && !found) {
            Set<String> nextLevel = new HashSet<>();
            Set<String> toRemove = new HashSet<>();
            for (String word : currentLevel) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char original = chars[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
                        String next = new String(chars);
                        if (wordSet.contains(next)) {
                            nextLevel.add(next);
                            toRemove.add(next);
                            parents.computeIfAbsent(next, k -> new ArrayList<>()).add(word);
                            if (next.equals(endWord)) found = true;
                        }
                    }
                    chars[i] = original;
                }
            }
            wordSet.removeAll(toRemove);
            currentLevel = nextLevel;
        }

        if (found) {
            LinkedList<String> path = new LinkedList<>();
            path.add(endWord);
            backtrack(endWord, beginWord, parents, path, res);
        }
        return res;
    }

    private void backtrack(String word, String beginWord, Map<String, List<String>> parents,
                            LinkedList<String> path, List<List<String>> res) {
        if (word.equals(beginWord)) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (!parents.containsKey(word)) return;
        for (String parent : parents.get(word)) {
            path.addFirst(parent);
            backtrack(parent, beginWord, parents, path, res);
            path.removeFirst();
        }
    }
}
