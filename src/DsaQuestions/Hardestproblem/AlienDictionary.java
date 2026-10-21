package DsaQuestions.Hardestproblem;

import java.util.*;

public class AlienDictionary {
    public static String alienOrder(String[] words) {
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new HashSet<>());
                indegree.putIfAbsent(c, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String a = words[i];
            String b = words[i + 1];
            int len = Math.min(a.length(), b.length());
            int j = 0;

            while (j < len && a.charAt(j) == b.charAt(j)) {
                j++;
            }
            if (j == len) {
                if (a.length() > b.length()) {
                    return " ";
                }
                continue;
            }
            char form = a.charAt(j);
            char to = b.charAt(j);

            if (graph.get(form).add(to)) {
                indegree.put(to, indegree.get(to) + 1);
            }
        }
        Queue<Character> queue = new ArrayDeque<>();

        for (char c : indegree.keySet()) {
            if (indegree.get(c) == 0) {
                queue.offer(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.poll();
            result.append(c);

            for (char next : graph.get(c)) {
                indegree.put(next, indegree.get(next) - 1);

                if (indegree.get(next) == 0) {
                    queue.offer(next);
                }
            }
        }
        return result.length() == indegree.size() ? result.toString() : "";

    }

    public static void main(String[] args) {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        System.out.println(alienOrder(words));
    }
}
