package AdvanceThreadingConcepts;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierExample {
	public static void main(String[] args) {
		ExecutorService gameStartService = Executors.newFixedThreadPool(1);
		Runnable mixedDoubleTenisGameStart = () -> {
			System.out.println("All 4 players ready, game starts, best of luck...");
		};
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4, mixedDoubleTenisGameStart);
		Runnable player = () -> {
			System.out.println("Player " + Thread.currentThread().getName() + " is ready");
			try {
				cyclicBarrier.await(2, TimeUnit.SECONDS);
				// System.out.println(cyclicBarrier.getNumberWaiting());
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		};
		ExecutorService service = Executors.newFixedThreadPool(4);
		while (true) {
			for (int i = 1; i <= 4; i++) {
				service.submit(player);
			}
		}

//		if(cyclicBarrier.getNumberWaiting()==0) {
//			gameStartService.submit(mixedDoubleTenisGameStart);
//		}
		// System.out.println(cyclicBarrier.getParties());
	}

}
