package graph;

import java.util.*;

public class AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        Map<String, Integer> emailToAccount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);
                if (emailToAccount.containsKey(email)) {
                    union(parent, i, emailToAccount.get(email));
                } else {
                    emailToAccount.put(email, i);
                }
            }
        }

        Map<Integer, TreeSet<String>> groups = new HashMap<>();
        for (Map.Entry<String, Integer> e : emailToAccount.entrySet()) {
            int root = find(parent, e.getValue());
            groups.computeIfAbsent(root, k -> new TreeSet<>()).add(e.getKey());
        }

        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<Integer, TreeSet<String>> e : groups.entrySet()) {
            List<String> merged = new ArrayList<>();
            merged.add(accounts.get(e.getKey()).get(0));
            merged.addAll(e.getValue());
            res.add(merged);
        }
        return res;
    }
    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }
    private void union(int[] parent, int a, int b) {
        int pa = find(parent, a), pb = find(parent, b);
        if (pa != pb) parent[pa] = pb;
    }
}
