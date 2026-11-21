package BasicCodingQuestion.Arrycodingquestions;

public class EndOfZero {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        int pos = 0;
        for (int x : a) if(x != 0) a[pos++] = x;
        while (pos < a.length) a[pos++] = 0;
        System.out.println(java.util.Arrays.toString(a));
    }
}
