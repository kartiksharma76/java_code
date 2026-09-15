package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Time {
	public static String timeConversion(String s) {
		String period = s.substring(s.length() - 2); // AM or PM
		String[] parts = s.substring(0, s.length() - 2).split(":");
		int hour = Integer.parseInt(parts[0]);

		if (period.equals("AM")) {
			if (hour == 12)
				hour = 0;
		} else {
			if (hour != 12)
				hour += 12;
		}

		return String.format("%02d:%s:%s", hour, parts[1], parts[2]);
	}
}

public class TimeConversion {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine();

		String result = Time.timeConversion(s);
		System.out.println(result);

		bufferedReader.close();
	}
}
