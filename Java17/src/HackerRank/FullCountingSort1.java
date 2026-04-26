package HackerRank;

import java.util.*;

public class FullCountingSort1 {

    public static void countSort(List<List<String>> arr) {
        int n = arr.size();

        // Create 100 buckets (0–99)
        List<List<String>> buckets = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            buckets.add(new ArrayList<>());
        }

        // Fill buckets
        for (int i = 0; i < n; i++) {
            int index = Integer.parseInt(arr.get(i).get(0));
            String value = arr.get(i).get(1);

            // Replace first half with "-"
            if (i < n / 2) {
                value = "-";
            }

            buckets.get(index).add(value);
        }

        // Print sorted output
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            for (String s : buckets.get(i)) {
                result.append(s).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of entries
        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = sc.nextInt();
            String value = sc.next();

            List<String> pair = new ArrayList<>();
            pair.add(String.valueOf(index));
            pair.add(value);

            arr.add(pair);
        }

        countSort(arr);

        sc.close();
    }
}