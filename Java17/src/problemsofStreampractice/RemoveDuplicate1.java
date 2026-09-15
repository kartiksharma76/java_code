package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate1 {
public static void main(String[] args) {
	String input = "c,h,a,n,d,a,n";
    List<String> list = Arrays.asList(input.split(","));
	List<String>duplicate = list.stream().distinct().collect(Collectors.toList());
	System.out.println(duplicate);
}
}
 
