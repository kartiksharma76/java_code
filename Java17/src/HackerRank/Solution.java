package HackerRank;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		// 1. Sum of lengths
		System.out.println(A.length() + B.length());

		// 2. Lexicographic comparison
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		// 3. Capitalize first letter and print
		String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
		String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(capitalizedA + " " + capitalizedB);

		sc.close();
	}

}
