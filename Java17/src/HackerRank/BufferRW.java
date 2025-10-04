package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result4 {
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		int n = arr.size();
		List<Integer> rotated = new ArrayList<>();
		// Add elements from d to end
		for (int i = d; i < n; i++) {
			rotated.add(arr.get(i));
		}
		// Add elements from start to d-1
		for (int i = 0; i < d; i++) {
			rotated.add(arr.get(i));
		}
		return rotated;
	}
}

public class BufferRW {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		int n = Integer.parseInt(firstMultipleInput[0]);
		int d = Integer.parseInt(firstMultipleInput[1]);
		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}
		List<Integer> result = Result4.rotateLeft(d, arr);
		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(String.valueOf(result.get(i)));
			if (i != result.size() - 1) {
				bufferedWriter.write(" ");
			}
		}
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
