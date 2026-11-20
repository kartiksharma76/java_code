package DsaQuestions.Adobe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraEx {
    public static void main(String[] args) {
        int v = 5;
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Pair(1, 2));
        graph.get(0).add(new Pair(2, 4));
        graph.get(1).add(new Pair(3, 7));
        graph.get(2).add(new Pair(4, 3));

        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        dist[0] = 0;
        pq.offer(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            for (Pair nbr : graph.get(current.node)) {
                if (dist[current.node] + nbr.distance < dist[nbr.node]) {
                    dist[nbr.node] = dist[current.node] + nbr.distance;
                    pq.offer(new Pair(nbr.node, dist[nbr.node]));
                }
            }
        } System.out.println(Arrays.toString(dist));
    }

    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

}
