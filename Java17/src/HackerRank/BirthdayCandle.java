package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class RS {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int height : candles) {
            if (height > max) {
                max = height;
                count = 1;
            } else if (height == max) {
                count++;
            }
        }
        return count;
    }
}

public class BirthdayCandle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //  Ask user for input
        System.out.print("Enter number of candles: ");
        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.print("Enter candle heights (space-separated): ");
        List<Integer> candles = Arrays.stream(bufferedReader.readLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = RS.birthdayCakeCandles(candles);

        //  Print output directly to console
        System.out.println("Tallest candle count: " + result);

        bufferedReader.close();
    }
}
