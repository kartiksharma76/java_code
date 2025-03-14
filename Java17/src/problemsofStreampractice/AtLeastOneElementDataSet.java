package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;

public class AtLeastOneElementDataSet {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,3,5,7,8);
	boolean hasEven=list.stream().anyMatch(n->n%2==0);
	System.out.println(hasEven);
}
}
