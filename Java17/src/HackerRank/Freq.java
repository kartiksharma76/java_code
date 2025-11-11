package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class F{
	public static int migratoryBirds(List<Integer> arr) {
		int []freq = new int [6];
		for(int bird : arr) {
		freq[bird]++;
		}
		int maxFreq = 0;
		int result =1;
		for(int i =1;i<=5;i++) {
			if(freq[i] > maxFreq) {
				maxFreq = freq[i];
				result = i;
				
			}
		}
		return result;		
		}
	
}
public class Freq {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of Birds");
	int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
System.out.println("Enetr bird type:");
List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
.map(Integer::parseInt)
.collect(Collectors.toList());
int result = F.migratoryBirds(arr);
System.out.println("Most frequency bird type:"+ result);
bufferedReader.close();
}
}
