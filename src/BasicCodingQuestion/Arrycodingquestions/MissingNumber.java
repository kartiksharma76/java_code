
package BasicCodingQuestion.Arrycodingquestions;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int n = 5;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int missing = total - sum;

        System.out.println("Missing Number: " + missing);
    }
}
