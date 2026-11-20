package BasicCodingQuestion.loopcodingquestion;

public class CheckPrimeNum {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = n > 1;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");

    }
}
