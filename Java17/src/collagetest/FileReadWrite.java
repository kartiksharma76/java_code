package collagetest;

import java.io.*;

public class FileReadWrite {
	public static void main(String[] args) {
		String filename = "Kartik.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
			writer.write("Iam , Kartik!");
			writer.newLine();
			writer.write("File handling in Java  ");
		} catch (IOException e) {
			System.out.println("Write error: " + e.getMessage());
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			System.out.println("File contents:");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Read error: " + e.getMessage());
		}
	}
}
