package BasicCodingQuestion.Patternprogram;

public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i<= n; i++){
            for(int s = 1; s <= i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j<= n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
