package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/**
 * Enter n and k: 6 3 Enter array elements: 1 3 2 6 1 2
 */
class Output1 {

	/*
	 * Complete the 'divisibleSumPairs' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER k 3. INTEGER_ARRAY ar
	 */

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0) {
					count++;
				}
			}
		}
		return count;
	}
}

public class DivisibleSumpair {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter n and k:");
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);
		int k = Integer.parseInt(firstMultipleInput[1]);

		System.out.println("Enter array elements:");
		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = Output1.divisibleSumPairs(n, k, ar);

		System.out.println("Total divisible pairs: " + result);

		bufferedReader.close();
	}
}
