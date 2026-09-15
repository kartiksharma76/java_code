package litcode;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("arr1: " + arr1);
        System.out.println("arr2: " + arr2);
        System.out.println();

        for (int i = 0; i <= n; i++) {
            arr1.add(i);
            arr2.add(i);

            System.out.println("After adding " + i + ":");
            System.out.println("arr1: " + arr1);
            System.out.println("arr2: " + arr2);
            System.out.println();
        }
    }
}