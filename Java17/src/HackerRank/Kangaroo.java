package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 0 3 4 2 YES
 */
public class Kangaroo {
	public static String Kangaroo(int x1, int v1, int x2, int v2) {
		if (x1 == x2)
			return "YES";
		if (v1 == v2)
			return "NO";

		if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) >= 0) {
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().trim().split(" ");
		int x1 = Integer.parseInt(input[0]);
		int v1 = Integer.parseInt(input[1]);
		int x2 = Integer.parseInt(input[2]);
		int v2 = Integer.parseInt(input[3]);

		String result = Kangaroo(x1, v1, x2, v2);
		bw.write(result);
		bw.newLine();
		bw.flush();
		bw.close();
		bw.close();
	}
}
