package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GridChallenge {
	public static String gridChallenge(List<String> grid) {
		int n = grid.size();
		char[][] arr = new char[n][];

		for (int i = 0; i < n; i++) {
			char[] row = grid.get(i).toCharArray();
			Arrays.sort(row);
			arr[i] = row;
		}

		for (int col = 0; col < arr[0].length; col++) {
			for (int row = 1; row < n; row++) {
				if (arr[row][col] < arr[row - 1][col]) {
					return "NO";
				}
			}
		}
		return "YES";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		List<String> grid = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			grid.add(sc.nextLine());
		}
		for (int i = 0; i < n; i++) {
			grid.add(sc.nextLine());
		}
	}
}
