package HackerRank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		Arrays.sort(s, 0, n, new Comparator<String>() {
			public int compare(String a, String b) {
				BigDecimal ava1 = new BigDecimal(a);
				BigDecimal bva1 = new BigDecimal(b);
				return bva1.compareTo(bva1);
			}
		});
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
