package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {
public static void main(String[] args) {
	List<Integer> num=Arrays.asList(1,2,3,4,5);
	List<Integer> sq=num.stream().map(n->n*n).collect(Collectors.toList());
	System.out.println("square:"+sq);
}
}
