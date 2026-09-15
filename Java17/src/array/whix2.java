package array;

import java.util.ArrayList;
import java.util.List;

public class whix2 {
public static void main(String[] args) {
	List<String> string =new ArrayList<String>();
	string.add("A");
	string.add("B");
	string.add("C");
	String[] arr = new String[2];
	arr = string.toArray(arr);
	for(String s:arr) {
		System.out.print(s);
	}
}
}
