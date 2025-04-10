package multiThreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.time.Instant;

public class PrintTableEven {
	public static void main(String[] args) {
		Instant start = Instant.now();
		Runnable table = () -> {
			StringBuilder join = new StringBuilder();

			for (int a = 1; a <= 20; a++) {
				join.append("Table of").append(a).append(":").append(System.lineSeparator());
				for (int i = 1; i <= 10; i++) {
					String line = a + " * " + i + " = " + (a * i);
					join.append(line).append(System.lineSeparator());
				}
				join.append(System.lineSeparator());
			}
			Path path = Paths.get("table_of_1_to_20.txt");

			try {
				Files.write(path, join.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
				System.out.println("Table has been written to the file successfully."); // Only this one message
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		Thread thread = new Thread(table);
		thread.start();
		Instant end = Instant.now();
		System.out.println("Total time taken " + Duration.between(start, end).toMillis() + " ms");
	}
}
