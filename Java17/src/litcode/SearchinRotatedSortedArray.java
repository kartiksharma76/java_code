package litcode;

public class SearchinRotatedSortedArray {

	public int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (nums[mid] == target)
				return mid;

			// left half is sorted
			if (nums[left] <= nums[mid]) {

				if (target >= nums[left] && target < nums[mid])
					right = mid - 1;
				else
					left = mid + 1;
			}

			// right half is sorted
			else {

				if (target > nums[mid] && target <= nums[right])
					left = mid + 1;
				else
					right = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		SearchinRotatedSortedArray obj = new SearchinRotatedSortedArray();

		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int result = obj.search(nums, target);

		System.out.println("Target index: " + result);
	}
}