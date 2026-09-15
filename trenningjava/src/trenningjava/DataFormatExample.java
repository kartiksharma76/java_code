package trenningjava;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DataFormatExample {
	public static void main(String[] args) {
		Date currentDate = new Date();
// US Locale format
		DateFormat usFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		System.out.println("Us Format:" + usFormat.format(currentDate));

// French Local Date
		DateFormat frFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		System.out.println("French Format: " + frFormat.format(currentDate));

	}
}
