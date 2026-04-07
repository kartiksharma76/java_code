package javainterview;

public class Discount {
	public static void main(String[] args) {
		double price = 1000, discount = 20;
		double finalprice = price - (price * discount / 100);
		System.out.println(finalprice);

	}
}
