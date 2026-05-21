package Advancethreadingproblem;

import java.util.concurrent.Phaser;

public class PhaserLambdaExample {

	public static void main(String[] args) {

		Phaser phaser = new Phaser(3);

		Runnable task = () -> {

			System.out.println(Thread.currentThread().getName() + " Phase 1");

			phaser.arriveAndAwaitAdvance();

			System.out.println(Thread.currentThread().getName() + " Phase 2");
		};

		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
	}
}