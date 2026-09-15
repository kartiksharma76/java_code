package HackerRank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class FinalOutput {
	public static void PlusminusWrite(List<Integer> arr, PrintWriter writer) {
		int n = arr.size();
		int pos = 0;
		int neg = 0;
		int zero = 0;

		for (int num : arr) {
			if (num > 0)
				pos++;
			else if (num < 0)
				neg++;
			else
				zero++;
		}

		writer.printf("%.6f%n", (double) pos / n);
		writer.printf("%.6f%n", (double) neg / n);
		writer.printf("%.6f%n", (double) zero / n);
	}
}

public class MinusPlusWriter {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(" Enter the number of elements: ");
		int n = Integer.parseInt(bufferedReader.readLine().trim());

		System.out.print(" Enter " + n + " integers separated by spaces: ");
		List<Integer> arr = Stream.of(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt)
				.collect(toList());

		File file = new File("minusplus.txt");
		PrintWriter writer = new PrintWriter(new FileWriter(file));

		FinalOutput.PlusminusWrite(arr, writer);

		writer.close();
		bufferedReader.close();

		System.out.println(" Results written to file: " + file.getAbsolutePath());
	}
}
