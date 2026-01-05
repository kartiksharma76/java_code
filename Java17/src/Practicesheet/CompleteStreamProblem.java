package Practicesheet;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class CompleteStreamProblem {
	public static void main(String[] args) {
		System.out.println("=== JAVA STREAM API COMPREHENSIVE PROBLEMS ===\n");

		// Problem 1: Basic Operations
		System.out.println("1. BASIC OPERATIONS:");
		problem1_basicOperations();

		System.out.println("\n2. FILTERING PROBLEMS:");
		problem2_filtering();

		System.out.println("\n3. MAPPING & TRANSFORMATION:");
		problem3_mapping();

		System.out.println("\n4. SORTING & LIMITING:");
		problem4_sorting();

		System.out.println("\n5. REDUCTION & COLLECTORS:");
		problem5_reduction();

		System.out.println("\n6. NUMERIC STREAMS:");
		problem6_numericStreams();

		System.out.println("\n7. GROUPING & PARTITIONING:");
		problem7_grouping();

		System.out.println("\n8. FLATMAP & NESTED STRUCTURES:");
		problem8_flatmap();

		System.out.println("\n9. CUSTOM OBJECT STREAMS:");
		problem9_customObjects();

		System.out.println("\n10. PARALLEL STREAMS:");
		problem10_parallelStreams();

		System.out.println("\n11. ADDITIONAL PRACTICE PROBLEMS:");
		problem11_additionalProblems();
	}

	// ========== PROBLEM 1: BASIC OPERATIONS ==========
	public static void problem1_basicOperations() {
		List<String> names = Arrays.asList("Kartikey", "Keertan", "Abhisek", "Abhinav", "Ravi", "Ayush");

		// 1a. Count elements
		long count = names.stream().count();
		System.out.println("Total names: " + count);

		// 1b. Find first element
		Optional<String> first = names.stream().findFirst();
		System.out.println("First name: " + first.orElse("None"));

		// 1c. Check if any element matches
		boolean hasA = names.stream().anyMatch(n -> n.startsWith("A"));
		System.out.println("Has name starting with 'A': " + hasA);

		// 1d. Check if all elements match
		boolean allLong = names.stream().allMatch(n -> n.length() > 3);
		System.out.println("All names longer than 3 chars: " + allLong);

		// 1e. Check if none matches
		boolean noneZ = names.stream().noneMatch(n -> n.startsWith("Z"));
		System.out.println("No names starting with 'Z': " + noneZ);

		// 1f. Find any element
		Optional<String> anyName = names.stream().findAny();
		System.out.println("Any name: " + anyName.orElse("None"));

		// 1g. Distinct elements
		List<String> duplicateNames = Arrays.asList("Kartikey", "Keertan", "Kartikey", "Abhinav", "Keertan");
		List<String> distinct = duplicateNames.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct names: " + distinct);
	}

	// ========== PROBLEM 2: FILTERING ==========
	public static void problem2_filtering() {
		List<String> names = Arrays.asList("Kartikey", "Keertan", "Abhisek", "Abhinav", "Ravi", "Ayush");

		// 2a. Filter names starting with 'A'
		List<String> startsWithA = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		System.out.println("Names starting with 'A': " + startsWithA);

		// 2b. Filter names with length > 5
		List<String> longNames = names.stream().filter(n -> n.length() > 5).collect(Collectors.toList());
		System.out.println("Names longer than 5 chars: " + longNames);

		// 2c. Filter names containing 'i'
		List<String> containsI = names.stream().filter(n -> n.toLowerCase().contains("i")).collect(Collectors.toList());
		System.out.println("Names containing 'i': " + containsI);

		// 2d. Filter and limit
		List<String> firstTwoA = names.stream().filter(n -> n.startsWith("A")).limit(2).collect(Collectors.toList());
		System.out.println("First 2 names starting with 'A': " + firstTwoA);

		// 2e. Filter and skip
		List<String> skipFirstTwo = names.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skip first 2 names: " + skipFirstTwo);

		// 2f. Multiple filter conditions
		List<String> complexFilter = names.stream().filter(n -> n.length() >= 5)
				.filter(n -> n.contains("a") || n.contains("A")).collect(Collectors.toList());
		System.out.println("Names with length >=5 and contains 'a': " + complexFilter);
	}

	// ========== PROBLEM 3: MAPPING & TRANSFORMATION ==========
	public static void problem3_mapping() {
		List<String> names = Arrays.asList("Kartikey", "Keertan", "Abhisek", "Abhinav", "Ravi", "Ayush");

		// 3a. Convert to uppercase
		List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Uppercase names: " + upperCase);

		// 3b. Get name lengths
		List<Integer> nameLengths = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Name lengths: " + nameLengths);

		// 3c. Map to custom format
		List<String> formattedNames = names.stream().map(n -> "Name: " + n + " (Length: " + n.length() + ")")
				.collect(Collectors.toList());
		System.out.println("Formatted names: " + formattedNames);

		// 3d. Extract first character
		List<Character> firstChars = names.stream().map(n -> n.charAt(0)).collect(Collectors.toList());
		System.out.println("First characters: " + firstChars);

		// 3e. Transform with index
		List<String> indexedNames = IntStream.range(0, names.size()).mapToObj(i -> (i + 1) + ". " + names.get(i))
				.collect(Collectors.toList());
		System.out.println("Indexed names: " + indexedNames);

		// 3f. Reverse each name
		List<String> reversedNames = names.stream().map(n -> new StringBuilder(n).reverse().toString())
				.collect(Collectors.toList());
		System.out.println("Reversed names: " + reversedNames);
	}

	// ========== PROBLEM 4: SORTING & LIMITING ==========
	public static void problem4_sorting() {
		List<String> names = Arrays.asList("Kartikey", "Keertan", "Abhisek", "Abhinav", "Ravi", "Ayush");

		// 4a. Natural alphabetical sort
		List<String> alphabetical = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Alphabetical order: " + alphabetical);

		// 4b. Reverse alphabetical sort
		List<String> reverseAlphabetical = names.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Reverse alphabetical: " + reverseAlphabetical);

		// 4c. Sort by name length
		List<String> byLength = names.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println("Sorted by length: " + byLength);

		// 4d. Sort by length then alphabetically
		List<String> byLengthThenAlpha = names.stream()
				.sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
				.collect(Collectors.toList());
		System.out.println("Sorted by length then alphabetically: " + byLengthThenAlpha);

		// 4e. Get top 3 longest names
		List<String> top3Longest = names.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(3)
				.collect(Collectors.toList());
		System.out.println("Top 3 longest names: " + top3Longest);

		// 4f. Skip shortest 2 names
		List<String> skipShortest = names.stream().sorted(Comparator.comparingInt(String::length)).skip(2)
				.collect(Collectors.toList());
		System.out.println("Skip 2 shortest names: " + skipShortest);
	}

	// ========== PROBLEM 5: REDUCTION & COLLECTORS ==========
	public static void problem5_reduction() {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		List<String> names = Arrays.asList("Kartikey", "Keertan", "Abhisek", "Abhinav", "Ravi", "Ayush");

		// 5a. Sum of numbers
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of numbers: " + sum);

		// 5b. Product of numbers
		int product = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Product of numbers: " + product);

		// 5c. Find maximum
		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		System.out.println("Maximum number: " + max.orElse(0));

		// 5d. Find minimum
		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		System.out.println("Minimum number: " + min.orElse(0));

		// 5e. Concatenate all names
		String concatenated = names.stream().reduce("", (a, b) -> a + ", " + b);
		System.out.println("Concatenated names: " + concatenated.substring(2));

		// 5f. Collect to different collections
		Set<String> nameSet = names.stream().collect(Collectors.toSet());
		System.out.println("As Set: " + nameSet);

		TreeSet<String> sortedSet = names.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println("As TreeSet (sorted): " + sortedSet);

		// 5g. Join with delimiter
		String joined = names.stream().collect(Collectors.joining(" | "));
		System.out.println("Joined with ' | ': " + joined);

		// 5h. Summary statistics
		IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println("Statistics:");
		System.out.println("  Count: " + stats.getCount());
		System.out.println("  Sum: " + stats.getSum());
		System.out.println("  Min: " + stats.getMin());
		System.out.println("  Max: " + stats.getMax());
		System.out.println("  Average: " + stats.getAverage());
	}

	// ========== PROBLEM 6: NUMERIC STREAMS ==========
	public static void problem6_numericStreams() {
		// 6a. Create range
		System.out.print("Numbers 1 to 10: ");
		IntStream.rangeClosed(1, 10).forEach(n -> System.out.print(n + " "));

		System.out.print("\nEven numbers 2 to 20: ");
		IntStream.rangeClosed(1, 10).map(n -> n * 2).forEach(n -> System.out.print(n + " "));

		// 6b. Generate sequence
		System.out.print("\nFirst 5 powers of 2: ");
		IntStream.iterate(1, n -> n * 2).limit(5).forEach(n -> System.out.print(n + " "));

		// 6c. Random numbers
		System.out.print("\n5 Random numbers (1-100): ");
		new Random().ints(5, 1, 101).forEach(n -> System.out.print(n + " "));

		// 6d. Statistical operations
		int[] scores = { 85, 90, 78, 92, 88 };
		System.out.println("\n\nScore Statistics:");
		System.out.println("Sum: " + IntStream.of(scores).sum());
		System.out.println("Average: " + IntStream.of(scores).average().orElse(0));
		System.out.println("Max: " + IntStream.of(scores).max().orElse(0));
		System.out.println("Min: " + IntStream.of(scores).min().orElse(0));
		System.out.println("Count: " + IntStream.of(scores).count());

		// 6e. Convert between stream types
		List<String> numbers = Arrays.asList("10", "20", "30", "40", "50");
		int sum = numbers.stream().mapToInt(Integer::parseInt).sum();
		System.out.println("Sum of parsed numbers: " + sum);

		// 6f. Generate and process
		double average = IntStream.generate(() -> new Random().nextInt(100)).limit(1000).average().orElse(0);
		System.out.println("Average of 1000 random numbers: " + average);
	}

	// ========== PROBLEM 7: GROUPING & PARTITIONING ==========
	public static void problem7_grouping() {
		List<String> names = Arrays.asList("Kartikey", "Keertan", "Abhisek", "Abhinav", "Ravi", "Ayush", "Aarav",
				"Karan", "Kunal", "Ankit");

		// 7a. Group by first letter
		Map<Character, List<String>> groupByFirstLetter = names.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println("Grouped by first letter:");
		groupByFirstLetter.forEach((letter, nameList) -> System.out.println("  " + letter + ": " + nameList));

		// 7b. Group by name length
		Map<Integer, List<String>> groupByLength = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("\nGrouped by length:");
		groupByLength.forEach((length, nameList) -> System.out.println("  Length " + length + ": " + nameList));

		// 7c. Partition by starting with 'A'
		Map<Boolean, List<String>> partitionByA = names.stream()
				.collect(Collectors.partitioningBy(name -> name.startsWith("A")));
		System.out.println("\nPartitioned by starting with 'A':");
		System.out.println("  Starting with A: " + partitionByA.get(true));
		System.out.println("  Not starting with A: " + partitionByA.get(false));

		// 7d. Group and count
		Map<Character, Long> countByFirstLetter = names.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));
		System.out.println("\nCount by first letter:");
		countByFirstLetter.forEach((letter, count) -> System.out.println("  " + letter + ": " + count + " names"));

		// 7e. Group and join
		Map<Character, String> joinByFirstLetter = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0),
				Collectors.mapping(String::toUpperCase, Collectors.joining(", "))));
		System.out.println("\nJoined by first letter:");
		joinByFirstLetter.forEach((letter, joined) -> System.out.println("  " + letter + ": " + joined));

		// 7f. Multi-level grouping
		Map<Character, Map<Integer, List<String>>> multiLevel = names.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.groupingBy(String::length)));
		System.out.println("\nMulti-level grouping (by first letter then length):");
		multiLevel.forEach((letter, lengthMap) -> {
			System.out.println("  " + letter + ":");
			lengthMap.forEach((length, nameList) -> System.out.println("    Length " + length + ": " + nameList));
		});
	}

	// ========== PROBLEM 8: FLATMAP & NESTED STRUCTURES ==========
	public static void problem8_flatmap() {
		// 8a. Flatten list of lists
		List<List<String>> nameGroups = Arrays.asList(Arrays.asList("Kartikey", "Keertan"),
				Arrays.asList("Abhisek", "Abhinav"), Arrays.asList("Ravi", "Ayush", "Aarav"));

		List<String> allNames = nameGroups.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("All names from nested lists: " + allNames);

		// 8b. Split strings into characters
		List<String> names = Arrays.asList("Kartikey", "Keertan", "Ravi");
		List<Character> allCharacters = names.stream().flatMap(name -> name.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		System.out.println("All characters: " + allCharacters);

		// 8c. Extract from objects
		List<Student> students = Arrays.asList(new Student("Kartikey", Arrays.asList("Math", "Science", "English")),
				new Student("Keertan", Arrays.asList("Science", "History")),
				new Student("Abhisek", Arrays.asList("Math", "Physics", "Chemistry")));

		List<String> allSubjects = students.stream().flatMap(student -> student.getSubjects().stream()).distinct()
				.collect(Collectors.toList());
		System.out.println("All unique subjects: " + allSubjects);

		// 8d. Matrix operations
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
		System.out.println("Sum of matrix elements: " + sum);

		// 8e. Multiple levels of flattening
		List<List<List<String>>> deepNested = Arrays.asList(
				Arrays.asList(Arrays.asList("Kartikey", "K"), Arrays.asList("Keertan", "K")),
				Arrays.asList(Arrays.asList("Abhisek", "A"), Arrays.asList("Abhinav", "A")));

		List<String> flattenedDeep = deepNested.stream().flatMap(List::stream).flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println("Deep flattened list: " + flattenedDeep);
	}

	// ========== PROBLEM 9: CUSTOM OBJECT STREAMS ==========
	public static void problem9_customObjects() {
		List<Employee> employees = Arrays.asList(new Employee("Kartikey", 75000, "Engineering", 25),
				new Employee("Keertan", 65000, "Engineering", 24), new Employee("Abhisek", 80000, "Sales", 28),
				new Employee("Abhinav", 55000, "HR", 22), new Employee("Ravi", 90000, "Engineering", 30),
				new Employee("Ayush", 60000, "Sales", 26), new Employee("Aarav", 70000, "HR", 27));

		// 9a. Filter high salary employees
		List<Employee> highSalary = employees.stream().filter(e -> e.getSalary() > 70000).collect(Collectors.toList());
		System.out.println("Employees with salary > 70,000:");
		highSalary.forEach(e -> System.out.println("  " + e.getName() + ": $" + e.getSalary()));

		// 9b. Sort by salary descending
		List<Employee> bySalaryDesc = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("\nEmployees sorted by salary (descending):");
		bySalaryDesc.forEach(e -> System.out.println("  " + e.getName() + ": $" + e.getSalary()));

		// 9c. Group by department
		Map<String, List<Employee>> byDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("\nEmployees grouped by department:");
		byDepartment.forEach((dept, empList) -> {
			System.out.println("  " + dept + ":");
			empList.forEach(e -> System.out.println("    " + e.getName()));
		});

		// 9d. Average salary per department
		Map<String, Double> avgSalaryByDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("\nAverage salary by department:");
		avgSalaryByDept.forEach((dept, avg) -> System.out.println("  " + dept + ": $" + String.format("%.2f", avg)));

		// 9e. Youngest employee in each department
		Map<String, Optional<Employee>> youngestByDept = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
		System.out.println("\nYoungest employee in each department:");
		youngestByDept.forEach(
				(dept, emp) -> System.out.println("  " + dept + ": " + emp.map(Employee::getName).orElse("None")));

		// 9f. Total salary expenditure
		double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("\nTotal salary expenditure: $" + totalSalary);

		// 9g. Employee summary
		DoubleSummaryStatistics salaryStats = employees.stream().mapToDouble(Employee::getSalary).summaryStatistics();
		System.out.println("\nSalary Statistics:");
		System.out.println("  Count: " + salaryStats.getCount());
		System.out.println("  Total: $" + salaryStats.getSum());
		System.out.println("  Average: $" + String.format("%.2f", salaryStats.getAverage()));
		System.out.println("  Min: $" + salaryStats.getMin());
		System.out.println("  Max: $" + salaryStats.getMax());
	}

	// ========== PROBLEM 10: PARALLEL STREAMS ==========
	public static void problem10_parallelStreams() {
		// Create large dataset
		List<Integer> largeNumbers = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());

		// 10a. Sequential vs Parallel processing
		System.out.println("Processing 1,000,000 numbers:");

		// Sequential
		long startTime = System.currentTimeMillis();
		long sequentialSum = largeNumbers.stream().mapToLong(Long::valueOf).sum();
		long sequentialTime = System.currentTimeMillis() - startTime;

		// Parallel
		startTime = System.currentTimeMillis();
		long parallelSum = largeNumbers.parallelStream().mapToLong(Long::valueOf).sum();
		long parallelTime = System.currentTimeMillis() - startTime;

		System.out.println("Sequential sum: " + sequentialSum + " (Time: " + sequentialTime + "ms)");
		System.out.println("Parallel sum: " + parallelSum + " (Time: " + parallelTime + "ms)");
		System.out.println(
				"Speed improvement: " + String.format("%.2f", (double) sequentialTime / parallelTime) + "x faster");

		// 10b. Parallel with ordering
		System.out.println("\nFirst 10 even numbers (parallel with ordering):");
		List<Integer> first10Evens = largeNumbers.parallelStream().filter(n -> n % 2 == 0).limit(10).sorted()
				.collect(Collectors.toList());
		System.out.println("  " + first10Evens);

		// 10c. Thread-safe operations
		System.out.println("\nCounting prime numbers (parallel):");
		long primeCount = largeNumbers.parallelStream().limit(10000).filter(CompleteStreamProblem::isPrime).count();
		System.out.println("  Prime numbers in first 10,000: " + primeCount);

		// 10d. When to use parallel streams
		System.out.println("\nBest Practices for Parallel Streams:");
		System.out.println("  ✓ Use for large datasets (>1000 elements)");
		System.out.println("  ✓ Use for CPU-intensive operations");
		System.out.println("  ✓ Avoid for I/O bound operations");
		System.out.println("  ✓ Be careful with stateful operations");
		System.out.println("  ✓ Consider using forEachOrdered() when order matters");
		System.out.println("  ✓ Test performance as results may vary");
	}

	// ========== PROBLEM 11: ADDITIONAL PRACTICE PROBLEMS ==========
	public static void problem11_additionalProblems() {
		List<String> names = Arrays.asList("Kartikey", "Keertan", "Abhisek", "Abhinav", "Ravi", "Ayush", "Aarav",
				"Karan", "Kunal", "Ankit");

		// 11a. Find longest name
		Optional<String> longestName = names.stream().max(Comparator.comparingInt(String::length));
		System.out.println("Longest name: " + longestName.orElse("None"));

		// 11b. Find shortest name
		Optional<String> shortestName = names.stream().min(Comparator.comparingInt(String::length));
		System.out.println("Shortest name: " + shortestName.orElse("None"));

		// 11c. Check if all names are unique
		boolean allUnique = names.stream().distinct().count() == names.size();
		System.out.println("All names are unique: " + allUnique);

		// 11d. Find names containing all vowels
		List<String> withAllVowels = names.stream().filter(name -> containsAllVowels(name.toLowerCase()))
				.collect(Collectors.toList());
		System.out.println("Names containing all vowels (a,e,i,o,u): " + withAllVowels);

		// 11e. Create map of name to length
		Map<String, Integer> nameLengthMap = names.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (existing, replacement) -> existing));
		System.out.println("Name to length mapping: " + nameLengthMap);

		// 11f. Sort names by number of vowels
		List<String> sortedByVowelCount = names.stream()
				.sorted(Comparator.comparingInt(name -> countVowels(((String) name).toLowerCase())).reversed())
				.collect(Collectors.toList());
		System.out.println("Sorted by vowel count (descending): " + sortedByVowelCount);

		// 11g. Find names that are palindromes
		List<String> palindromes = names.stream().filter(name -> {
			String reversed = new StringBuilder(name).reverse().toString();
			return name.equalsIgnoreCase(reversed);
		}).collect(Collectors.toList());
		System.out.println("Palindrome names: " + palindromes);
	}

	// ========== HELPER METHODS ==========
	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}

	private static boolean containsAllVowels(String str) {
		return str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u");
	}

	private static int countVowels(String str) {
		return (int) str.chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
	}
}

// ========== SUPPORTING CLASSES ==========

class Employee {
	private String name;
	private double salary;
	private String department;
	private int age;

	public Employee(String name, double salary, String department, int age) {
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " (Dept: " + department + ", Salary: $" + salary + ", Age: " + age + ")";
	}
}

class Student {
	private String name;
	private List<String> subjects;

	public Student(String name, List<String> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public List<String> getSubjects() {
		return subjects;
	}
}

class Order {
	private String orderId;
	private String customerName;
	private List<Product> products;
	private double totalAmount;

	public Order(String orderId, String customerName, List<Product> products) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.products = products;
		this.totalAmount = products.stream().mapToDouble(Product::getPrice).sum();
	}

	public String getOrderId() {
		return orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public double getTotalAmount() {
		return totalAmount;
	}
}

class Product {
	private String name;
	private String category;
	private double price;

	public Product(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}
}