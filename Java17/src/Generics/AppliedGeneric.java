package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppliedGeneric {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();
	//  boolean containsAll(Collection<?> c);
	list.containsAll(list);
}
}
