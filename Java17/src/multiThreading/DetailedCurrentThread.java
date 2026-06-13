package multiThreading;

public class DetailedCurrentThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println("Thread Name : " + t.getName());
		System.out.println("Prioity :" + t.getPriority());
		System.out.println("Thread Id:" + t.getId());
	}
}
