package HackerRank;

import java.util.*;

public class MissingNumbers {

	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : brr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int num : arr) {
			map.put(num, map.get(num) - 1);
		}

		List<Integer> result = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 0) {
				result.add(entry.getKey());
			}
		}

		Collections.sort(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++)
			arr.add(sc.nextInt());

		int m = sc.nextInt();
		List<Integer> brr = new ArrayList<>();
		for (int i = 0; i < m; i++)
			brr.add(sc.nextInt());

		List<Integer> result = missingNumbers(arr, brr);
		for (int num : result) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}