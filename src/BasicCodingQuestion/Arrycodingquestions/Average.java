package BasicCodingQuestion.Arrycodingquestions;

public class Average {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;
        for (int x : arr) sum += x;
        double avg = (double) sum / arr.length;
        System.out.println(sum + " " + avg);
    }
}
