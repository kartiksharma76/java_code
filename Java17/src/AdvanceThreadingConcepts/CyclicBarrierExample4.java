package AdvanceThreadingConcepts;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierExample4 {
	public static void main(String[] args) {
		ExecutorService gamestartservice = Executors.newFixedThreadPool(1);
		Runnable mixedDoubleTenisegamestart = () -> {
			System.out.println("all player is ready game start bestofluck");
		};
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4, mixedDoubleTenisegamestart);
		Runnable player = () -> {
			System.out.println("player:" + Thread.currentThread().getName() + "is ready");
			try {
				cyclicBarrier.await(2, TimeUnit.SECONDS);
			} catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
				e.printStackTrace();
			}
		};
		ExecutorService service = Executors.newFixedThreadPool(4);
		while (true) {
			for (int i = 1; i <= 4; i++) {
				service.submit(player);
			}
		}
	}
}
