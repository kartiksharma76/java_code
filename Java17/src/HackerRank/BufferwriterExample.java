package HackerRank;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class BufferwriterExample {
    public static void main(String[] args) {
        Instant start = Instant.now();

        File file = new File("minusplus.txt"); // file created in project folder

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(" Enter text to save into file (type 'exit' to finish):");

            String line;
            while (true) {
                line = br.readLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                bw.write(line);
                bw.newLine(); // move to next line
            }

            System.out.println(" Data written successfully to " + file.getName());
            System.out.println(" File saved at: " + file.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();
        System.out.println(" Total time taken: " + Duration.between(start, end).toMillis() + " ms");
    }
}
