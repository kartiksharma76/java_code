package AdvanceThreadingConcepts;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierExample1 {
	public static void main(String[] args) {
		ExecutorService gameisstarted = Executors.newFixedThreadPool(1);
		Runnable mixeddoublecricketgamestart = () -> {
			System.out.println("all 11 player is ready best of luck..........");
		};
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4, mixeddoublecricketgamestart);
		Runnable player = () -> {
			System.out.println("players" + Thread.currentThread().getName() + "is ready");
			try {
				cyclicBarrier.await(2, TimeUnit.SECONDS);
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
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