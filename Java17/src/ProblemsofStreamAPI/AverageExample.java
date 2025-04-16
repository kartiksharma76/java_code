package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AverageExample {
public static void main(String[] args) {
	List<Integer>average=Arrays.asList(1,2,3,4,5,6,7,8,9);
	OptionalDouble a = average.stream().mapToInt(Integer::intValue).average();
	System.out.println("Average: " + (a.isPresent() ? a.getAsDouble() : "N/A"));
}
}
