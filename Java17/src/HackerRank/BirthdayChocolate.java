package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class R {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {  // ✅ start from i, not 1
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}

public class BirthdayChocolate {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine().trim());
        List<Integer> s = Arrays.stream(br.readLine().trim().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        
        String[] dm = br.readLine().trim().split(" ");
        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);

        int result = R.birthday(s, d, m);

        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
    }
}
