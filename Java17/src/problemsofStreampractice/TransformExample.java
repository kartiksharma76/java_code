package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//transform each element into a different data type and collect the result.
public class TransformExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		List<String> strnumber = list.stream().map(i -> "num:" + i).collect(Collectors.toList());
		System.out.println("Transfor number:" + strnumber);
	}
}
