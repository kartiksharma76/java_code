package DsaQuestions.Walmart;

public class ClimbingStairs {

    public static int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int previous = 1;
        int current = 2;

        for (int i = 3; i <= n; i++) {

            int next = previous + current;

            previous = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {

        int n = 5;

        int result = climbStairs(n);

        System.out.println("Number of Ways = " + result);
    }
}