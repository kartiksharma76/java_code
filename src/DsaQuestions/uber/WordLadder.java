package DsaQuestions.uber;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> dictionary = new HashSet<>(wordList);

        if (!dictionary.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new ArrayDeque<>();

        Set<String> visited = new HashSet<>();

        queue.offer(beginWord);
        visited.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String current = queue.poll();

                if (current.equals(endWord)) {
                    return level;
                }

                char[] word = current.toCharArray();

                // Change one character
                // at a time
                for (int j = 0; j < word.length; j++) {

                    char original = word[j];

                    for (char ch = 'a'; ch <= 'z'; ch++) {

                        if (ch == original) {
                            continue;
                        }

                        word[j] = ch;

                        String next = new String(word);

                        if (dictionary.contains(next) && !visited.contains(next)) {

                            visited.add(next);
                            queue.offer(next);
                        }
                    }

                    word[j] = original;
                }
            }

            level++;
        }

        return 0;
    }

    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");

        int result = ladderLength(beginWord, endWord, wordList);

        System.out.println("Shortest Transformation Length = " + result);
    }
}