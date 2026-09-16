package DsaQuestions.microsoft;

public class FindPeakElement {
    public static  int findPeak(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int mid = left + (right - left)/ 2;
            if (nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int index = findPeak(nums);

        System.out.println("Peak Index = " + index);
        System.out.println("Peak Element = " + nums[index]);
    }
}
