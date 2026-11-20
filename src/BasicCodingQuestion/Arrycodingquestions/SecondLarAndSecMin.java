package BasicCodingQuestion.Arrycodingquestions;

public class SecondLarAndSecMin {
    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr){
            if (x > first){
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
            System.out.println(second);
        }
    }
}
