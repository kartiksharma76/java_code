package graph;

import java.util.*;

public class AlienDictionary {
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> adj = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();
        for (String w : words) {
            for (char c : w.toCharArray()) {
                adj.putIfAbsent(c, new HashSet<>());
                indegree.putIfAbsent(c, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i], w2 = words[i + 1];
            int minLen = Math.min(w1.length(), w2.length());
            if (w1.length() > w2.length() && w1.startsWith(w2)) return ""; // invalid order
            for (int j = 0; j < minLen; j++) {
                char c1 = w1.charAt(j), c2 = w2.charAt(j);
                if (c1 != c2) {
                    if (!adj.get(c1).contains(c2)) {
                        adj.get(c1).add(c2);
                        indegree.merge(c2, 1, Integer::sum);
                    }
                    break;
                }
            }
        }
        Queue<Character> q = new LinkedList<>();
        for (char c : indegree.keySet()) if (indegree.get(c) == 0) q.add(c);
        StringBuilder res = new StringBuilder();
        while (!q.isEmpty()) {
            char c = q.poll();
            res.append(c);
            for (char nbr : adj.get(c)) {
                if (indegree.merge(nbr, -1, Integer::sum) == 0) q.add(nbr);
            }
        }
        return res.length() == indegree.size() ? res.toString() : "";
    }
}
