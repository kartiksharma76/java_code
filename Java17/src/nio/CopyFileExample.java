package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFileExample {
public static void main(String[] args) {
	Path source=Paths.get("C:\\Users\\kartik sharma\\OneDrive\\Desktop\\java8");
	Path destination=Paths.get("C:\\Users\\kartik sharma\\Downloads\\test-folder2");
	try {
		//	Files.copy(source, destination.resolve(source.getFileName()),StandardCopyOption.REPLACE_EXISTING);
		    Files.move(source, destination.resolve(source.getFileName()),StandardCopyOption.REPLACE_EXISTING);
			System.out.println("file has been copied");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
