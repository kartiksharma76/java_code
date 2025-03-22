package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
public static void main(String[] args) {
	File file=new File("myTest.txt");
	FileReader fr=null;
	try {
		fr=new FileReader(file);
		int ch=0;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	finally {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
