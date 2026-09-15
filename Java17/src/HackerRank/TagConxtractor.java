package HackerRank;
/**
 * 4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagConxtractor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String regex = "<([^<>]+)>([^<>]+)</\\1>";
		Pattern pattern = Pattern.compile(regex);

		while (testCases > 0) {
			String line = in.nextLine();
			Matcher matcher = pattern.matcher(line);
			boolean found = false;

			while (matcher.find()) {
				System.out.println(matcher.group(2));
				found = true;
			}
			if (!found) {
				System.out.println("None");
			}

			// Decrement test case count
			testCases--;
		}

		in.close();
	}
}