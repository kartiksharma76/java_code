package infosyscodingquestion;

import java.util.*;

public class DijkstraExample {

    static class Pair {
        int node, distance;

        Pair(int n, int d) {
            node = n;
            distance = d;
        }
    }

    static void dijkstra(int V, List<List<Pair>> graph, int source) {

        // Step 1: Create distance array
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // Step 2: Distance of source = 0
        dist[source] = 0;

        // Step 3: Min heap based on distance
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                Comparator.comparingInt(p -> p.distance)
        );

        // Step 4: Add source
        pq.add(new Pair(source, 0));

        // Step 5: While queue not empty
        while (!pq.isEmpty()) {

            Pair current = pq.poll();
            int u = current.node;

            // Step 6: Skip outdated entries
            if (current.distance > dist[u])
                continue;

            // Step 7: Traverse neighbors
            for (Pair neighbor : graph.get(u)) {

                int v = neighbor.node;
                int weight = neighbor.distance;

                // Step 8: Relaxation
                if (dist[u] + weight < dist[v]) {

                    dist[v] = dist[u] + weight;

                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        // Step 9: Print result
        System.out.println("Shortest distances from source:");
        for (int i = 0; i < V; i++)
            System.out.println("Node " + i + " -> " + dist[i]);
    }

    public static void main(String[] args) {

        int V = 5;

        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(new Pair(1, 2));
        graph.get(0).add(new Pair(2, 4));
        graph.get(1).add(new Pair(2, 1));
        graph.get(1).add(new Pair(3, 7));
        graph.get(2).add(new Pair(4, 3));
        graph.get(3).add(new Pair(4, 1));

        dijkstra(V, graph, 0);
    }
}