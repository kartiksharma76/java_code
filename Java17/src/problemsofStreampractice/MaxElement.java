package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;

public class MaxElement {
public static void main(String[] args) {
	List<Integer>number=Arrays.asList(2,4,8,6,10);
	int max=number.stream().mapToInt(Integer::intValue).max().orElseThrow();
	System.out.println(max);
	int min= number.stream().mapToInt(Integer::intValue).min().orElseThrow();
	System.out.println(min);

	
	
}
}
