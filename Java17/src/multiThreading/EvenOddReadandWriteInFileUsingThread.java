package multiThreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * step 1: select the path  if you want to write
 * step 2: if file is not exist
 * step 3: 
 */
public class EvenOddReadandWriteInFileUsingThread {
    public static void main(String[] args) throws IOException {
        Runnable evenThread = () -> {
            String join = "";
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    String even = String.valueOf(i);
                    join = join + even + " ";
                }
            }
        
            Path path = Paths.get("EvenThread.txt");
            try {
                join = join.trim();
                // Ensure the file is created if it doesn't exist
                Files.write(path, join.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println("Even numbers written to EvenThread.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        Runnable oddThread = () -> {
        	String join="";
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
           
           
        };
      //  Thread t1= new Thread(oddThread, "OddThreadV1");
        Thread t2 = new Thread(evenThread, "EvenThreadV1");
     //   t1.start();
        t2.start();
       
    }
	
}
