package queue;

public class DeleteMideTest {
public static void main(String[] args) {
	DeleteMide m=new DeleteMide();
	m.enqueue(60);
	m.enqueue(50);
	m.enqueue(40);
	m.enqueue(30);
	m.enqueue(20);
	m.enqueue(10);
	m.print();
	
}
}
