package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Number of lines
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Reading the data lines
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();  // Number of integers in this line
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                tempList.add(sc.nextInt());
            }
            list.add(tempList);
        }

        int q = sc.nextInt();  // Number of queries
        // Reading and answering the queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // Line number
            int y = sc.nextInt(); // Position in the line
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
