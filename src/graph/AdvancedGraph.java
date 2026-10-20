package graph;


import java.util.*;

// Edge representation
class Edge {
    int source;
    int destination;
    int weight;

    Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return source + " -> " + destination + " (weight=" + weight + ")";
    }
}

// Disjoint Set Union (Union-Find)
class DSU {
    private final int[] parent;
    private final int[] rank;

    DSU(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) {
            return false;
        }

        if (rank[rootA] < rank[rootB]) {
            parent[rootA] = rootB;
        } else if (rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
        } else {
            parent[rootB] = rootA;
            rank[rootA]++;
        }

        return true;
    }
}

// Advanced Graph
public class AdvancedGraph {

    private final int vertices;
    private final List<List<Edge>> adjacency;
    private final List<Edge> edges;
    private final boolean directed;

    public AdvancedGraph(int vertices, boolean directed) {
        if (vertices <= 0) {
            throw new IllegalArgumentException("Vertices must be positive");
        }

        this.vertices = vertices;
        this.directed = directed;
        adjacency = new ArrayList<>();
        edges = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjacency.add(new ArrayList<>());
        }
    }

    public static void main(String[] args) {
        AdvancedGraph graph = new AdvancedGraph(6, false);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 3);

        System.out.println("Adjacency List:");
        graph.display();

        System.out.println("\nBFS: " + graph.bfs(0));
        System.out.println("DFS: " + graph.dfs(0));

        System.out.println("\nDijkstra from 0: " + Arrays.toString(graph.dijkstra(0)));

        System.out.println("Bellman-Ford from 0: " + Arrays.toString(graph.bellmanFord(0)));

        System.out.println("\nConnected Components: " + graph.connectedComponents());

        System.out.println("Has Undirected Cycle: " + graph.hasUndirectedCycle());

        System.out.println("\nKruskal MST:");
        List<Edge> mst = graph.kruskalMST();
        long totalWeight = 0;

        for (Edge edge : mst) {
            System.out.println(edge);
            totalWeight += edge.weight;
        }

        System.out.println("MST Total Weight: " + totalWeight);

        System.out.println("\nFloyd-Warshall:");
        long[][] allPairs = graph.floydWarshall();

        for (long[] row : allPairs) {
            System.out.println(Arrays.toString(row));
        }

        AdvancedGraph dag = new AdvancedGraph(6, true);
        dag.addEdge(5, 2, 1);
        dag.addEdge(5, 0, 1);
        dag.addEdge(4, 0, 1);
        dag.addEdge(4, 1, 1);
        dag.addEdge(2, 3, 1);
        dag.addEdge(3, 1, 1);

        System.out.println("\nTopological Order: " + dag.topologicalSort());

        System.out.println("Has Directed Cycle: " + dag.hasDirectedCycle());
    }

    private void validateVertex(int vertex) {
        if (vertex < 0 || vertex >= vertices) {
            throw new IllegalArgumentException("Invalid vertex: " + vertex);
        }
    }

    public void addEdge(int source, int destination, int weight) {
        validateVertex(source);
        validateVertex(destination);

        Edge edge = new Edge(source, destination, weight);
        adjacency.get(source).add(edge);
        edges.add(edge);

        if (!directed && source != destination) {
            adjacency.get(destination).add(new Edge(destination, source, weight));
        }
    }

    // Display adjacency list
    public void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");

            for (Edge edge : adjacency.get(i)) {
                System.out.print("(" + edge.destination + ", " + edge.weight + ") ");
            }

            System.out.println();
        }
    }

    // Breadth-First Search
    public List<Integer> bfs(int start) {
        validateVertex(start);

        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);

            for (Edge edge : adjacency.get(current)) {
                int next = edge.destination;

                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

        return result;
    }

    // Depth-First Search
    public List<Integer> dfs(int start) {
        validateVertex(start);

        boolean[] visited = new boolean[vertices];
        List<Integer> result = new ArrayList<>();

        dfsHelper(start, visited, result);
        return result;
    }

    private void dfsHelper(int current, boolean[] visited, List<Integer> result) {
        visited[current] = true;
        result.add(current);

        for (Edge edge : adjacency.get(current)) {
            if (!visited[edge.destination]) {
                dfsHelper(edge.destination, visited, result);
            }
        }
    }

    // Dijkstra: requires non-negative edge weights
    public long[] dijkstra(int start) {
        validateVertex(start);

        for (Edge edge : edges) {
            if (edge.weight < 0) {
                throw new IllegalArgumentException("Dijkstra requires non-negative weights");
            }
        }

        long[] distance = new long[vertices];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));

        pq.offer(new long[]{start, 0});

        while (!pq.isEmpty()) {
            long[] current = pq.poll();
            int u = (int) current[0];
            long dist = current[1];

            if (dist != distance[u]) {
                continue;
            }

            for (Edge edge : adjacency.get(u)) {
                int v = edge.destination;
                long newDist = dist + edge.weight;

                if (newDist < distance[v]) {
                    distance[v] = newDist;
                    pq.offer(new long[]{v, newDist});
                }
            }
        }

        return distance;
    }

    // Bellman-Ford: supports negative edges
    // Returns null if a reachable negative cycle exists
    public long[] bellmanFord(int start) {
        validateVertex(start);

        long[] distance = new long[vertices];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[start] = 0;

        for (int i = 1; i < vertices; i++) {
            boolean changed = false;

            for (Edge edge : edges) {
                if (distance[edge.source] == Long.MAX_VALUE) {
                    continue;
                }

                long candidate = distance[edge.source] + edge.weight;

                if (candidate < distance[edge.destination]) {
                    distance[edge.destination] = candidate;
                    changed = true;
                }

                if (!directed && edge.source != edge.destination) {
                    candidate = distance[edge.destination] + edge.weight;

                    if (candidate < distance[edge.source]) {
                        distance[edge.source] = candidate;
                        changed = true;
                    }
                }
            }

            if (!changed) {
                break;
            }
        }

        for (Edge edge : edges) {
            if (distance[edge.source] != Long.MAX_VALUE && distance[edge.source] + edge.weight < distance[edge.destination]) {
                return null;
            }

            if (!directed && edge.source != edge.destination && distance[edge.destination] != Long.MAX_VALUE && distance[edge.destination] + edge.weight < distance[edge.source]) {
                return null;
            }
        }

        return distance;
    }

    // Floyd-Warshall: all-pairs shortest paths
    public long[][] floydWarshall() {
        long[][] dist = new long[vertices][vertices];

        for (int i = 0; i < vertices; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
            dist[i][i] = 0;
        }

        for (Edge edge : edges) {
            dist[edge.source][edge.destination] = Math.min(dist[edge.source][edge.destination], edge.weight);

            if (!directed) {
                dist[edge.destination][edge.source] = Math.min(dist[edge.destination][edge.source], edge.weight);
            }
        }

        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    if (dist[i][k] == Long.MAX_VALUE || dist[k][j] == Long.MAX_VALUE) {
                        continue;
                    }

                    long candidate = dist[i][k] + dist[k][j];

                    if (candidate < dist[i][j]) {
                        dist[i][j] = candidate;
                    }
                }
            }
        }

        return dist;
    }

    // Cycle detection in an undirected graph
    public boolean hasUndirectedCycle() {
        if (directed) {
            throw new IllegalStateException("Use directed cycle detection for directed graphs");
        }

        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && undirectedCycleDfs(i, -1, visited)) {
                return true;
            }
        }

        return false;
    }

    private boolean undirectedCycleDfs(int u, int parent, boolean[] visited) {
        visited[u] = true;

        for (Edge edge : adjacency.get(u)) {
            int v = edge.destination;

            if (!visited[v]) {
                if (undirectedCycleDfs(v, u, visited)) {
                    return true;
                }
            } else if (v != parent) {
                return true;
            }
        }

        return false;
    }

    // Cycle detection in a directed graph
    public boolean hasDirectedCycle() {
        if (!directed) {
            throw new IllegalStateException("This method requires a directed graph");
        }

        boolean[] visited = new boolean[vertices];
        boolean[] active = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && directedCycleDfs(i, visited, active)) {
                return true;
            }
        }

        return false;
    }

    private boolean directedCycleDfs(int u, boolean[] visited, boolean[] active) {
        visited[u] = true;
        active[u] = true;

        for (Edge edge : adjacency.get(u)) {
            int v = edge.destination;

            if (!visited[v]) {
                if (directedCycleDfs(v, visited, active)) {
                    return true;
                }
            } else if (active[v]) {
                return true;
            }
        }

        active[u] = false;
        return false;
    }

    // Topological sorting using Kahn's algorithm
    public List<Integer> topologicalSort() {
        if (!directed) {
            throw new IllegalStateException("Topological sorting requires a directed graph");
        }

        int[] indegree = new int[vertices];

        for (int u = 0; u < vertices; u++) {
            for (Edge edge : adjacency.get(u)) {
                indegree[edge.destination]++;
            }
        }

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < vertices; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> order = new ArrayList<>();

        while (!queue.isEmpty()) {
            int u = queue.poll();
            order.add(u);

            for (Edge edge : adjacency.get(u)) {
                if (--indegree[edge.destination] == 0) {
                    queue.offer(edge.destination);
                }
            }
        }

        if (order.size() != vertices) {
            throw new IllegalStateException("Graph contains a directed cycle");
        }

        return order;
    }

    // Connected components: undirected graphs only
    public List<List<Integer>> connectedComponents() {
        if (directed) {
            throw new IllegalStateException("Use an appropriate component algorithm for directed graphs");
        }

        boolean[] visited = new boolean[vertices];
        List<List<Integer>> components = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            if (visited[i]) {
                continue;
            }

            List<Integer> component = new ArrayList<>();
            Queue<Integer> queue = new ArrayDeque<>();

            queue.offer(i);
            visited[i] = true;

            while (!queue.isEmpty()) {
                int u = queue.poll();
                component.add(u);

                for (Edge edge : adjacency.get(u)) {
                    int v = edge.destination;

                    if (!visited[v]) {
                        visited[v] = true;
                        queue.offer(v);
                    }
                }
            }

            components.add(component);
        }

        return components;
    }

    // Kruskal's Minimum Spanning Tree
    public List<Edge> kruskalMST() {
        if (directed) {
            throw new IllegalStateException("MST requires an undirected graph");
        }

        List<Edge> sorted = new ArrayList<>(edges);
        sorted.sort(Comparator.comparingInt(e -> e.weight));

        DSU dsu = new DSU(vertices);
        List<Edge> mst = new ArrayList<>();

        for (Edge edge : sorted) {
            if (dsu.union(edge.source, edge.destination)) {
                mst.add(edge);

                if (mst.size() == vertices - 1) {
                    break;
                }
            }
        }

        if (mst.size() != vertices - 1) {
            throw new IllegalStateException("Graph is disconnected; no spanning tree exists");
        }

        return mst;
    }
}
