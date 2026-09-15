package DsaImp;
/**
 * a sorted array is rotate to find minimum element
 * input [4,5,6,7,0,1,2] -> output 0
 * real life CD/DVD rank CDs sorted - A,B,C,D,E,F,G'
 * But the rank is rotate ->[E,F,G,A,B,C,D]
 * when the first CD(smallest) ->A
 * 
 * if mid > right -> minimum right half
 * if mid < right -> minimum left half 
 * 
 **/
public class MinimumInRotatedSortedArray {
public static int findMin(int[]nums) {
	int left =0;
	int right = nums.length -1;
	
	while(left <right) {
		int mid = left + (right -left)/2;

		if(nums[mid] > nums[right]) {
			left = mid+1;
		}else {
			right = mid;
				
		}
	}
return nums[left];
}

public static void main(String[] args) {
	 int[] arr = {4, 5, 6, 7, 0, 1, 2};
	 System.out.println("Minimum: " + findMin(arr));
}
}
