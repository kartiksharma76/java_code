package BasicCodingQuestion.Patternprogram;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // upar wala hissa
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            // neeche wala hissa
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
