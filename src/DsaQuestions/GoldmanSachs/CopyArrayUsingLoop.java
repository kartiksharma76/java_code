package DsaQuestions.GoldmanSachs;

public class CopyArrayUsingLoop {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        int[]copy = new int[arr.length];


        for(int i =0; i<arr.length; i++){
            copy[i] = arr[i];
        }
        for (int x : copy){
            System.out.println(x + " ");
        }
    }
}
