package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MiddleEmenet {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
		Optional<Integer> middle = num.stream().skip(num.size() / 2).findFirst();
		middle.ifPresentOrElse(value -> System.out.println("Middle element: " + value),
				() -> System.out.println("List is empty"));
	}
}
