package AdvanceThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);
        ExecutorService service = Executors.newFixedThreadPool(4);
        List<Future<String>> result = new ArrayList<>();
        Callable<String> passanger = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + "has Arrived");
            Thread.sleep(2000);
            latch.countDown();

            if (latch.getCount() == 0) {
                System.out.println("All passangers arrived. Start the car!");
            } else {
                latch.await();
            }
            return name + "is  ready";
        };

        for (int i = 1; i <= 4; i++) {
            result.add(service.submit(passanger));
        }
        for (Future<String> future : result) {
            System.out.println(future.get());
        }
        System.out.println("Latch count :" + latch.getCount());
        service.shutdown();
    }
}
