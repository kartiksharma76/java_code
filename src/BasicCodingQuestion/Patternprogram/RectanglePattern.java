package BasicCodingQuestion.Patternprogram;

public class RectanglePattern {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 6;

        for(int i = 1; i<=rows; i++){
            for (int j = 1; j<=cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
