package basic2026;

public class SmallestElement {
    public static void main(String[] args) {
        int[]arr = {12,45,7,89,23};
        int min = arr[0];

        for (int n : arr){
            if(n < min){
                min = n;
            }
        }
        System.out.println(min);
    }
}
