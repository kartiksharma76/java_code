package Advancethreadingproblem;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicbarrierEx {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(4);
		Runnable gameisstart = () -> {
			System.out.println("All  player is ready");
		};
		CyclicBarrier barrier = new CyclicBarrier(4, gameisstart);
		Runnable player = () -> {
			System.out.println("player:" + Thread.currentThread().getName() + "is");
			try {
				barrier.await(2, TimeUnit.SECONDS);
			} catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
				e.printStackTrace();
			}
		};
		ExecutorService service2 = Executors.newFixedThreadPool(4);
		while (true) {
			for (int i = 1; i <= 4; i++) {
				service2.submit(player);
			}
		}

	}
}