package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Enter budget, number of keyboards and drives: 10 2 3 Enter keyboard prices: 3
 * 1 Enter drive prices: 5 2 8 Maximum money spent: 9
 * 
 */
class X {
	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int maxSpent = -1;
		for (int k : keyboards) {
			for (int d : drives) {
				int total = k + d;
				if (total <= b && total > maxSpent) {
					maxSpent = total;
				}
			}
		}
		return maxSpent;
	}
}

public class ElectronicsShop {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		System.out.println("Enter budget, number of keyboards and drives:");
		String[] bnm = bufferedReader.readLine().trim().split(" ");
		int b = Integer.parseInt(bnm[0]);
		int n = Integer.parseInt(bnm[1]);
		int m = Integer.parseInt(bnm[2]);

		System.out.println("Enter keyboard prices:");
		int[] keyboards = Stream.of(bufferedReader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

		System.out.println("Enter drive prices:");
		int[] drives = Stream.of(bufferedReader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

		int moneySpent = X.getMoneySpent(keyboards, drives, b);

		bufferedWriter.write("Maximum money spent: " + moneySpent);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
