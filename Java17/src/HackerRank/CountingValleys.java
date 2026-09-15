package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

/**
 * 8 UDDDUDUU 1
 */
class H {
	public static int countingValleys(int steps, String path) {
		int valleys = 0;
		int level = 0;

		for (char step : path.toCharArray()) {
			if (step == 'U')
				level++;
			else
				level--;

			if (step == 'U' && level == 0)
				valleys++;
		}
		return valleys;
	}
}

public class CountingValleys {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int steps = Integer.parseInt(bufferedReader.readLine().trim());
		String path = bufferedReader.readLine().trim();

		int result = H.countingValleys(steps, path);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.flush();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
