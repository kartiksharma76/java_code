package Hackerrankprepkit;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * Problem: Breaking the Records
 *
 * Maria plays basketball and keeps track of her game scores.
 * She wants to know how many times she breaks:
 * 1. Her highest score record
 * 2. Her lowest score record
 *
 * Initially, the first score is considered both highest and lowest.
 *
 * For each game:
 * - If score > current max → new max record (increment maxCount)
 * - If score < current min → new min record (increment minCount)
 *
 * Return:
 * A list of two integers:
 * [maxRecordBreakCount, minRecordBreakCount]
 *
 * Example:
 * Input:  [10, 5, 20, 20, 4, 5, 2, 25, 1]
 * Output: [2, 4]
 *
 * Explanation:
 * Max breaks → 20, 25 → 2 times
 * Min breaks → 5, 4, 2, 1 → 4 times
 *
 * Approach:
 * - Initialize max and min with first element
 * - Traverse list from index 1
 * - Update counters whenever record breaks
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Result4 {
	public static List<Integer> breakingRecords(List<Integer> scores) {

		int max = scores.get(0);
		int min = scores.get(0);

		int maxCount = 0;
		int minCount = 0;

		for (int i = 1; i < scores.size(); i++) {
			int score = scores.get(i);

			if (score > max) {
				max = score;
				maxCount++;
			} else if (score < min) {
				min = score;
				minCount++;
			}
		}

		return Arrays.asList(maxCount, minCount);
	}
}

public class BreakingRecords {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> scores = Stream.of(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(toList());

		List<Integer> result = Result4.breakingRecords(scores);

		// ✅ Safe output (works everywhere)
		System.out.println(result.stream().map(Object::toString).collect(joining(" ")));

		bufferedReader.close();
	}
}