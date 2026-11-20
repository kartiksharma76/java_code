package BasicCodingQuestion.loopcodingquestion;

public class Armstrong {
    public static void main(String[] args) {
        int n = 153 ,original = n, sum = 0;
        int digit = String.valueOf(n).length();
        while (n > 0){
            int d = n % 10;
            sum += (int) Math.pow(d, digit);
            n /= 10;
        }
        System.out.println(sum == original ? "Armstrong" : "Not Armstrong");
    }
}
