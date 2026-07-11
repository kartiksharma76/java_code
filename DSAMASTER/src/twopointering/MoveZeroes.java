package twopointering;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int n : nums) {
            if (n != 0) nums[insertPos++] = n;
        }
        while (insertPos < nums.length) nums[insertPos++] = 0;
    }
}
