package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadExample {
public static void main(String[] args) {
	Path path=Paths.get("myTest.txt");
	try {
		List<String> allLines = Files.readAllLines(path);
		System.out.println(allLines.size());
		allLines.forEach(System.out::println);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
