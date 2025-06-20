package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Primarilitytest {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String n = bufferedReader.readLine();

	        bufferedReader.close();
	        BigInteger number=new BigInteger(n);
	        if(number.isProbablePrime(10)){
	            System.out.println("prime");
	        }else{
	            System.out.println("not prime");
	        }
	    }
}
