package BasicCodingQuestion.Methods;

public class Recursion {
    static int countDown(int n){
        if (n == 0) return 0;
        System.out.println(n + " ");
        return countDown(n - 1);
    }
    // countDown(3) -> 3 2 1
    public static void main(String[] args) {
        countDown(3);
    }
}
