package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;

public class FileReaderV2 {
public static void main(String[] args) {
	File file= new File("myTest.txt");
	Instant start=Instant.now();
	try (FileReader fr=new FileReader(file);){
		int ch=0;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
	Instant end=Instant.now();
	System.out.println("Total time taken "+Duration.between(start, end).toMillis()+" ms");
}
}
