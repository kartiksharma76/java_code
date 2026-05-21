package Advancethreadingproblem;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;
import java.util.*;

public class FoodDeliverySystem {

	// =========================================
	// Shared Resources
	// =========================================

	static BlockingQueue<String> orderQueue = new ArrayBlockingQueue<>(10);

	static ConcurrentHashMap<Integer, String> orders = new ConcurrentHashMap<>();

	static AtomicInteger orderIdGenerator = new AtomicInteger(1);

	static Semaphore chefSemaphore = new Semaphore(2);

	static ReentrantLock paymentLock = new ReentrantLock();

	static ReadWriteLock inventoryLock = new ReentrantReadWriteLock();

	static ExecutorService executor = Executors.newFixedThreadPool(5);

	static CountDownLatch orderLatch = new CountDownLatch(2);

	static CyclicBarrier deliveryBarrier = new CyclicBarrier(2,
			() -> System.out.println("\nAll delivery partners ready\n"));

	static Phaser phaser = new Phaser(2);

	static ForkJoinPool forkJoinPool = new ForkJoinPool();

	static int inventory = 10;

	// =========================================
	// Main Method
	// =========================================

	public static void main(String[] args) throws Exception {

		System.out.println("\n=========== FOOD DELIVERY SYSTEM ===========\n");

		// =========================================
		// Customer Places Orders
		// Thread + Runnable + Lambda
		// =========================================

		Runnable customerTask = () -> {

			try {

				int orderId = orderIdGenerator.incrementAndGet();

				String order = "Order-" + orderId;

				orderQueue.put(order);

				orders.put(orderId, "PLACED");

				System.out.println(Thread.currentThread().getName() + " placed " + order);

			} catch (Exception e) {
				e.printStackTrace();
			}
		};

		Thread customer1 = new Thread(customerTask, "Customer-1");

		Thread customer2 = new Thread(customerTask, "Customer-2");

		customer1.start();
		customer2.start();

		customer1.join();
		customer2.join();

		// =========================================
		// Chef Cooking
		// Semaphore + BlockingQueue + ExecutorService
		// =========================================

		Runnable chefTask = () -> {

			try {

				chefSemaphore.acquire();

				String order = orderQueue.take();

				System.out.println(Thread.currentThread().getName() + " cooking " + order);

				Thread.sleep(2000);

				System.out.println(order + " cooked");

				orderLatch.countDown();

				chefSemaphore.release();

			} catch (Exception e) {
				e.printStackTrace();
			}
		};

		executor.execute(chefTask);
		executor.execute(chefTask);

		// =========================================
		// Wait until all food cooked
		// CountDownLatch
		// =========================================

		orderLatch.await();

		System.out.println("\nAll Orders Cooked\n");

		// =========================================
		// Payment Processing
		// ReentrantLock
		// =========================================

		Runnable paymentTask = () -> {

			paymentLock.lock();

			try {

				System.out.println(Thread.currentThread().getName() + " processing payment");

				Thread.sleep(1000);

				System.out.println("Payment Successful");

			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				paymentLock.unlock();
			}
		};

		Thread payment1 = new Thread(paymentTask);

		Thread payment2 = new Thread(paymentTask);

		payment1.start();
		payment2.start();

		payment1.join();
		payment2.join();

		// =========================================
		// Inventory Management
		// ReadWriteLock
		// =========================================

		Runnable readInventory = () -> {

			inventoryLock.readLock().lock();

			try {

				System.out.println(Thread.currentThread().getName() + " checking inventory : " + inventory);

			} finally {

				inventoryLock.readLock().unlock();
			}
		};

		Runnable updateInventory = () -> {

			inventoryLock.writeLock().lock();

			try {

				inventory--;

				System.out.println(Thread.currentThread().getName() + " updated inventory : " + inventory);

			} finally {

				inventoryLock.writeLock().unlock();
			}
		};

		new Thread(readInventory).start();

		new Thread(updateInventory).start();

		Thread.sleep(1000);

		// =========================================
		// Delivery Partners Ready
		// CyclicBarrier
		// =========================================

		Runnable deliveryTask = () -> {

			try {

				System.out.println(Thread.currentThread().getName() + " reached restaurant");

				deliveryBarrier.await();

				System.out.println(Thread.currentThread().getName() + " delivering order");

			} catch (Exception e) {
				e.printStackTrace();
			}
		};

		new Thread(deliveryTask, "DeliveryBoy-1").start();

		new Thread(deliveryTask, "DeliveryBoy-2").start();

		Thread.sleep(2000);

		// =========================================
		// Order Tracking Phases
		// Phaser
		// =========================================

		Runnable trackingTask = () -> {

			System.out.println(Thread.currentThread().getName() + " Order Picked");

			phaser.arriveAndAwaitAdvance();

			System.out.println(Thread.currentThread().getName() + " Order Delivered");
		};

		new Thread(trackingTask).start();
		new Thread(trackingTask).start();

		Thread.sleep(2000);

		// =========================================
		// Analytics Processing
		// Callable + Future + ForkJoinPool
		// =========================================

		Callable<Integer> analyticsTask = () -> {

			int totalOrders = 0;

			for (int i = 1; i <= 100; i++) {

				totalOrders += i;
			}

			return totalOrders;
		};

		Future<Integer> analyticsResult = executor.submit(analyticsTask);

		System.out.println("\nAnalytics Total : " + analyticsResult.get());

		Future<Integer> forkJoinResult = forkJoinPool.submit(() -> {

			int revenue = 0;

			for (int i = 1; i <= 50; i++) {

				revenue += i * 10;
			}

			return revenue;
		});

		System.out.println("Revenue Calculated : " + forkJoinResult.get());

		// =========================================
		// Async Notification
		// CompletableFuture
		// =========================================

		CompletableFuture.supplyAsync(() -> {

			return "Order Delivered";
		})

				.thenApply(message -> message + " Successfully")

				.thenAccept(System.out::println);

		Thread.sleep(1000);

		// =========================================
		// Final Orders
		// ConcurrentHashMap
		// =========================================

		System.out.println("\n=========== FINAL ORDERS ===========");

		orders.forEach((id, status) -> {

			System.out.println("Order ID : " + id + " Status : " + status);
		});

		// =========================================
		// AtomicInteger
		// =========================================

		System.out.println("\nTotal Orders Generated : " + orderIdGenerator);

		// =========================================
		// Shutdown
		// =========================================

		executor.shutdown();

		forkJoinPool.shutdown();

		System.out.println("\n=========== SYSTEM CLOSED ===========");
	}
}
