package Hackerrankprepkit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result5 {
	/**
	 * Problem: Divisible Sum Pairs
	 *
	 * Given an array of integers and a number k, count the number of pairs (i, j)
	 * such that: - i < j - (ar[i] + ar[j]) % k == 0
	 *
	 * Example: Input: n = 6, k = 3 ar = [1, 3, 2, 6, 1, 2]
	 *
	 * Valid pairs: (1,2), (1,5), (2,4), (3,6), (4,5) → Total = 5
	 *
	 * Approach: - Use two nested loops - Check all pairs (i, j) where i < j - If
	 * sum % k == 0 → increment count
	 *
	 * Time Complexity: O(n^2) Space Complexity: O(1)
	 */

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				// ✅ FIXED condition
				if ((ar.get(i) + ar.get(j)) % k == 0) {
					count++;
				}
			}
		}

		return count;
	}
}

public class DivisibleSumPairs {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstInput = bufferedReader.readLine().split(" ");

		int n = Integer.parseInt(firstInput[0]);
		int k = Integer.parseInt(firstInput[1]);

		List<Integer> ar = Stream.of(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(toList());

		int result = Result5.divisibleSumPairs(n, k, ar);

		System.out.println(result);

		bufferedReader.close();
	}
}