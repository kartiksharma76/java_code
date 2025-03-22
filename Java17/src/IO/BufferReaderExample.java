package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;

public class BufferReaderExample {
public static void main(String[] args) {
//	File file= new File("test.txt");
//	FileReader fr=new FileReader(file);
//	BufferedReader br=new BufferedReader(fr);
	Instant start=Instant.now();
	try (BufferedReader br = new BufferedReader(new FileReader(new File("myTest.txt")))) {
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
	} catch (Exception e) {

		e.printStackTrace();
	} 
	Instant end=Instant.now();
	System.out.println("Total time taken "+Duration.between(start, end).toMillis()+" ms");
}
}
