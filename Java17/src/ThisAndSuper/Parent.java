package ThisAndSuper;

public class Parent {
public int age=50;
private int money;
private String name;


public Parent(int money, String name) {
	super();
	this.money = money;
	this.name = name;
}


public void m1() {
	System.out.println("parent");
	
}


@Override
public String toString() {
	return "Parent [money=" + money + ", name=" + name + "]";
}

}
