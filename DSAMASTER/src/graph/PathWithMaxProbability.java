package graph;

import java.util.*;

public class PathWithMaxProbability {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<double[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            adj.get(u).add(new double[]{v, succProb[i]});
            adj.get(v).add(new double[]{u, succProb[i]});
        }
        double[] prob = new double[n];
        prob[start] = 1.0;
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1])); // node, prob
        pq.add(new double[]{start, 1.0});
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            int node = (int) cur[0];
            double p = cur[1];
            if (node == end) return p;
            if (p < prob[node]) continue;
            for (double[] edge : adj.get(node)) {
                int nbr = (int) edge[0];
                double newProb = p * edge[1];
                if (newProb > prob[nbr]) {
                    prob[nbr] = newProb;
                    pq.add(new double[]{nbr, newProb});
                }
            }
        }
        return 0.0;
    }
}
