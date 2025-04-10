package multiThreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.time.Instant;

public class EvenOddTableWriteFileUsingThread {
public static void main(String[] args) {
	Instant start=Instant.now();
	Runnable evenThread=()->{
	Path path =Paths.get("EvenTable.txt");
	try {
		Files.write(path," ".getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		for(int i=2;i<=20;i += 2) {
			StringBuilder table= new StringBuilder("Table of"+ i+"\n");
			 for (int j = 1; j <= 10; j++) {
                 table.append(String.format("%2d * %2d = %3d\n", i, j, i * j));
			 }
			 table.append("\n");
			 Files.write(path, table.toString().getBytes(),StandardOpenOption.APPEND);
		}
		System.out.println("Even tables written to EvenTable.txt");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	};
	Runnable oddThread=()->{
		Path path =Paths.get("EvenTable.txt");
		try {
			Files.write(path," ".getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			for(int i=1;i<=19;i += 2) {
				StringBuilder table= new StringBuilder("Table of"+ i+"\n");
				 for (int j = 1; j <= 10; j++) {
	                 table.append(String.format("%2d * %2d = %3d\n", i, j, i * j));
				 }
				 table.append("\n");
				 Files.write(path, table.toString().getBytes(),StandardOpenOption.APPEND);
			}
			System.out.println("Odd tables written to OddTables.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		};
		Thread t1=new Thread(evenThread);
		Thread t2= new Thread(oddThread);
		t1.start();
		t2.start();
	Instant end= Instant.now();
	 System.out.println("Total time taken "+Duration.between(start, end).toMillis()+" ms");
}
}
