package trenningjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
/**
 * ==============================
 *      JAVA STREAM API
 * ==============================
 *
 * BASIC STREAM API
 * ------------------------------
 * stream()
 * filter()
 * map()
 * collect()
 * forEach()
 * count()
 * max()
 * min()
 * sorted()
 * distinct()
 * limit()
 * skip()
 * findFirst()
 * findAny()
 * anyMatch()
 * allMatch()
 * noneMatch()
 * reduce()
 *
 *
 * NUMERIC OPERATIONS
 * ------------------------------
 * mapToDouble()
 * sum()
 * average()
 * summarizingDouble()
 *
 *
 * COLLECTORS
 * ------------------------------
 * toList()
 * toMap()
 * groupingBy()
 * partitioningBy()
 * joining()
 * counting()
 * mapping()
 * maxBy()
 * minBy()
 *
 *
 * ADVANCED STREAM API
 * ------------------------------
 * Comparator.comparing()
 * peek()
 * parallelStream()
 * flatMap()
 *
 *
 * OPTIONAL API
 * ------------------------------
 * isPresent()
 * get()
 * orElse()
 * ifPresent()
 *
 *
 * INTERVIEW QUESTIONS PRACTICED
 * ------------------------------
 * Highest Product
 * Lowest Product
 * Second Highest Product
 * Top 3 Costliest Products
 * Distinct Prices
 * Product Search By Name
 * Count Products
 * Average Price
 * Total Price
 * Grouping Products
 * Partitioning Products
 * List to Map Conversion
 *
 *
 * STATUS
 * ------------------------------
 * Stream API Learning : COMPLETED 
 *
 */
