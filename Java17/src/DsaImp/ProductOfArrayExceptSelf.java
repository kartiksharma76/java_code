package DsaImp;

import java.util.Arrays;

/**
* There are 4 machines in a factory, the output of each machine is one number
* The manager wants to shut down each machine and see what will be the combined output of the remaining machines
* Machine 1 band = 2 *3 * 4= 24
* Machine 2 band = 1*3 *4 =12
* and so on
*
* Problem = (Left side product) * (Right side of product)
* We can do it in 2 passes, first left product then right products
*
*/
public class ProductOfArrayExceptSelf {
public static int []productExcepctSelf(int[]nums){
	int n= nums.length;
	int[]result= new int[n];
	// fill left product
	result[0] =1;
	for(int i=1; i<n;i++) {
		result[i]= result[i-1]* nums[i-1];
	}
	// multiply with right products
	int rightProduct = 1;
	for(int i=n-1;i>0;i--) {
		result[i] =result[i] *rightProduct;
		rightProduct *=nums[i];
	}
	return result;
}
public static void main(String[] args) {
	int[]arr = {1,2,3,4};
	int[]ans = productExcepctSelf(arr);
	System.out.println(Arrays.toString(ans));
}
}
