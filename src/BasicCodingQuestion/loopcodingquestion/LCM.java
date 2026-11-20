package BasicCodingQuestion.loopcodingquestion;

public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int x  = a;
        int y = b;

        while (y != 0){
            int t = y;
            y = x % y;
            x = t;

            int lcm = (a * b) / x;
            System.out.println("LCM = " + lcm);
        }
    }
}