public class ProductStreamQuestions {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product(1, "HP Laptop", 25000f),
				new Product(2, "Dell Laptop", 30000f), new Product(3, "Lenovo Laptop", 28000f),
				new Product(4, "Sony Laptop", 45000f), new Product(5, "Apple Laptop", 90000f),
				new Product(6, "Asus Laptop", 55000f), new Product(7, "Acer Laptop", 35000f),
				new Product(8, "MSI Laptop", 65000f));

		System.out.println("\n===== Q1 Price > 30000 =====");
		products.stream().filter(p -> p.price > 30000).forEach(System.out::println);

		System.out.println("\n===== Q2 Only Product Names =====");
		products.stream().map(p -> p.name).forEach(System.out::println);

		System.out.println("\n===== Q3 Only Prices =====");
		products.stream().map(p -> p.price).forEach(System.out::println);

		System.out.println("\n===== Q4 Count Products =====");
		System.out.println(products.stream().count());

		System.out.println("\n===== Q5 Maximum Price Product =====");
		System.out.println(products.stream().max((p1, p2) -> Float.compare(p1.price, p2.price)).get());

		System.out.println("\n===== Q6 Minimum Price Product =====");
		System.out.println(products.stream().min((p1, p2) -> Float.compare(p1.price, p2.price)).get());

		System.out.println("\n===== Q7 Sort By Price =====");
		products.stream().sorted((p1, p2) -> Float.compare(p1.price, p2.price)).forEach(System.out::println);

		System.out.println("\n===== Q8 Sort By Name =====");
		products.stream().sorted((p1, p2) -> p1.name.compareTo(p2.name)).forEach(System.out::println);

		System.out.println("\n===== Q9 Average Price =====");
		System.out.println(products.stream().collect(Collectors.averagingDouble(p -> p.price)));

		System.out.println("\n===== Q10 Product Name Starts With A =====");
		products.stream().filter(p -> p.name.startsWith("A")).forEach(System.out::println);

		System.out.println("\n===== Q11 Total Price Of All Products =====");
		System.out.println(products.stream().mapToDouble(p -> p.price).sum());

		System.out.println("\n===== Q12 Product Names In Uppercase =====");
		products.stream().map(p -> p.name.toUpperCase()).forEach(System.out::println);

		System.out.println("\n===== Q13 First Product With Price > 50000 =====");
		System.out.println(products.stream().filter(p -> p.price > 50000).findFirst().orElse(null));

		System.out.println("\n===== Q14 Any Product Price > 100000 =====");
		System.out.println(products.stream().anyMatch(p -> p.price > 100000));

		System.out.println("\n===== Q15 All Products Price > 20000 =====");
		System.out.println(products.stream().allMatch(p -> p.price > 20000));

		System.out.println("\n===== Q16 Product Name Length > 10 =====");
		products.stream().filter(p -> p.name.length() > 10).forEach(System.out::println);

		System.out.println("\n===== Q17 Top 3 Costliest Products =====");
		products.stream().sorted((p1, p2) -> Float.compare(p2.price, p1.price)).limit(3).forEach(System.out::println);

		System.out.println("\n===== Q18 Skip First 3 Products =====");
		products.stream().skip(3).forEach(System.out::println);

		System.out.println("\n===== Q19 Second Highest Price Product =====");
		System.out.println(
				products.stream().sorted((p1, p2) -> Float.compare(p2.price, p1.price)).skip(1).findFirst().get());

		System.out.println("\n===== Q20 Remove Duplicate Prices =====");
		products.stream().map(p -> p.price).distinct().forEach(System.out::println);

		System.out.println("\n===== Q21 Convert List<Product> To Map =====");
		System.out.println(products.stream().collect(Collectors.toMap(p -> p.id, p -> p.name)));

		System.out.println("\n===== Q22 Get Product With Exact Name =====");
		products.stream().filter(p -> p.name.equalsIgnoreCase("Apple Laptop")).forEach(System.out::println);

		System.out.println("\n===== Q23 Count Products Above 50000 =====");
		System.out.println(products.stream().filter(p -> p.price > 50000).count());

		System.out.println("\n===== Q24 Average Price Above 30000 =====");
		System.out
				.println(products.stream().filter(p -> p.price > 30000).mapToDouble(p -> p.price).average().orElse(0));

		System.out.println("\n===== Q25 Second Highest Distinct Price =====");
		products.stream().map(p -> p.price).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.ifPresent(System.out::println);

		System.out.println("\n===== Q26 Find Any Product =====");
		products.stream().findAny().ifPresent(System.out::println);

		System.out.println("\n===== Q27 None Match Price > 200000 =====");
		System.out.println(products.stream().noneMatch(p -> p.price > 200000));

		System.out.println("\n===== Q28 Total Price Using Reduce =====");
		System.out.println(products.stream().map(p -> p.price).reduce(0f, Float::sum));

		System.out.println("\n===== Q29 Group Products By Price =====");
		System.out.println(products.stream().collect(Collectors.groupingBy(p -> p.price)));

		System.out.println("\n===== Q30 Partition Products Price > 50000 =====");
		System.out.println(products.stream().collect(Collectors.partitioningBy(p -> p.price > 50000)));

		System.out.println("\n===== Q31 Join All Product Names =====");
		System.out.println(products.stream().map(p -> p.name).collect(Collectors.joining(", ")));

		System.out.println("\n===== Q32 Sort Using Comparator.comparing() =====");
		products.stream().sorted(Comparator.comparing(p -> p.name)).forEach(System.out::println);

		System.out.println("\n===== Q33 First 5 Products =====");
		products.stream().limit(5).forEach(System.out::println);

		System.out.println("\n===== Q34 Peek Example =====");
		products.stream().peek(p -> System.out.println("Before Filter : " + p)).filter(p -> p.price > 30000)
				.forEach(System.out::println);

		System.out.println("\n===== Q35 Summary Statistics =====");
		DoubleSummaryStatistics stats = products.stream().collect(Collectors.summarizingDouble(p -> p.price));

		System.out.println("Count   : " + stats.getCount());
		System.out.println("Sum     : " + stats.getSum());
		System.out.println("Average : " + stats.getAverage());
		System.out.println("Max     : " + stats.getMax());
		System.out.println("Min     : " + stats.getMin());

		// Q36 Collectors.counting()
		System.out.println("\n===== Q36 Collectors.counting() =====");

		Long totalProducts = products.stream().collect(Collectors.counting());

		System.out.println(totalProducts);

		// Q37 Collectors.mapping()
		System.out.println("\n===== Q37 Collectors.mapping() =====");

		List<String> names = products.stream().collect(Collectors.mapping(p -> p.name, Collectors.toList()));

		System.out.println(names);

		// Q38 Collectors.maxBy()
		System.out.println("\n===== Q38 Collectors.maxBy() =====");

		Optional<Product> maxProduct = products.stream().collect(Collectors.maxBy(Comparator.comparing(p -> p.price)));

		System.out.println(maxProduct.get());

		// Q39 Collectors.minBy()
		System.out.println("\n===== Q39 Collectors.minBy() =====");

		Optional<Product> minProduct = products.stream().collect(Collectors.minBy(Comparator.comparing(p -> p.price)));

		System.out.println(minProduct.get());

		// Q40 Parallel Stream
		System.out.println("\n===== Q40 Parallel Stream =====");

		products.parallelStream().forEach(System.out::println);

		// Q41 flatMap()
		System.out.println("\n===== Q41 flatMap() =====");

		List<List<String>> list = Arrays.asList(Arrays.asList("Java", "Spring"), Arrays.asList("SQL", "HTML"),
				Arrays.asList("CSS", "JavaScript"));

		List<String> result = list.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println(result);

		// Q42 Optional API
		System.out.println("\n===== Q42 Optional API =====");

		Optional<Product> product = products.stream().filter(p -> p.price > 50000).findFirst();

		System.out.println("isPresent : " + product.isPresent());

		if (product.isPresent()) {
			System.out.println("get() : " + product.get());
		}

		System.out.println("orElse() : " + product.orElse(new Product(0, "Default", 0)));

	}
}
