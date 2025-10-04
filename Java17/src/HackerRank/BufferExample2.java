package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
class Result3 {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
        }
        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;
        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            int idx = (x ^ lastAnswer) % n;
            if (type == 1) {
                arr.get(idx).add(y);
            } else if (type == 2) {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                result.add(lastAnswer);
            }
        }
        return result;
    }
}

public class BufferExample2 {
	  public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	        int n = Integer.parseInt(firstMultipleInput[0]);
	        int q = Integer.parseInt(firstMultipleInput[1]);
	        List<List<Integer>> queries = new ArrayList<>();
	        for (int i = 0; i < q; i++) {
	            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	            List<Integer> queriesRowItems = new ArrayList<>();
	            for (int j = 0; j < 3; j++) {
	                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
	                queriesRowItems.add(queriesItem);
	            }
	            queries.add(queriesRowItems);
	        }
	        List<Integer> result3 = Result3.dynamicArray(n, queries);
	        for (int i = 0; i < result3.size(); i++) {
	            bufferedWriter.write(String.valueOf(result3.get(i)));
	            if (i != result3.size() - 1) {
	                bufferedWriter.write("\n");
	            }
	        }
	        bufferedWriter.newLine();
	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}


