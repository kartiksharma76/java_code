package array;

public class Demo {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[0]);
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; i++) {
                System.out.println(arr[i][j] + " ");
            }
        }
        System.out.println();
        int[][] arr2 = new int[4][];
        System.out.println(arr2[0]);
    }
}
