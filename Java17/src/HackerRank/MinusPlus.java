package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class finalResult {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */
	public static void plusMinus(List<Integer> arr) {
		int n = arr.size();
		int pos = 0;
		int neg = 0;
		int zero = 0;

		for (int num : arr) {
			if (num > 0)
				pos++;
			else if (num < 0)
				neg++;
			else
				zero++;
		}

		System.out.printf("%.6f%n", (double) pos / n);
		System.out.printf("%.6f%n", (double) neg / n);
		System.out.printf("%.6f%n", (double) zero / n);
	}
}

public class MinusPlus {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt)
				.collect(toList());

		finalResult.plusMinus(arr);

		bufferedReader.close();
	}
}
