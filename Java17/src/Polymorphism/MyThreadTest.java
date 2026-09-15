package Polymorphism;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();

		thread1.setName("thread1");
		thread2.setName("thread2");

		thread1.start();
		thread2.start();
	}
}
