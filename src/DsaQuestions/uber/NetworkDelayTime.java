package DsaQuestions.uber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {
    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    static class Pair{
        int node;
        int distance;
        Pair(int node, int distance){
            this.node = node;
            this.distance = distance;
        }
    }
    public static  int networkDelayTime(int[][] times, int n, int k){
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i<= n; i++){
            graph.add(new ArrayList<>());
        }
        for (int [] time : times){
            int u = time[0];
            int v = time[1];
            int w = time[2];
            graph.get(u).add(new Edge(v, w));
        }
        int[] distance = new int[n + 1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.distance,b.distance));
        pq.offer(new Pair(k,0));

        while (!pq.isEmpty()){
            Pair current = pq.poll();
            int node = current.node;
            int currentDistance = current.distance;

            if (currentDistance > distance[node]){
                continue;
            }
            for (Edge edge : graph.get(node)){
                int newDistance = currentDistance + edge.weight;

                if (newDistance < distance[edge.node]){
                    distance[edge.node] = newDistance;

                    pq.offer(new Pair(edge.node, newDistance));
                }
            }
        }
        int maximumTime =0;
        for (int i = 1; i<=n; i++){
            if (distance[i] == Integer.MAX_VALUE){
                return  -1;
            }
            maximumTime = Math.max(maximumTime, distance[i]);
        }
        return  maximumTime;
    }

    public static void main(String[] args) {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;
        int result = networkDelayTime(times, n, k);
        System.out.println("NetworkDelay Time = " + result );
    }
}
