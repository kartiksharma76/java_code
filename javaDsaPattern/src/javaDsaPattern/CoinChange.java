package javaDsaPattern;

public class CoinChange {
	public static void main(String[] args) {
		int[] coins = { 25, 10, 5, 1 };
		int amount = 63;
		int count = 0;
		for (int coin : coins) {
			count += amount / coin;
			amount %= coin;
		}
		System.out.println(count);
	}
}
