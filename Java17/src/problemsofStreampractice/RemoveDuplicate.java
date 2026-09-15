package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
public static void main(String[] args) {
	List<Integer>num=Arrays.asList(10, 20, 30, 20, 40, 50, 10, 60, 70, 50);
	List<Integer> list = num.stream().distinct().collect(Collectors.toList());
	System.out.println(list);
}
}
