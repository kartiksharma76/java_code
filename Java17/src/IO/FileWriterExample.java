package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class FileWriterExample {
	public static void main(String[] args) {
		//File file=new File("test.txt");
		//FileWriter fw=new FileWriter(file);
		
		Instant start=Instant.now();
		try(FileWriter fw=new FileWriter(new File("test.txt"))){
			fw.write(DataBase.getNames());
		} catch (IOException e) {
			e.printStackTrace();
		}
		Instant end=Instant.now();
		System.out.println("Total time taken "+Duration.between(start, end).toMillis()+" ms");
	}}