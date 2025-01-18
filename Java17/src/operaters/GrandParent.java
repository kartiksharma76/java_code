package operaters;

public class GrandParent {
	private int money = 10000;

	public int getgrandaparentproperty() {
		return money;

	}
}

class Parent extends GrandParent {
	private int money = 5000;

	public int getParentMoney() {
		// return money+super.getMoney();
		return money;
	}
}

class Son extends Parent {
	public int getTotalMoney() {
		return getgrandaparentproperty() + getParentMoney();

	}
}