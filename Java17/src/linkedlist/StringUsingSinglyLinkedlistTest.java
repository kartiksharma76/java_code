package linkedlist;

public class StringUsingSinglyLinkedlistTest {
	public static void main(String[] args) {
		StringUsingSinglyLinkedList ll = new StringUsingSinglyLinkedList();
		ll.insert("kartikey");
		ll.insert("Sharma");
		ll.insert("Sirt collage bhopal");
		ll.insert("Student of csit");
		ll.insert("section: B");
		ll.reverse();
		ll.print();
		System.out.println();
		// ll.deletebyposition(2);
		ll.addFirst("my father name is kamlesh kumar sharma");
		ll.addLast("today i have completed a project in heckthon");
		ll.addmid(8, "village dighhi dist singrauli mp");
		// System.out.println(ll.contains("code"));
		ll.print();
		System.out.println();
		System.out.println("size:" + ll.size());
		ll.print();
	}
}
