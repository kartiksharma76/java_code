package DsaQuestions.microsoft;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public static boolean canFinish(
            int numCourses,
            int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prerequisite = pair[1];
            graph.get(prerequisite).add(course);
        }
        int[] state = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {

            if (hasCycle(i, graph, state)) {
                return false;
            }
        }
        return true;
    }
    private static boolean hasCycle(int course, List<List<Integer>> graph, int[] state) {
     if (state[course] == 1){
         return true;
     }
     if (state[course] == 2){
         return  false;
     }
        state[course] = 1;
        for (int next : graph.get(course)) {

            if (hasCycle(next, graph, state)) {
                return true;
            }
        }
        state[course] = 2;
        return  false;

    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        boolean result = canFinish(numCourses, prerequisites);
        System.out.println("Can Finish courses:" + result);
    }
}
