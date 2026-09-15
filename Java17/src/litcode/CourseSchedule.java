package litcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[] indegree = new int[numCourses];

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        for (int[] p : prerequisites) {

            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        int count = 0;

        while (!q.isEmpty()) {

            int course = q.poll();
            count++;

            for (int next : graph.get(course)) {

                indegree[next]--;

                if (indegree[next] == 0)
                    q.add(next);
            }
        }

        return count == numCourses;
    }

    public static void main(String[] args) {
        CourseSchedule cs = new CourseSchedule();

        // Test Case 1: Possible to finish (Linear dependency)
        // To take 1, need 0.
        int numCourses1 = 2;
        int[][] prerequisites1 = { { 1, 0 } };
        System.out.println("Test 1 (Expected: true): " + cs.canFinish(numCourses1, prerequisites1));

        // Test Case 2: Impossible to finish (Cycle)
        // To take 1, need 0. To take 0, need 1.
        int numCourses2 = 2;
        int[][] prerequisites2 = { { 1, 0 }, { 0, 1 } };
        System.out.println("Test 2 (Expected: false): " + cs.canFinish(numCourses2, prerequisites2));

        // Test Case 3: No prerequisites
        int numCourses3 = 3;
        int[][] prerequisites3 = {};
        System.out.println("Test 3 (Expected: true): " + cs.canFinish(numCourses3, prerequisites3));

        // Test Case 4: Complex graph (Possible)
        // 0 -> 1, 0 -> 2, 1 -> 3, 2 -> 3
        int numCourses4 = 4;
        int[][] prerequisites4 = { { 1, 0 }, { 2, 0 }, { 3, 1 }, { 3, 2 } };
        System.out.println("Test 4 (Expected: true): " + cs.canFinish(numCourses4, prerequisites4));

        // Test Case 5: Single course
        int numCourses5 = 1;
        int[][] prerequisites5 = {};
        System.out.println("Test 5 (Expected: true): " + cs.canFinish(numCourses5, prerequisites5));
    }
}