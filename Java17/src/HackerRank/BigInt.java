package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read the two big numbers as strings
        String a = scan.nextLine();
        String b = scan.nextLine();

        // Create BigInteger objects
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        // Perform addition and multiplication
        System.out.println(A.add(B));       // First line: A + B
        System.out.println(A.multiply(B));  // Second line: A * B

        scan.close();
    }
}
