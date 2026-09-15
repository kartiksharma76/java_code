package HackerRank;

/**
 * 9
10 5 20 20 4 5 2 25 1
2 4
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Results {
	public static List<Integer> breakingRecords(List<Integer> scores) {
		int min = scores.get(0);
		int max = scores.get(0);
		int minBreaks = 0;
		int maxBreaks = 0;

		for (int score : scores) {
			if (score > max) {
				max = score;
				maxBreaks++;
			}
			if (score < min) {
				min = score;
				minBreaks++;

			}
		}
		List<Integer> result = new ArrayList<>();
		result.add(maxBreaks);
		result.add(minBreaks);
		return result;

	}
}

public class BreakingRecords {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		List<Integer> scores = Arrays.stream(br.readLine().trim().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		List<Integer> result = Results.breakingRecords(scores);
		bw.write(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
		bw.newLine();
		bw.flush();
	}
}
