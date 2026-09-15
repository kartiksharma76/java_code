package graph;

import java.util.*;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Object[]>> adj = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0), b = equations.get(i).get(1);
            adj.computeIfAbsent(a, k -> new ArrayList<>()).add(new Object[]{b, values[i]});
            adj.computeIfAbsent(b, k -> new ArrayList<>()).add(new Object[]{a, 1.0 / values[i]});
        }
        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String src = queries.get(i).get(0), dst = queries.get(i).get(1);
            if (!adj.containsKey(src) || !adj.containsKey(dst)) { res[i] = -1.0; continue; }
            res[i] = bfs(adj, src, dst);
        }
        return res;
    }
    private double bfs(Map<String, List<Object[]>> adj, String src, String dst) {
        if (src.equals(dst)) return 1.0;
        Set<String> visited = new HashSet<>();
        Queue<Object[]> q = new LinkedList<>(); // node, product
        q.add(new Object[]{src, 1.0});
        visited.add(src);
        while (!q.isEmpty()) {
            Object[] cur = q.poll();
            String node = (String) cur[0];
            double product = (double) cur[1];
            if (node.equals(dst)) return product;
            for (Object[] edge : adj.get(node)) {
                String nbr = (String) edge[0];
                double weight = (double) edge[1];
                if (!visited.contains(nbr)) {
                    visited.add(nbr);
                    q.add(new Object[]{nbr, product * weight});
                }
            }
        }
        return -1.0;
    }
}
