package DsaImp;

import java.util.HashSet;
import java.util.Set;

/**
 * we have a array n+1 element here every element 1 to n
 * here is only duplicate number to find
 * Example : [1,3,4,2,2] -> Duplicate = 2
 * 
 * Real Life Example 
 * In a school 5 children were given roll numbers 1 to 4, but someone 
 * mistakenly allotted one roll number twice.
 * [1, 3, 4, 2, 2] -> Roll number 2 was allotted to two children -> Duplicate!
 * Approach 1: HashSet (Simple)
 * but each number in set
 * If already exists -> duplicate found
 * 
 */
public class FindDuplicate {
public static int findDuplicate(int [] nums) {
	Set<Integer> set = new HashSet<>();
	for(int num :  nums) {
		if(set.contains(num)) {
			return num;
		}
		set.add(num);
	}
	return-1;
}
public static void main(String[] args) {
	int[]arr= {1,3,4,2,2};
	System.out.println("Duplicate :" + findDuplicate(arr));
}
}
