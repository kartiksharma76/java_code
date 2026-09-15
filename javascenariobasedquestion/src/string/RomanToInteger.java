package string;

import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			int val = map.get(s.charAt(i));
			if (i + 1 < s.length() && val < map.get(s.charAt(i + 1)))
				result -= val;
			else
				result += val;
		}
		return result;
	}

	public static void main(String[] args) {
		RomanToInteger sol = new RomanToInteger();
		System.out.println(sol.romanToInt("MCMXCIV"));
	}
}
