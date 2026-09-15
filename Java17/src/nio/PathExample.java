package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	public static void main(String[] args) {
		Path path=Paths.get("C:\\Users\\kartik sharma\\git\\repository\\java8.PDF ");
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileName());
		System.out.println(path.getFileSystem());
	}
}
