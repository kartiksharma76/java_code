package multiThreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EvenThreadAndOddThread { 

	public static void main(String[] args) {

		Runnable evenThread = () -> {

			StringBuilder sb = new StringBuilder();

			for (int i = 1; i <= 10; i++) {

				if (i % 2 == 0) {

					sb.append(i).append(" ");
				}
			}

			// File inside multiThreading folder
			Path path = Paths.get("src", "multiThreading", "even.txt");

			System.out.println(path.toAbsolutePath());

			try {

				Files.write(path, sb.toString().trim().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE,
						StandardOpenOption.TRUNCATE_EXISTING);

				System.out.println("Data Saved Successfully");

			} catch (IOException e) {

				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(evenThread);

		t1.start();
	}
}