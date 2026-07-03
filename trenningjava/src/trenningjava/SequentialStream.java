package trenningjava;

import java.util.Arrays;
import java.util.List;

public class SequentialStream {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		numbers.stream().forEach(n -> System.out.println(Thread.currentThread().getName() + " : " + n));
	}
}