package litcode;

import java.util.Arrays;

public class ClosetThreeSum {
public int threeSumCloset(int[]nums,int target) {
	Arrays.sort(nums);
	int closetSum=nums[0]+nums[1]+nums[2];
	for(int i=0;i<nums.length-2;i++) {
		int left=i+1;
		int right=nums.length-1;
		while(left<right) {
			int sum=nums[i]+nums[left]+nums[right];
			if(Math.abs(target-sum)<Math.abs(target-closetSum)) {
				closetSum=sum;
			}
			if(sum<target) {
				left++;
			
			}else {
				right--;
			}
		}
	}
	return closetSum;
	
}
}
