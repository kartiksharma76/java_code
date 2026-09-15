package Locking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProcedureConsumer {
	ReentrantLock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	public void produce() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + "Producing an item");
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		System.out.println(Thread.currentThread().getName() + "Producing an item Again");

	}

	public void consume() {
		lock.lock();
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + "Consuming an item");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		condition.signal();
	//	condition.signalAll();
//	System.out.println(Thread.currentThread().getName()+"Consuming an item again");
	}

	public static void main(String[] args) {
		ProcedureConsumer pc = new ProcedureConsumer();
		ExecutorService service = Executors.newFixedThreadPool(2);
		Runnable prodecer = () -> {
			pc.produce();
		};
		Runnable consumer = () -> {
			pc.consume();
		};
		service.submit(prodecer);
		service.submit(consumer);
		service.shutdown();
	}
}
