package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
//in this problem Check if all elements in a dataset satisfy a given condition.using AllMatch
public class AllMatchExample {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(10,20,30,40,50);
	boolean allnumbergreaterthanfive=list.stream().allMatch(i->i>50);
	System.out.println(allnumbergreaterthanfive);
}
}
