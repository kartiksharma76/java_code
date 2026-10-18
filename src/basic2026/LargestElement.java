package basic2026;

public class LargestElement {
    public static void main(String[] args) {
        int[]arr = {12,45,7,89,23};
        int max = arr[0];
        for (int n : arr){
            if(n > max){
                max = n;
            }
        }
        System.out.println(max);
    }
}
