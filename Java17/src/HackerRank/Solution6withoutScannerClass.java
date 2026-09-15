package HackerRank;

/**
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
 Pattern- Here, pattern means a regular expression (regex).
A regex (regular expression) is a special string that defines
a search pattern — it's used for matching sequences of characters 
(like finding email addresses, phone numbers, passwords, etc.).
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution6withoutScannerClass {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(reader.readLine());
		while (test-- > 0) {
			String pattern = reader.readLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}
	}
}
