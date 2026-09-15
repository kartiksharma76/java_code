package HackerRank;

import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
           
        // Trim the input to avoid leading/trailing spaces causing empty tokens
        s = s.trim();
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split based on any non-alphabetic character
        String[] tokens = s.split("[^A-Za-z]+");
        
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        
        scan.close();
    }
 
}
