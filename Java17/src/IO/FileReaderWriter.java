package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriter {
	public static void main(String[] args) {
		try {
			FileReader input = new FileReader("myTest.txt");
			BufferedReader br = new BufferedReader(input);
			try {
				int line = 0;
				System.out.println(line);
				while ((line = br.read()) != -1) {
					System.out.println(br.readLine());
				}

			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}
