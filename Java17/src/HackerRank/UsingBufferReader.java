package HackerRank;

/**
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			String[] input = reader.readLine().split(" ");
			for (int j = 0; j < 6; j++) {
				// arr[i][j] = scanner.nextInt();
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		int maxsum = Integer.MIN_VALUE;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (sum > maxsum) {
					maxsum = sum;
				}
			}
		}
		System.out.println(maxsum);
		reader.close();
	}
}
