package DsaQuestions.Google;

public class BitmaskArray {
    public static int countSetBits(int num){
        int count = 0;

        while(num > 0){
            count += num & 1;
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr = {5,7,10,15};
        for(int num : arr){
            System.out.println(num + " -> " + countSetBits(num));
        }
    }

}
