package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DynamicCondition {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
	List<Integer> collect = list.stream().filter(num->num>50).collect(Collectors.toList());
	System.out.println(collect);
}
}
