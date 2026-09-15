package Java8Practice;

import java.util.Arrays;
import java.util.List;

public class DishData {
	public static List<Dish> getMenu() {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("prawns", false, 300, Dish.Type.MEAT), new Dish("salmon", false, 450, Dish.Type.MEAT),
				new Dish("tofu", true, 200, Dish.Type.OTHER), new Dish("spaghetti", true, 600, Dish.Type.OTHER),
				new Dish("steak", false, 900, Dish.Type.MEAT), new Dish("burger", false, 700, Dish.Type.MEAT),
				new Dish("lasagna", true, 750, Dish.Type.OTHER), new Dish("sushi", true, 150, Dish.Type.OTHER),
				new Dish("dumplings", true, 400, Dish.Type.OTHER), new Dish("salad", true, 200, Dish.Type.OTHER),
				new Dish("pasta", true, 450, Dish.Type.OTHER), new Dish("soup", true, 300, Dish.Type.OTHER),
				new Dish("grilled chicken", false, 500, Dish.Type.MEAT),
				new Dish("fish and chips", false, 800, Dish.Type.MEAT),
				new Dish("roast beef", false, 850, Dish.Type.MEAT),
				new Dish("shrimp cocktail", false, 250, Dish.Type.MEAT),
				new Dish("vegetable curry", true, 350, Dish.Type.OTHER),
				new Dish("chicken wings", false, 600, Dish.Type.MEAT), new Dish("ribs", false, 900, Dish.Type.MEAT),
				new Dish("meatballs", false, 500, Dish.Type.MEAT), new Dish("fried rice", true, 600, Dish.Type.OTHER),
				new Dish("grilled salmon", false, 500, Dish.Type.MEAT),
				new Dish("chicken parmesan", false, 700, Dish.Type.MEAT),
				new Dish("cheeseburger", false, 650, Dish.Type.MEAT),
				new Dish("vegetarian pizza", true, 550, Dish.Type.OTHER),
				new Dish("vegetable stir-fry", true, 400, Dish.Type.OTHER),
				new Dish("beef stew", false, 800, Dish.Type.MEAT), new Dish("egg salad", true, 350, Dish.Type.OTHER),
				new Dish("fish tacos", false, 400, Dish.Type.MEAT),
				new Dish("cabbage rolls", true, 450, Dish.Type.OTHER),
				new Dish("vegetable soup", true, 200, Dish.Type.OTHER),
				new Dish("chicken burrito", false, 650, Dish.Type.MEAT),
				new Dish("vegetable lasagna", true, 700, Dish.Type.OTHER),
				new Dish("taco salad", true, 500, Dish.Type.OTHER),
				new Dish("chili con carne", false, 800, Dish.Type.MEAT),
				new Dish("moussaka", true, 750, Dish.Type.OTHER), new Dish("bruschetta", true, 250, Dish.Type.OTHER),
				new Dish("grilled shrimp", false, 300, Dish.Type.MEAT),
				new Dish("cheese pizza", true, 600, Dish.Type.OTHER), new Dish("sashimi", false, 150, Dish.Type.MEAT),
				new Dish("fried chicken", false, 750, Dish.Type.MEAT),
				new Dish("vegetable tempura", true, 350, Dish.Type.OTHER),
				new Dish("garlic bread", true, 250, Dish.Type.OTHER), new Dish("paella", false, 900, Dish.Type.MEAT),
				new Dish("hummus", true, 200, Dish.Type.OTHER),
				new Dish("grilled vegetables", true, 300, Dish.Type.OTHER));

		return menu;
	}
}
