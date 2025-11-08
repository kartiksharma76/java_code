package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Total {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcm = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcm = lcm(lcm, a.get(i));
        }

        int gcd = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcd = gcd(gcd, b.get(i));
        }

        int count = 0;
        for (int i = lcm; i <= gcd; i += lcm) {
            if (gcd % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().trim().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        List<Integer> a = Arrays.stream(br.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> b = Arrays.stream(br.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int total = Total.getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();
        bw.flush();
    }
}
