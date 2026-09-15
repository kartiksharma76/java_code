package stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollisionSolver {

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty()
                    && asteroid < 0
                    && stack.peek() > 0) {

                if (stack.peek() < -asteroid) {
                    stack.pop();
                }
                else if (stack.peek() == -asteroid) {
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = {5, 10, -5};
        int[] arr2 = {8, -8};
        int[] arr3 = {10, 2, -5};
        int[] arr4 = {-2, -1, 1, 2};

        System.out.println(Arrays.toString(asteroidCollision(arr1)));
        System.out.println(Arrays.toString(asteroidCollision(arr2)));
        System.out.println(Arrays.toString(asteroidCollision(arr3)));
        System.out.println(Arrays.toString(asteroidCollision(arr4)));
    }
}
