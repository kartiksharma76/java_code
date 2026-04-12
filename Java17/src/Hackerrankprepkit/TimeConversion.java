package Hackerrankprepkit;

import java.io.*;
import java.util.*;

class Result2 {

	/**
	 * Problem: Time Conversion
	 *
	 * Given a time in 12-hour AM/PM format (hh:mm:ssAM or hh:mm:ssPM), convert it
	 * to military (24-hour) time format (HH:mm:ss).
	 *
	 * Rules: 1. For AM: - If hour = 12, convert it to 00 (midnight case) -
	 * Otherwise, keep the hour same
	 *
	 * 2. For PM: - If hour != 12, add 12 to the hour - If hour = 12, keep it same
	 * (noon case)
	 *
	 * Examples: Input: 07:05:45PM → Output: 19:05:45 Input: 12:00:00AM → Output:
	 * 00:00:00 Input: 12:45:54PM → Output: 12:45:54
	 *
	 * Approach: - Extract hour, minutes, seconds, and AM/PM part using substring -
	 * Convert hour based on AM/PM rules - Format hour into 2 digits - Return final
	 * string in HH:mm:ss format
	 */

	public static String timeConversion(String s) {

		// Extract AM/PM
		String period = s.substring(8);

		// Extract hour
		int hour = Integer.parseInt(s.substring(0, 2));

		// Extract minutes and seconds
		String rest = s.substring(2, 8);

		if (period.equals("AM")) {
			if (hour == 12) {
				hour = 0;
			}
		} else { // PM
			if (hour != 12) {
				hour += 12;
			}
		}

		// Convert hour to 2-digit format
		String hh = (hour < 10) ? "0" + hour : String.valueOf(hour);

		return hh + rest;
	}
}

public class TimeConversion {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String s = bufferedReader.readLine();

		String result = Result2.timeConversion(s);

		System.out.println(result);

		bufferedReader.close();
	}
}