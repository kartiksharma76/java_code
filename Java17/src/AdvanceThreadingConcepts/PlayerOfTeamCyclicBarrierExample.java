package AdvanceThreadingConcepts;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PlayerOfTeamCyclicBarrierExample {
	public static void main(String[] args) throws InterruptedException {
		while(true) {
		Runnable tennicegameStart = () -> {
			System.out.println(" All 4 players ready, game starts, best of luck...");

		};

		CyclicBarrier barrier = new CyclicBarrier(4, tennicegameStart);
		ExecutorService service = Executors.newFixedThreadPool(4);

		Runnable player = () -> {
			String playerName = Thread.currentThread().getName();
			System.out.println("🏃" + playerName + "is warming");
			int delay = ThreadLocalRandom.current().nextInt(1000, 3000);
			try {
				Thread.sleep(delay);
				System.out.println("✅" + playerName + " is ready and waiting at the net...");

				barrier.await(5, TimeUnit.SECONDS);
				System.out.println("🎯 " + playerName + " is in position for the match!");

			} catch (InterruptedException | BrokenBarrierException | TimeoutException e) {

				System.out.println("⏰ " + playerName + " - Waited too long and missed the game!");
			}

		};
		for (int i = 1; i <= 4; i++) {
			service.submit(player);
			Thread.sleep(2000);

		}
		service.shutdown();
	}
}
}