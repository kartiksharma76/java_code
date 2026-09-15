package backtrackings;

public class MColoringProblem {
    public boolean graphColoring(boolean[][] graph, int m) {
        int n = graph.length;
        int[] color = new int[n];
        return solve(graph, m, color, 0);
    }
    private boolean solve(boolean[][] graph, int m, int[] color, int node) {
        if (node == graph.length) return true;
        for (int c = 1; c <= m; c++) {
            if (isSafe(graph, color, node, c)) {
                color[node] = c;
                if (solve(graph, m, color, node + 1)) return true;
                color[node] = 0;
            }
        }
        return false;
    }
    private boolean isSafe(boolean[][] graph, int[] color, int node, int c) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] && color[i] == c) return false;
        }
        return true;
    }
}
