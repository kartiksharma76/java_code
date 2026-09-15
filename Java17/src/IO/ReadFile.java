package IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReadFile {
	public static void main(String[] args)  {
		System.out.println("******");
		
		PrintStream ps;
		try {
			ps = new PrintStream("myTest.txt");
			System.setOut(ps);
			System.out.println("end");
			System.out.println("***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
