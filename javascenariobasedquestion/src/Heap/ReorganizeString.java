package Heap;

import java.util.PriorityQueue;

public class ReorganizeString {
	public String reorganizeString(String s) {
		int[] freq = new int[26];
		for (char c : s.toCharArray())
			freq[c - 'a']++;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
		for (int i = 0; i < 26; i++)
			if (freq[i] > 0)
				pq.add(new int[] { freq[i], i });
		StringBuilder sb = new StringBuilder();
		while (pq.size() >= 2) {
			int[] a = pq.poll(), b = pq.poll();
			sb.append((char) ('a' + a[1]));
			sb.append((char) ('a' + b[1]));
			if (--a[0] > 0)
				pq.add(a);
			if (--b[0] > 0)
				pq.add(b);
		}
		if (!pq.isEmpty()) {
			if (pq.peek()[0] > 1)
				return "";
			sb.append((char) ('a' + pq.poll()[1]));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		ReorganizeString sol = new ReorganizeString();
		System.out.println(sol.reorganizeString("aab")); // aba
	}

}
