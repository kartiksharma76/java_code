package recursion;

public class TailRecursion {
	public static int factorialTail(int n, int result) {
        if (n == 0)
            return result;
        return factorialTail(n - 1, n * result);
    }

    public static void main(String[] args) {
        System.out.println(factorialTail(5, 1)); 
    }
}
