package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
//in the problem Check if at least one element in a dataset matches a given condition.using the anymatch
public class AnyMatchExample {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(10,20,30,40,50);
	boolean anyNumberGreaterthan25=list.stream().anyMatch(i->i>25);
	System.out.println(anyNumberGreaterthan25);
	
}
}
