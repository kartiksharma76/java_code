package IO;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class BufferReaderEx {
    public static void main(String[] args) {
//	File file= new File("test.txt");
//	FileReader fr=new FileReader(file);
//	BufferedReader br=new BufferedReader(fr);
        Instant start = Instant.now();
        try (BufferedReader br = new BufferedReader(new FileReader(new File("Test.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
        Instant end = Instant.now();
        System.out.println("Total time taken " + Duration.between(start, end).toMillis() + " ms");
    }
}
