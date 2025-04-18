package ArrayQuestion;

public class PalindromeArray1 {
public static boolean isPalindrome(int []arr) {
	int start=0;
	int end=arr.length-1;
	while(start<end) {
		if(arr[start]!=arr[end]) { 
			return false;
		}
		start++;
		end--;
	}
	return false;
	
}
public static void main(String[] args) {
	int[]arr= {1,2,3,4,5};
	if(isPalindrome(arr)) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
