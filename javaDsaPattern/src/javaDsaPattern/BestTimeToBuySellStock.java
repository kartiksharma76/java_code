package javaDsaPattern;

/**
 * E-commerce website par products ki prices array me stored hain. Sabse zyada
 * profit kamane ke liye ek baar buy aur ek baar sell kar sakte ho. Maximum
 * profit kaise nikaloge?
 * 
 * case 1 = we apply the brute force Approach
 * the first idea comes in the mind is to try every possible buy and sell combination
 * for(int i =0; i<n; i++){
 * for(int j =i+1; j<n; j++){
 * profit =m prices[j]-prices[i];
 * }
 * }
 * 
 *  This approach works but it takes O(n2) time because for the nested loops
 *  
 *  optimize approach 
 *  nested of checking every pair we can keep trave two things 
 *  the minimum price seen so far 
 *  the maximum profit obtained so far
 *  
 *  variable =
 *  int minPrice = Integer.MAX_VALUE;
 *  int maxProfit = 0;
 *  here min price store lowest stock price encountered 
 *  here max profit stored maximumprofit found so far
 *  Algorithm----
 *  for(int price:prices)
 *  
 *  smaller price
 *  if(price < minPrice){
 *  min price = price;
 *  }
 *  
 *  
 *  case 2
 *  else{
 *  int profit = price-minPrice;
 *  maxProfit = Math.max(maxprofit, profit);
 *  }
 *  
 *  dry Run
 *  Array
 *  [7,1,5,3,6,4]
 *  day1
 *  minPrice = 7
 *  maxProfit = 0;
 *  
 *  same as all variable  
 *   then all code 
 *
 * 
*/
public class BestTimeToBuySellStock {
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price;
			} else {
				int profit = price - minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Maximum profit =" + maxProfit(prices));
	}
}
