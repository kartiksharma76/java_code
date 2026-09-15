package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.Instant;

public class BufferReader {
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
		System.out.println("total time taken"+java.time.Duration.between(start, end).toMillis()+"ms");
	}
	}

