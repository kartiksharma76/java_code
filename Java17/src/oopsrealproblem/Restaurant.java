package oopsrealproblem;

import java.util.List;

public class Restaurant {
private String restaurantId;
private String name;
private List<MenuItem> menu;
public Restaurant(String restaurantId, String name, List<MenuItem> menu) {
	super();
	this.restaurantId = restaurantId;
	this.name = name;
	this.menu = menu;
}


}
