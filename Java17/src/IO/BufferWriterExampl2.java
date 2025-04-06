package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class BufferWriterExampl2 {
public static void main(String[] args) {
	Instant start=Instant.now();
	try(BufferedWriter br=new BufferedWriter(new FileWriter(new File("StudentData.txt")))) {
		br.write(DataBaseStudentsDetails.getDetails());	
	} catch (IOException e) {
		e.printStackTrace();
	}
	Instant end=Instant.now();
	System.out.println("Total time taken "+Duration.between(start, end).toMillis()+" ms");
}
}
