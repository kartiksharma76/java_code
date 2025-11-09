package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class B {
	public static void bonApptit(List<Integer> bill, int k, int b) {
		int total = 0;

		for (int i = 0; i < bill.size(); i++) {
			if (i != k) {
				total += bill.get(i);
			}
		}
		int actualShare = total / 2;

		if (b == actualShare) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - actualShare);
		}
	}
}

public class BonAppetit {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n(items) and k(index of item Anna didn't eat):");
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		int n = Integer.parseInt(firstMultipleInput[0]);
		int k = Integer.parseInt(firstMultipleInput[1]);
		System.out.println("Enter the cost of each item :");
		List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());
		System.out.println("Enter the amount Anna was Charged:");
		int b = Integer.parseInt(bufferedReader.readLine().trim());
		B.bonApptit(bill, k, b);
		bufferedReader.close();
	}
}
