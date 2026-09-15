package AdvanceThreadingConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PlayerOfteamCyclicBarrier {
	 public static void main(String[] args) throws InterruptedException {
	        while (true) {
	            Runnable tennicegameStart = () -> {
	                System.out.println("🎾 All 4 players ready, game starts, best of luck...");
	            };

	            CyclicBarrier barrier = new CyclicBarrier(4, tennicegameStart);
	            ExecutorService service = Executors.newFixedThreadPool(4);

	            Callable<String> player = () -> {
	                String playerName = Thread.currentThread().getName();
	                System.out.println("🏃 " + playerName + " is warming up...");
	                int delay = ThreadLocalRandom.current().nextInt(1000, 3000);

	                try {
	                    Thread.sleep(delay);
	                    System.out.println("✅ " + playerName + " is ready and waiting at the net...");

	                    barrier.await(5, TimeUnit.SECONDS);
	                    System.out.println("🎯 " + playerName + " is in position for the match!");
	                    return playerName + " joined the match successfully.";
	                } catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
	                    System.out.println("⏰ " + playerName + " - Waited too long and missed the game!");
	                    return playerName + " failed to join the match.";
	                }
	            };

	            List<Future<String>> results = new ArrayList<>();

	            for (int i = 1; i <= 4; i++) {
	                Future<String> future = service.submit(player);
	                results.add(future);
	                Thread.sleep(2000); 
	            }

	            for (Future<String> result : results) {
	                try {
	                    System.out.println("Result: " + result.get());
	                } catch (ExecutionException e) {
	                }
	            }

	            service.shutdown();
	            service.awaitTermination(10, TimeUnit.SECONDS);
	        }
	    }
	}
