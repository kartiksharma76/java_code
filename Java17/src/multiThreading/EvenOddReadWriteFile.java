package multiThreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EvenOddReadWriteFile {
	public static void main(String[] args) throws IOException {
		Runnable evenThread = () -> {
			String join = " ";
			for (int i = 1; i <= 10; i++) {

				if (i % 2 == 0) {
					String even = String.valueOf(i);
					join = join + even + " ";
				}

			}
			Path path = Paths.get("EvenThread2.txt");
			try {
				join.trim();
				Files.write(path, join.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
				System.out.println("Even numbers written to EvenThread.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable oddThread = () -> {
			String join = "";
			for (int i = 1; i <= 10; i++) {
				if (i % 2 != 0) {
					String odd = String.valueOf(i);
					join = join + odd + " ";
				}
			}
			Path path = Paths.get("OddThread1.txt");
			try {

				join.trim();
				Files.write(path, join.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
				System.out.println("odd numbers written to oddThread.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(oddThread, "OddThreadV1");
		Thread t2 = new Thread(evenThread, "EvenThreadV1");
		t1.start();
		t2.start();

	}
}


