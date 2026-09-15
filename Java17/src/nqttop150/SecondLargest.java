package nqttop150;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 9, 1, 7, 2};
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        
        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}
