package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());

		while (testCases-- > 0) {
			String pattern = sc.nextLine();
			try {
				Pattern.compile(pattern); // Try to compile the pattern
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}

		sc.close();
	}

}
