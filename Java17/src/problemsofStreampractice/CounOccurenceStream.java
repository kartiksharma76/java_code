package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CounOccurenceStream {
public static void main(String[] args) {
	List<String>data=Arrays.asList("AMAN", "MOHAN", "TWINKLE", "KARTIK", "PRINCE", "KUNDAN");
	Map<String, Long> frequency=data.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
	System.out.println(frequency);
}
}
