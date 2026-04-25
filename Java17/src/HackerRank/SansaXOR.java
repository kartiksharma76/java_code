package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SansaXOR {
	public static int sansaXor(List<Integer> arr) {
		int n = arr.size();

		if (n % 2 == 0)
			return 0;

		int result = 0;
		for (int i = 0; i < n; i += 2) {
			result ^= arr.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		System.out.println(sansaXor(arr));

		sc.close();
	}
}
