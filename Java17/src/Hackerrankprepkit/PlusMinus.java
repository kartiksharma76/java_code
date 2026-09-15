package Hackerrankprepkit;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. 
 * Print the decimal value of each fraction on a new line with  places after the decimal.

  Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
  though answers with absolute error of up to  are acceptable.
  example:
  arr[1,1,0,-1,-1]
  There are n = 5 elements ,two two positive, two negative and one zero. Their ratios are
  2/5 = 0.400000 , 2/5 = 0.400000 and 1/5 = 0.200000. Result are printed as:
  0.400000
  0.400000
  0.200000
  
  Function Description
  Complete the plusMinus function in the editor below.
  plusMinus has the following parameter(s):
  int arr[n]: an array of integers
  
  Print
  Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with 6 digits after the decimal.
  The function should not return a value.
  
  Input Format

The first line contains an integer,n , the size of the array.
The second line contains n space-separated integers that describe arr[n] .

 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void plusMinus(List<Integer> arr) {
		int pos = 0, neg = 0, zero = 0;
		int n = arr.size();

		for (int num : arr) {
			if (num > 0) {
				pos++;

			} else if (num < 0) {
				neg++;
			} else {
				zero++;
			}
		}
		System.out.printf("%.6f\n", (double) pos / n);
		System.out.printf("%.6f\n", (double) neg / n);
		System.out.printf("%.6f\n", (double) zero / n);
	}

}

public class PlusMinus {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}
