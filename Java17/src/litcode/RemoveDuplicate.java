package litcode;

public class RemoveDuplicate {
	public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int index = 2;  // Start from 3rd position
        for (int i = 2; i < nums.length; i++) {
            // Compare with nums[index - 2]
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    
}
	public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        RemoveDuplicate  sol = new RemoveDuplicate ();
        int k = sol.removeDuplicates(nums);
        System.out.println("k = " + k);
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i != k - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}