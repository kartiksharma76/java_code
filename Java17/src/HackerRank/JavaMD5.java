package HackerRank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
public static void main(String[] args) throws NoSuchAlgorithmException {
	  Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    scanner.close();
	    MessageDigest md= MessageDigest.getInstance("MD5");//MessageDigest.getInstance("SHA-256"); exepcted output is
	    byte[]messageDigest=md.digest(input.getBytes());//872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4
	    StringBuilder hexBuilder=new StringBuilder();
	    for(byte b:messageDigest){
	        hexBuilder.append(String.format("%02x", b));
	    }
	    System.out.println(hexBuilder.toString());
}
}
