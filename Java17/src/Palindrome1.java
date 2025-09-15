package litcode;

public class Palindrome1 {
public static boolean isPalindrome(int[]arr) {
	int n =arr.length;
	
	for(int i= 0;i<n/2;i++) {
		if(arr[i]!=arr[n-1-i] ) {
			return false;
		}
	}
	return true;
	
}
public static void main(String[] args) {
	int []arr= {121};
	System.out.println(isPalindrome(arr));
}
}