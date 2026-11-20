package BasicCodingQuestion.loopcodingquestion;

public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        while (b != 0){
            int t = b;
            b = a%b;
            a = t;
        }
        System.out.println("GCD = " + a);
    }
}
