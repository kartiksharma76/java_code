package javaDsaPattern;

import java.util.ArrayList;
import java.util.List;

public class GreyCode {
	public static List<Integer> greyCode(int n) {
		List<Integer> result = new ArrayList<>();
		int size = 1 << n;

		for (int i = 0; i < size; i++) {
			result.add(i ^ (i >> 1));
		}
		return result;

	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(greyCode(n));
	}
}
