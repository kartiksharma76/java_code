package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Game {
	/*
	 * Complete the 'bendersPlay' function below. The function is expected to return
	 * a STRING_ARRAY. The function accepts following parameters: 1. INTEGER n 2.
	 * 2D_INTEGER_ARRAY paths 3. 2D_INTEGER_ARRAY queries
	 */
	public static List<String> bendersPlay(int n, List<List<Integer>> paths, List<List<Integer>> queries) {
		// Grundy number for each node
		int[] grundy = new int[n + 1];
		// Build the graph
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i <= n; i++)
			graph.add(new ArrayList<>());
		for (List<Integer> p : paths)
			graph.get(p.get(0)).add(p.get(1));
		// Topological sort
		int[] indegree = new int[n + 1];
		for (int u = 1; u <= n; u++)
			for (int v : graph.get(u))
				indegree[v]++;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++)
			if (indegree[i] == 0)
				q.add(i);
		List<Integer> topo = new ArrayList<>();
		while (!q.isEmpty()) {
			int u = q.poll();
			topo.add(u);
			for (int v : graph.get(u)) {
				indegree[v]--;
				if (indegree[v] == 0)
					q.add(v);
			}
		}
		// Compute Grundy numbers in reverse topological order
		for (int i = topo.size() - 1; i >= 0; i--) {
			int u = topo.get(i);
			Set<Integer> s = new HashSet<>();
			for (int v : graph.get(u))
				s.add(grundy[v]);
			int g = 0;
			while (s.contains(g))
				g++;
			grundy[u] = g;
		}
		// Answer queries
		List<String> res = new ArrayList<>();
		for (List<Integer> query : queries) {
			int xor = 0;
			for (int b : query)
				xor ^= grundy[b];
			res.add(xor != 0 ? "Bumi" : "Iroh");
		}
		return res;
	}
}

public class GameTheory {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ");
		int n = Integer.parseInt(first[0]);
		int m = Integer.parseInt(first[1]);
		List<List<Integer>> paths = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			String[] uv = br.readLine().split(" ");
			paths.add(Arrays.asList(Integer.parseInt(uv[0]), Integer.parseInt(uv[1])));
		}
		int Q = Integer.parseInt(br.readLine());
		List<List<Integer>> queries = new ArrayList<>();
		for (int i = 0; i < Q; i++) {
			int K = Integer.parseInt(br.readLine());
			String[] b = br.readLine().split(" ");
			List<Integer> curr = new ArrayList<>();
			for (int j = 0; j < K; j++)
				curr.add(Integer.parseInt(b[j]));
			queries.add(curr);
		}
		List<String> result = Game.bendersPlay(n, paths, queries);
		for (String s : result)
			System.out.println(s);
	}
}
