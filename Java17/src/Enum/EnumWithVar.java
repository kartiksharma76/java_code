package Enum;

enum PizzaSize {
	SMALL(100), MEDIUM(200), LARGE(300);

	int price;

	PizzaSize(int price) {
		this.price = price;
	}
}

public class EnumWithVar {
	public static void main(String[] args) {
		System.out.println(PizzaSize.LARGE.price);
	}
}
