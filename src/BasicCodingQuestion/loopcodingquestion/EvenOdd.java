package BasicCodingQuestion.loopcodingquestion;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("\nEven :");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");

        }
        System.out.print("\nOdd:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
