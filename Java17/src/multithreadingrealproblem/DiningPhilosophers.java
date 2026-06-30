package multithreadingrealproblem;

import java.util.concurrent.locks.ReentrantLock;

class Philosopher implements Runnable {

	private final int id;
	private final ReentrantLock leftFork;
	private final ReentrantLock rightFork;

	public Philosopher(int id, ReentrantLock leftFork, ReentrantLock rightFork) {

		this.id = id;
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}

	@Override
	public void run() {

		try {

			think();

			if (id == 5) {

				rightFork.lock();
				leftFork.lock();

			} else {

				leftFork.lock();
				rightFork.lock();
			}

			eat();

		} finally {

			leftFork.unlock();
			rightFork.unlock();
		}
	}

	private void think() {

		System.out.println("Philosopher " + id + " is Thinking.");

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}

	private void eat() {

		System.out.println("Philosopher " + id + " is Eating.");

		try {

			Thread.sleep(2000);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}
}

public class DiningPhilosophers {

	public static void main(String[] args) throws InterruptedException {

		ReentrantLock[] forks = new ReentrantLock[5];

		for (int i = 0; i < 5; i++) {

			forks[i] = new ReentrantLock();
		}

		Thread[] philosophers = new Thread[5];

		for (int i = 0; i < 5; i++) {

			ReentrantLock left = forks[i];

			ReentrantLock right = forks[(i + 1) % 5];

			philosophers[i] = new Thread(new Philosopher(i + 1, left, right));
		}

		for (Thread p : philosophers)
			p.start();

		for (Thread p : philosophers)
			p.join();

		System.out.println("\nDinner Finished.");
	}
}