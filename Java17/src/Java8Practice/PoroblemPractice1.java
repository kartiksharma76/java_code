package Java8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PoroblemPractice1 {
	public static void main(String[] args) {
		List<Dish> menu = DishData.getMenu();

//. Filter out vegetarian dishes with a calorie count greater than 500.
		System.out.println("\n Filter out vegetarian dishes with a calorie count greater than 500:");
		List<Dish> highCalorivagitarian = menu.stream().filter(dish -> dish.isVegetarian() && dish.getCalories() > 500)
				.collect(Collectors.toList());
		highCalorivagitarian.forEach(System.out::println);

// Create a list of all dish names.
		System.out.println("\n. Create a list of all dish names.");
		List<String> dishname = menu.stream().map(Dish::getName).collect(Collectors.toList());
		System.out.println("Lish of all dish:");
		dishname.forEach(System.out::println);

// flatten the all dish name of vegetarians of single dish
		System.out.println("\nflatten the all dish name of vegetarians of single dish:");
		List<String> vagetariansDishname = menu.stream().filter(Dish::isVegetarian).map(Dish::getName)
				.collect(Collectors.toList());
		vagetariansDishname.forEach(System.out::println);

		System.out.println("\nremove duplicate:");
		List<Dish> uniqueDishes = menu.stream()
				.collect(Collectors.toMap(Dish::getCalories, dish -> dish, (exiting, replacement) -> exiting)).values()
				.stream().toList();
		uniqueDishes.forEach(System.out::println);

// Sort the dishes by their calorie count in ascending order.
		System.out.println("\nSort the dishes by their calorie count in ascending order:");
		menu.stream().sorted(Comparator.comparing(Dish::getCalories))
				.forEach(dish -> System.out.println(dish.getName() + " " + dish.getCalories()));

//Sort the dishes by their calorie count in descending order order.\
		System.out.println("\nSort the dishes by their calorie count in decending order:");
		menu.stream().sorted(Comparator.comparing(Dish::getCalories).reversed())
				.forEach(dish -> System.out.println(dish.getName() + " " + dish.getCalories()));

//. Get the first 5 dishes from the menu.
		System.out.println("\n. Get the first 5 dishes from the menu:");
		menu.stream().limit(5).forEach(dish -> System.out.println(dish.getName() + " " + dish.getCalories()));

// Skip the first 3 dishes and get the rest of the dishes.
		System.out.println("\n Skip the first 3 dishes and get the rest of the dishes:");
		menu.stream().skip(3).forEach(dish -> System.out.println(dish.getName() + " " + dish.getCalories()));

//. Map all dishes to their calorie count and return an IntStream.
		System.out.println("\nMap all dishes to their calorie count and return an IntStream:");
		IntStream mapToIntStream = menu.stream().mapToInt(Dish::getCalories);
		mapToIntStream.forEach(System.out::println);

//Find the total calories of all dishes.
		System.out.println("\nFind the total calories of all dishes:");
		int totalCalories = menu.stream().mapToInt(Dish::getCalories).sum();
		System.out.println("Total Calories: " + totalCalories);

//. Collect all vegetarian dishes into a List.
		System.out.println("\nCollect all vegetarian dishes into a List:");
		List<Dish> collect = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
		collect.forEach(dish -> System.out.println(dish.getName() + " " + dish.getCalories()));

// Check if there are any vegetarian dishes in the menu
		System.out.println("\nCheck if there are any vegetarian dishes in the menu:");
		boolean anyVegetarian = menu.stream().anyMatch(Dish::isVegetarian);
		System.out.println(anyVegetarian);

// Check if all dishes have fewer than 1000 calories
		System.out.println("\nCheck if all dishes have fewer than 1000 calories:");
		boolean allUnder1000Calories = menu.stream().allMatch(dish -> dish.getCalories() < 1000);
		System.out.println(allUnder1000Calories);

// Check if no dish has more than 1000 calories
		System.out.println("\nCheck if no dish has more than 1000 calories:");
		boolean noneOver1000Calories = menu.stream().noneMatch(dish -> dish.getCalories() > 1000);
		System.out.println(noneOver1000Calories);

// Find the first dish with more than 600 calories
		System.out.println("\nFind the first dish with more than 600 calories:");
		Optional<Dish> firstHighCalorieDish = menu.stream().filter(dish -> dish.getCalories() > 600).findFirst();
		System.out.println(firstHighCalorieDish.orElse(null));

// Find any dish that is vegetarian
		System.out.println("\nFind any dish that is vegetarian:");
		Optional<Dish> anyVegetarianDish = menu.stream().filter(Dish::isVegetarian).findAny();
		System.out.println(anyVegetarianDish.orElse(null));

// Count the number of dishes with more than 500 calories
		System.out.println("\n Count the number of dishes with more than 500 calories:");
		long countHighCalorieDishes = menu.stream().filter(dish -> dish.getCalories() > 500).count();
		System.out.println(countHighCalorieDishes);

// Find the dish with the highest calorie count
		System.out.println("\nFind the dish with the highest calorie count:");
		Optional<Dish> highestCalorieDish = menu.stream().max(Comparator.comparingInt(Dish::getCalories));
		System.out.println(highestCalorieDish.orElse(null));

// Find the dish with the lowest calorie count
		System.out.println("\nFind the dish with the lowest calorie count:");
		Optional<Dish> lowestCalorieDish = menu.stream().min(Comparator.comparingInt(Dish::getCalories));
		System.out.println(lowestCalorieDish.orElse(null));

// Convert the stream of dishes into an array
		System.out.println("\nConvert the stream of dishes into an array:");
		Dish[] dishesArray = menu.stream().toArray(Dish[]::new);
		System.out.println(Arrays.toString(dishesArray));
	}
}
