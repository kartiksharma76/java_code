package NPTL25;

import java.util.Scanner;

public class W07_P3 {
	// Function to compute the sum of all prime numbers in a given range
    public static int primeSum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Helper function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n < 2) { 
        	return false;
        }
        if (n == 2) {
        	return true;
        }
        if (n % 2 == 0) {
        	return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
            	return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(primeSum(x, y));
    }
}
