package HackerRank;

import java.util.*;

public class FullCountingSort {

	public static void countSort(List<List<String>> arr) {
		int n = arr.size();
		List<List<String>> buckets = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			buckets.add(new ArrayList<>());
		}

		for (int i = 0; i < n; i++) {
			int index = Integer.parseInt(arr.get(i).get(0));
			String value = (i < n / 2) ? "-" : arr.get(i).get(1);
			buckets.get(index).add(value);
		}

		StringBuilder output = new StringBuilder();
		for (List<String> bucket : buckets) {
			for (String s : bucket) {
				output.append(s).append(" ");
			}
		}

		System.out.println(output.toString().trim());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		List<List<String>> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] parts = sc.nextLine().split(" ");
			arr.add(Arrays.asList(parts[0], parts[1]));
		}

		countSort(arr);

		sc.close();
	}
}