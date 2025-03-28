package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;

public class SumUsingReduce {
public static void main(String[] args) {
	List<Integer> number=Arrays.asList(1,2,3,4,5);
	int sum=number.stream().reduce(0, Integer::sum);
	System.out.println("sum:"+sum);
}
}
