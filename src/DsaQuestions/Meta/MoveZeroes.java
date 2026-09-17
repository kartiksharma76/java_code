package DsaQuestions.Meta;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int index = 0;

        for(int num :  nums){
            if(num != 0){
                nums[index] = num;
                index++;
            }
        }
        while (index < nums.length){
            nums[index] = 0;
            index++;

        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
