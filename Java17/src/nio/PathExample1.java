package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample1 {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\kartik sharma\\OneDrive\\Desktop\\Vac");
		System.out.println("Root: " + path.getRoot());
		System.out.println("Parent: " + path.getParent());
		System.out.println("File Name: " + path.getFileName());
		System.out.println("File System: " + path.getFileSystem());
	}
}
