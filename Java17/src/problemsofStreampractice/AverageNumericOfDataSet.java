package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;

public class AverageNumericOfDataSet {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		double average = list.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
		System.out.println(average);
	}
}
