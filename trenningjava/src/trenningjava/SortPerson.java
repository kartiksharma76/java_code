package trenningjava;

import java.util.Comparator;
import java.util.TreeSet;

public class SortPerson {
	public static void main(String[] args) {
		Comparator<Person> nameComp = (p1, p2) -> p1.getName().compareTo(p2.getName());
		TreeSet<Person> people = new TreeSet<Person>(nameComp);
		people.add(new Person("Lili", 22));
		people.add(new Person("Polo", 21));
		people.add(new Person("Sam", 19));

		for (Person p : people) {
			System.out.println(p);
		}
	}
}
