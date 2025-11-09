package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter total number of pages: 6 Enter page number to turn to:5 Minimum page
 * turns :1
 */
class W {
	public static int pageCount(int n, int p) {
		int fromFront = p / 2;
		int fromBack = (n / 2) - (p / 2);
		return Math.min(fromFront, fromBack);
	}
}

public class DrawingBook {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter total number of pages: ");
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		System.out.print("Enter page number to turn to:");
		int p = Integer.parseInt(bufferedReader.readLine().trim());
		int result = W.pageCount(n, p);
		System.out.println("Minimum page turns :" + result);
		bufferedReader.close();
	}
}
