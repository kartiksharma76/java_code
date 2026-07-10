package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Students queue for sandwiches (0 = circular, 1 = square). Each student at
 * the front of the queue takes the top sandwich if it matches their
 * preference; otherwise they go to the back of the queue. Returns how many
 * students are stuck (can't eat) once no one in the remaining queue wants
 * the sandwich on top.
 */
public class NumberOfStudentsUnableToEatLunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> studentQueue = new ArrayDeque<>();
        for (int s : students) studentQueue.offer(s);

        Deque<Integer> sandwichStack = new ArrayDeque<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) sandwichStack.push(sandwiches[i]);

        int rotationsWithoutMatch = 0;
        while (!studentQueue.isEmpty() && rotationsWithoutMatch < studentQueue.size()) {
            int student = studentQueue.poll();
            if (student == sandwichStack.peek()) {
                sandwichStack.pop();
                rotationsWithoutMatch = 0; // progress was made, reset the stall counter
            } else {
                studentQueue.offer(student);
                rotationsWithoutMatch++;
            }
        }
        return studentQueue.size();
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        System.out.println("Students unable to eat: " + countStudents(students, sandwiches));

        int[] students2 = {1, 1, 1, 0, 0, 1};
        int[] sandwiches2 = {1, 0, 0, 0, 1, 1};
        System.out.println("Students unable to eat: " + countStudents(students2, sandwiches2));
    }
}
