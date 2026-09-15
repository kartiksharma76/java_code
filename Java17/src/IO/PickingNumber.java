package IO;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {

	public static int pickingNumbers(List<Integer> a) {

		int maxLen = 0;

		for (int num : a) {
			int count = 0;

			for (int x : a) {
				if (x == num || x == num + 1) {
					count++;
				}
			}

			if (count > maxLen) {
				maxLen = count;
			}
		}

		return maxLen;
	}
}

public class PickingNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(toList());

		int result = Result.pickingNumbers(a);

		System.out.println(result);

		bufferedReader.close();
	}
}