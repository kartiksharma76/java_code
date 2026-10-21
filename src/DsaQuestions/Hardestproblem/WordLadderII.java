package DsaQuestions.Hardestproblem;


import java.util.*;

public class WordLadderII {

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);

        if (!dict.contains(endWord)) {
            return result;
        }

        Map<String, List<String>> parents = new HashMap<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer(beginWord);
        visited.add(beginWord);

        boolean found = false;

        while (!queue.isEmpty() && !found) {
            int size = queue.size();
            Set<String> levelVisited = new HashSet<>();

            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] chars = word.toCharArray();

                for (int j = 0; j < chars.length; j++) {
                    char original = chars[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) continue;

                        chars[j] = c;
                        String next = new String(chars);

                        if (!dict.contains(next)) continue;
                        if (visited.contains(next)) continue;

                        parents.computeIfAbsent(next, k -> new ArrayList<>()).add(word);

                        if (levelVisited.add(next)) {
                            queue.offer(next);
                        }

                        if (next.equals(endWord)) {
                            found = true;
                        }
                    }

                    chars[j] = original;
                }
            }

            visited.addAll(levelVisited);
        }

        if (found) {
            List<String> path = new ArrayList<>();
            path.add(endWord);
            buildPaths(endWord, beginWord, parents, path, result);
        }

        return result;
    }

    static void buildPaths(String word, String beginWord, Map<String, List<String>> parents, List<String> path, List<List<String>> result) {

        if (word.equals(beginWord)) {
            List<String> answer = new ArrayList<>(path);
            Collections.reverse(answer);
            result.add(answer);
            return;
        }

        for (String parent : parents.getOrDefault(word, Collections.emptyList())) {
            path.add(parent);
            buildPaths(parent, beginWord, parents, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        System.out.println(findLadders("hit", "cog", words));
    }
}
