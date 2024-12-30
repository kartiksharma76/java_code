package RGPV;

/**
 * File Creation:

A File object is created with the name sirt.txt.
The createNewFile() method is used to check if the file already exists. 
If it doesn't, the file is created and a success message is printed.
 If the file already exists, a message indicating that is printed.
Writing to the File:

A FileWriter object is created for sirt.txt.
The write() method writes the string "This is how you write to a file in Java!" to the file.
After writing, the close() method is called to ensure the file is properly closed and the data is saved.
Error Handling:

Both operations are wrapped in try-catch blocks to handle any potential IOException that may occur during file creation or writing.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("sirt.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		try {
			FileWriter myWriter = new FileWriter("sirt.txt");
			myWriter.write("This is how you write to a file in Java!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
