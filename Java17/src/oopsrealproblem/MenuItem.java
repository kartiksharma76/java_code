package oopsrealproblem;

public class MenuItem {
	private String itemId;
	private String name;
	private double price;

	public MenuItem(String itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;

	}
}
