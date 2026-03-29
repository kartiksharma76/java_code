package InterviewPrepImpQue;

import java.util.ArrayList;
import java.util.HashSet;
/**
------------------------------------------
| Step | Element | Set       | Result    |
| ---- | ------- | --------- | --------- |
| 1    | 1       | [1]       | [1]       |
| 2    | 2       | [1,2]     | [1,2]     |
| 3    | 3       | [1,2,3]   | [1,2,3]   |
| 4    | 1       | already   | skip      |
| 5    | 4       | [1,2,3,4] | [1,2,3,4] |
| 6    | 2       | already   | skip      |
------------------------------------------
[1, 2, 3, 4]
 */
public class RemoveDuplicates2 {
	public static int[] removeDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> result = new ArrayList<>();

		for (int num : arr) {
			if (!set.contains(num)) {
				set.add(num);
				result.add(num);
			}
		}

		// Convert ArrayList to array
		int[] output = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			output[i] = result.get(i);
		}
		return output;

	}

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4};
		int[] res = removeDuplicate(arr);
		for (int num : res) {
			System.out.print(num + " ");
		}
	}
}
