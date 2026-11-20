package BasicCodingQuestion.Arrycodingquestions;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jag = new int[3][];
        jag[0] = new int[]{1};
        jag[1] = new int[]{2,3};
        jag[2] = new int[]{4,5,6};

        for (int [] row : jag) System.out.println(java.util.Arrays.toString(row));
    }
}
