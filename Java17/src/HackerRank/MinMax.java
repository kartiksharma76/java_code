package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class MinMaxSol {

	public static int maxMin(int k, List<Integer> arr) {
		Collections.sort(arr);
		int minUnfairness = Integer.MAX_VALUE;

		for (int i = 0; i <= arr.size() - k; i++) {
			int currentUnfairness = arr.get(i + k - 1) - arr.get(i);
			minUnfairness = Math.min(minUnfairness, currentUnfairness);
		}

		return minUnfairness;
	}
}

public class MinMax {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		int k = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		int result = MinMaxSol.maxMin(k, arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}