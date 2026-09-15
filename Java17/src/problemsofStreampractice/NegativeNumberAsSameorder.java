package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NegativeNumberAsSameorder {
public static void main(String[] args) {
	/**
	 *  Given a List of integers, return a List which contains numbers and negative of those numbers in same order. \
	 *  For example, input list is [1, 2, 3, 4, 5, 6] then 
	 *  you should return a list containing [1, -1, 2, -2, 3, -3, 4, -4, 5, -5, 6, -6]
	 */
	List<Integer>numbers=Arrays.asList(1,2,3,4,5,6);
	List<Integer> numbersAndNegatives=numbers.stream().flatMap(x->Stream.of(x,-x)).collect(Collectors.toList());
	System.out.println(numbersAndNegatives);
}
}
