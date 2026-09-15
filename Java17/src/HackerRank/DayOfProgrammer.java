package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter year: 2017 Day of the Programmer: 13.09.20
 */

class D {
	public static String dayOfProgrammer(int year) {
		String date = "";

		if (year == 1918) {
			date = "26.09.1918";
		} else if ((year < 1918 && year % 4 == 0)
				|| (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
			// Leap years
			date = "12.09." + year;
		} else {

			date = "13.09." + year;
		}
		return date;
	}
}

public class DayOfProgrammer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter year: ");
		int year = Integer.parseInt(bufferedReader.readLine().trim());
		String result = D.dayOfProgrammer(year);
		System.out.println("Day of the Programmer: " + result);
		bufferedReader.close();
	}
}
