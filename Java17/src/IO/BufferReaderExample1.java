package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;

public class BufferReaderExample1 {
public static void main(String[] args) {
	 Instant start=Instant.now();
	try {
		BufferedReader br=new BufferedReader(new FileReader(new File("test.txt")));
		String line;
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	 Instant end=Instant.now();
	System.out.println("total time taken"+Duration.between(start, end).toMillis()+"ms");
}
}
