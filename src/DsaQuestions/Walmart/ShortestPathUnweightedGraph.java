package DsaQuestions.Walmart;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class ShortestPathUnweightedGraph {

    public static int[] shortestPath(int vertices, int[][] edges, int source) {

        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected graph
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] distance = new int[vertices];

        Arrays.fill(distance, -1);

        Queue<Integer> queue = new ArrayDeque<>();

        // Source distance is 0
        distance[source] = 0;
        queue.offer(source);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            for (int neighbour : graph.get(current)) {

                // Visit only once
                if (distance[neighbour] == -1) {

                    distance[neighbour] = distance[current] + 1;

                    queue.offer(neighbour);
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) {

        int vertices = 4;

        int[][] edges = {{0, 1}, {1, 2}, {2, 3}};

        int source = 0;

        int[] result = shortestPath(vertices, edges, source);

        System.out.println("Shortest distances from " + source + ": " + Arrays.toString(result));
    }
}