package collagetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : input.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
