package NPTL25;

import java.util.Scanner;

public class W09_P1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];

                for (int i = 0; i < 5; i++) {
            String line = sc.nextLine().trim();
            if (line.length() != 5) { 
                System.out.println("Invalid input length");
                return;
            }
            for (int j = 0; j < 5; j++) {
                char c = line.charAt(j);
                if (c != '0' && c != '1') {
                    System.out.println("Invalid input value");
                    return;
                }
                arr[i][j] = (c == '0') ? 1 : 0;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
