package bitmanipulation;

public class SwapTwoNumbersXOR {
    public int[] swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a, b};
    }
}
