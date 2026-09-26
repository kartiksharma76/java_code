package generic;

public class GenStringTest {
    public static void main(String[] args) {
        GenericLinkedList<Object> list = new GenericLinkedList<>();

        list.insert(10);
        list.insert("Java");
        list.insert(20);
        list.insert("Spring Boot");
        list.addFirst("HTML");
        list.addLast(30);

        list.print();
    }
}
