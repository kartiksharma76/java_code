package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class DyArray {

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

		List<List<Integer>> seqList = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		// Initialize n empty sequences
		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<>());
		}

		int lastAnswer = 0;

		// Process each query
		for (List<Integer> query : queries) {
			int type = query.get(0);
			int x = query.get(1);
			int y = query.get(2);

			int index = (x ^ lastAnswer) % n;

			if (type == 1) {
				seqList.get(index).add(y);
			} else if (type == 2) {
				List<Integer> seq = seqList.get(index);
				lastAnswer = seq.get(y % seq.size());
				result.add(lastAnswer);
			}
		}

		return result;
	}
}

public class DynamicArray {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstInput = bufferedReader.readLine().trim().split(" ");
		int n = Integer.parseInt(firstInput[0]);
		int q = Integer.parseInt(firstInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		for (int i = 0; i < q; i++) {
			List<Integer> query = Stream.of(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt)
					.collect(toList());
			queries.add(query);
		}

		List<Integer> result = DyArray.dynamicArray(n, queries);

		bufferedWriter.write(result.stream().map(String::valueOf).collect(joining("\n")));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}