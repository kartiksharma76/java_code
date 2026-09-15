package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadLocation {
	public static void main(String[] args) {
		Path path= Paths.get("C:\\Users\\kartik sharma\\Downloads\\test-folder2\\java8.PDF");
		Path target= Paths.get("C:\\kartik");
		System.out.println("file name "+path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		try {
			//Files.delete(path);
			Files.move(path, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
