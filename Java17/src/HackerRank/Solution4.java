package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print 
        output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of initial elements
        List<Integer> list = new ArrayList<>();
        
        // Read initial list elements
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        int q = sc.nextInt(); // Number of queries
        
        while (q-- > 0) {
            String command = sc.next(); // Read command: Insert or Delete
            
            if (command.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value); // Insert value at index
            } else if (command.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index); // Remove element at index
            }
        }
        
        // Print final list
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
    
}
