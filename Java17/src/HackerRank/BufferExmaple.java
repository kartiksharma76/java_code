package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result2 {
	public static int hourglassSum(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
						+ arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}
}

public class BufferExmaple {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		List<List<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split("");
			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < 6; j++) {
				int arritem = Integer.parseInt(arrRowTempItems[j]);
				arrRowItems.add(arritem);
			}
			arr.add(arrRowItems);

		}
		int result = Result2.hourglassSum(arr);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();

	}
}
