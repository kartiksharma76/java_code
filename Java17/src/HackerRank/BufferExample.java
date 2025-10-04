package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result1 {
	public static List<Integer> reverseArray(List<Integer> a) {
		Collections.reverse(a);
		return a;

	}
}

public class BufferExample {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split("");
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < arrCount; i++) {
			int arritem = Integer.parseInt(arrTemp[i]);
			arr.add(arritem);
		}
		List<Integer> res = Result1.reverseArray(arr);
		for (int i = 0; i < res.size(); i++) {
			bufferedWriter.write(String.valueOf(res.get(i)));
			if (i != res.size() - 1) {
				bufferedWriter.write(" ");

			}
		}
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
