package basic2026;

public class SecondLargest {
    public static void main(String[] args) {
        int[]arr = {10,40,20,50,30};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr){
            if(n> largest){
                second = largest;
                largest = n;
            }else if(n > second && n < largest){
                second = n;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No second distinct largest");
        }else{
            System.out.println(second);
        }
    }
}
