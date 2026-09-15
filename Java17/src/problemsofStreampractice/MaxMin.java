package problemsofStreampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Given a list of integers, find maximum and minimum of those numbers
public class MaxMin {
	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("maximumelement:" + max);
		int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println("minimumelement:" + min);
	}
}
