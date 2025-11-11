package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Enter total number of socks: 9 Enter sock colours (space-separated): 10 20 20
 * 10 10 30 50 10 20 Total pairs of socks: 3
 */
class M {
	public static int socketMerchant(int n, List<Integer> ar) {
		Map<Integer, Integer> colorCount = new HashMap<>();

		for (int sock : ar) {
			colorCount.put(sock, colorCount.getOrDefault(sock, 0) + 1);
		}

		int pairs = 0;
		for (int count : colorCount.values()) {
			pairs += count / 2;
		}

		return pairs;
	}
}

public class SockMerchant {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter total number of socks:");
		int n = Integer.parseInt(bufferedReader.readLine().trim());

		System.out.println("Enter sock colours (space-separated):");
		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(Collectors.toList()); // ✅ fixed split(" ")

		int result = M.socketMerchant(n, ar);

		System.out.println("Total pairs of socks: " + result);

		bufferedReader.close();
	}
}
