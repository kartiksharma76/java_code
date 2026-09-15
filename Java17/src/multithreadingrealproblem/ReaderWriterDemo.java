package multithreadingrealproblem;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedDocument {

	private String data = "Java Multithreading";

	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void read() {

		lock.readLock().lock();

		try {

			System.out.println(Thread.currentThread().getName() + " is reading : " + data);

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();

		} finally {

			lock.readLock().unlock();
		}
	}

	public void write(String newData) {

		lock.writeLock().lock();

		try {

			System.out.println("\n" + Thread.currentThread().getName() + " is writing...");

			Thread.sleep(2000);

			data = newData;

			System.out.println("Updated Data : " + data);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();

		} finally {

			lock.writeLock().unlock();
		}
	}
}

public class ReaderWriterDemo {

	public static void main(String[] args) throws InterruptedException {

		SharedDocument document = new SharedDocument();

		Thread reader1 = new Thread(document::read, "Reader-1");

		Thread reader2 = new Thread(document::read, "Reader-2");

		Thread writer = new Thread(() -> document.write("Java Multithreading with ReadWriteLock"), "Writer");

		Thread reader3 = new Thread(document::read, "Reader-3");

		reader1.start();
		reader2.start();

		Thread.sleep(500);

		writer.start();

		writer.join();

		reader3.start();

		reader1.join();
		reader2.join();
		reader3.join();

		System.out.println("\nProgram Finished.");
	}
}