package AdvanceThreading;

import java.util.concurrent.*;

public class CallableUsingExecuterService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            Thread.sleep(2000);
            return "taskcompleted !";
        };
        Future<String> future = executor.submit(task);
        try {
            String result = future.get();
            System.out.println("result from callable:" + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}