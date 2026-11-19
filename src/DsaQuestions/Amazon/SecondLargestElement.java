package DsaQuestions.Amazon;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {10,25,5, 40,30};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for ( int num : arr){
            if(num > largest){
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;

            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No Second largest");
        }else{
            System.out.println(second);
        }
    }
}
