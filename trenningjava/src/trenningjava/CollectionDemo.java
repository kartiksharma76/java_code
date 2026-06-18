package trenningjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Microsoft");
		lst.add("Google");
		lst.add("Apple");
		lst.add("Oracal");
		lst.add(2, "Apacche ");

		System.out.println("-- Iterating using for loop");
		for (int i = 0; i < lst.size(); i++)
			System.out.println(lst.get(i));

		System.out.println("\n-- Iteratiog using Iterator");
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("\nIterating using for-each");
		for (String c : lst)
			System.out.println(c);

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");

		ar.addAll(lst);
		System.out.println("\n-- Iterating over merge collection");
		for (String e : ar)
			System.out.println(e);

		TreeSet<String> tree = new TreeSet<String>();
		System.out.println("\n-- iterative over shorted collection");
		for (String e : tree)
			System.out.println(e);

	}
}
