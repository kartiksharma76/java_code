package Java8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankTest {
	public static void main(String[] args) {

		List<BankAccount1> accounts = BankData.getAccount1();
		List<BankTransaction> transections = BankData.getTransactions();
		List<BankCustomer> customers = BankData.getCustomers();
		List<BankTransaction> transactions = BankData.getTransactions();
//	Find account with highest balance

		accounts.stream().collect(Collectors.maxBy(Comparator.comparing(BankAccount1::getBalance)))
				.ifPresent(System.out::println);

//  Accounts with balance > 1 lakh
		System.out.println("\nHigh Balance Accounts:");
		accounts.stream().filter(a -> a.getBalance() > 100000).forEach(System.out::println);

// Total deposit amount	
		double totalDeposite = transections.stream().filter(t -> t.getType().equals("Deposite"))
				.mapToDouble(BankTransaction::getAmount).sum();
		System.out.println("\nTotal Deposits: " + totalDeposite);

// Group transactions by account number   
		Map<Integer, List<BankTransaction>> txnMap = transections.stream()
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber));
		System.out.println("\nTransactions Grouped by Account:");
		txnMap.forEach((acc, txnList) -> System.out.println(acc + " -> " + txnList.size()));

		// Second highest balance Account
		accounts.stream().sorted(Comparator.comparing(BankAccount1::getBalance).reversed()).skip(1).findFirst()
				.ifPresent(acc -> System.out.println("Second Highest: " + acc));

// Average Account Balance
		double avgBalance = accounts.stream().mapToDouble(BankAccount1::getBalance).average().orElse(0);
		System.out.println("Average Balance: " + avgBalance);

//Branch with Highest Total Balance
		accounts.stream()
				.collect(Collectors.groupingBy(BankAccount1::getBranch,
						Collectors.summingDouble(BankAccount1::getBalance)))
				.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

//Total Withdrawal Amount
		double totalWithdrawal = transactions.stream().filter(t -> t.getType().equals("Withdrawl"))
				.mapToDouble(BankTransaction::getAmount).sum();
		System.out.println("Total Withdrawal: " + totalWithdrawal);

		// Transaction with Highest Amount
		transactions.stream().max(Comparator.comparing(BankTransaction::getAmount))
				.ifPresent(t -> System.out.println("Highest Transaction: " + t));

		// Customer Name with Highest Balance
		accounts.stream().max(Comparator.comparing(BankAccount1::getBalance))
				.flatMap(acc -> customers.stream().filter(c -> c.getCustomerId() == acc.getCustomerId()).findFirst())
				.ifPresent(c -> System.out.println("Customer with Highest Balance: " + c));

		// Total Transaction Amount Per Account
		Map<Integer, Double> totalTxnPerAccount = transactions.stream().collect(Collectors
				.groupingBy(BankTransaction::getAccountNumber, Collectors.summingDouble(BankTransaction::getAmount)));
		totalTxnPerAccount.forEach((acc, total) -> System.out.println("Account " + acc + " → " + total));

		// Accounts with Balance > 1 Lakh

		accounts.stream().filter(a -> a.getBalance() > 100000).forEach(a -> System.out.println("High Balance: " + a));

		// Net Transaction Per Account

		Map<Integer, Double> netTxn = transactions.stream()
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber,
						Collectors.summingDouble(t -> t.getType().equals("Deposit") ? t.getAmount() : -t.getAmount())));

		netTxn.forEach((acc, net) -> System.out.println("Account " + acc + " Net: " + net));

//Inactive Accounts (No Transactions)

		accounts.stream()
				.filter(acc -> transactions.stream().noneMatch(t -> t.getAccountNumber() == acc.getAccountNumber()))
				.forEach(acc -> System.out.println("Inactive: " + acc));

		// Q1 -> Counting how many transactions each account has
		Map<Integer, Long> txnCountPerAccount = transactions.stream()
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber, Collectors.counting()));

		txnCountPerAccount
				.forEach((acc, count) -> System.out.println("Account " + acc + " → " + count + " transactions"));

		// Q2 -> Grouping all transactions based on type
		Map<String, List<BankTransaction>> txnByType = transactions.stream()
				.collect(Collectors.groupingBy(BankTransaction::getType));

		txnByType.forEach((type, list) -> System.out.println(type + " → " + list.size()));

		// Q3 -> Getting most recent transaction using max()
		transactions.stream().max(Comparator.comparing(BankTransaction::getDate))
				.ifPresent(t -> System.out.println("Latest Transaction: " + t));

		// Q4 -> Join customer + account and filter based on city & balance
		customers.stream().filter(c -> c.getCity().equalsIgnoreCase("Bhopal")).filter(
				c -> accounts.stream().anyMatch(a -> a.getCustomerId() == c.getCustomerId() && a.getBalance() > 100000))
				.forEach(c -> System.out.println("Eligible Customer: " + c));

		// Q5 -> Group customers by city and find max count city
		customers.stream().collect(Collectors.groupingBy(BankCustomer::getCity, Collectors.counting())).entrySet()
				.stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

		// Q6 -> Finding accounts with any transaction > 50000
		transactions.stream().filter(t -> t.getAmount() > 50000).map(BankTransaction::getAccountNumber).distinct()
				.forEach(acc -> System.out.println("Suspicious Account: " + acc));

		// Q7 -> Find account with highest withdrawal amount
		transactions.stream().filter(t -> t.getType().equals("Withdrawal"))
				.max(Comparator.comparing(BankTransaction::getAmount))
				.ifPresent(t -> System.out.println("Top Spending Account: " + t.getAccountNumber()));

		// Q8 -> Convert account list into Map
		Map<Integer, Double> accountBalanceMap = accounts.stream()
				.collect(Collectors.toMap(BankAccount1::getAccountNumber, BankAccount1::getBalance));

		accountBalanceMap.forEach((acc, bal) -> System.out.println(acc + " → " + bal));

		// Q9 -> Find customers who did both Deposit and Withdrawal
		customers.stream().filter(c -> {
			List<String> types = transactions.stream().filter(t -> accounts.stream().anyMatch(
					a -> a.getCustomerId() == c.getCustomerId() && a.getAccountNumber() == t.getAccountNumber()))
					.map(BankTransaction::getType).distinct().toList();

			return types.contains("Deposit") && types.contains("Withdrawal");
		}).forEach(c -> System.out.println("Active Customer: " + c));

		// Q10 -> Using reduce() instead of sum()
		double totalDeposit = transactions.stream().filter(t -> t.getType().equals("Deposit"))
				.map(BankTransaction::getAmount).reduce(0.0, Double::sum);

		System.out.println("Total Deposit (Reduce): " + totalDeposit);

		// ===================== Q11 =====================
		// Q11 -> Get all transactions in 2024 sorted by date

		transactions.stream().filter(t -> t.getDate().getYear() == 2024)
				.sorted(Comparator.comparing(BankTransaction::getDate)).forEach(System.out::println);

		// ===================== Q12 =====================
		// Q12 -> Find accounts that never had withdrawal

		accounts.stream()
				.filter(acc -> transactions.stream().noneMatch(
						t -> t.getAccountNumber() == acc.getAccountNumber() && t.getType().equals("Withdrawal")))
				.forEach(acc -> System.out.println("No Withdrawal: " + acc));

		// ===================== Q13 =====================
		// Q13 -> Get total balance per city

		customers.stream().collect(Collectors.groupingBy(BankCustomer::getCity,
				Collectors.summingDouble(c -> accounts.stream().filter(a -> a.getCustomerId() == c.getCustomerId())
						.mapToDouble(BankAccount1::getBalance).sum())))
				.forEach((city, total) -> System.out.println(city + " → " + total));

		// ===================== Q14 =====================
		// Q14 -> Find top 3 accounts by total transaction amount

		transactions.stream()
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber,
						Collectors.summingDouble(BankTransaction::getAmount)))
				.entrySet().stream().sorted(Map.Entry.<Integer, Double>comparingByValue().reversed()).limit(3)
				.forEach(System.out::println);

		// ===================== Q15 =====================
		// Q15 -> Average deposit amount per account

		transactions.stream().filter(t -> t.getType().equals("Deposit"))
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber,
						Collectors.averagingDouble(BankTransaction::getAmount)))
				.forEach((acc, avg) -> System.out.println("Account " + acc + " Avg Deposit: " + avg));

		// ===================== Q16 =====================
		// Q16 -> Find inactive accounts (no transactions at all)

		accounts.stream()
				.filter(acc -> transactions.stream().noneMatch(t -> t.getAccountNumber() == acc.getAccountNumber()))
				.forEach(acc -> System.out.println("Inactive Account: " + acc));

		// ===================== Q17 =====================
		// Q17 -> Find customer whose total transaction amount is highest

		transactions.stream()
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber,
						Collectors.summingDouble(BankTransaction::getAmount)))
				.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry -> {
					accounts.stream().filter(a -> a.getAccountNumber() == entry.getKey()).findFirst()
							.ifPresent(acc -> customers.stream().filter(c -> c.getCustomerId() == acc.getCustomerId())
									.findFirst().ifPresent(c -> System.out.println("Top Customer: " + c)));
				});

		// ===================== Q18 =====================
		// Q18 -> Create Map<City, Double> -> Total balance per city

		Map<String, Double> cityBalanceMap = customers.stream()
				.collect(Collectors.groupingBy(BankCustomer::getCity,
						Collectors.summingDouble(
								c -> accounts.stream().filter(a -> a.getCustomerId() == c.getCustomerId())
										.mapToDouble(BankAccount1::getBalance).sum())));

		cityBalanceMap.forEach((city, bal) -> System.out.println(city + " → " + bal));

		// ===================== Q19 =====================
		// Q19 -> Using summarizingDouble on account balance

		DoubleSummaryStatistics stats = accounts.stream()
				.collect(Collectors.summarizingDouble(BankAccount1::getBalance));

		System.out.println("Count: " + stats.getCount());
		System.out.println("Sum: " + stats.getSum());
		System.out.println("Min: " + stats.getMin());
		System.out.println("Max: " + stats.getMax());
		System.out.println("Average: " + stats.getAverage());

		// ===================== Q20 =====================
		// Q20 -> Sort accounts by balance descending then branch

		accounts.stream()
				.sorted(Comparator.comparing(BankAccount1::getBalance).reversed()
						.thenComparing(BankAccount1::getBalance).reversed().thenComparing(BankAccount1::getBranch))
				.forEach(System.out::println);

		// ===================== Q21 =====================
		// Q21 -> Count how many customers per city

		customers.stream().collect(Collectors.groupingBy(BankCustomer::getCity, Collectors.counting()))
				.forEach((city, count) -> System.out.println(city + " -> " + count));

		// ===================== Q22 =====================
		// Q22 -> Find customers having Current account only

		customers.stream()
				.filter(c -> accounts.stream().anyMatch(
						a -> a.getCustomerId() == c.getCustomerId() && c.getAccountType().equalsIgnoreCase("Current")))
				.forEach(c -> System.out.println("Current Account Holder -> " + c));

		// ===================== Q23 =====================
		// Q23 -> Find account numbers sorted by balance descending

		accounts.stream().sorted(Comparator.comparing(BankAccount1::getBalance).reversed())
				.map(BankAccount1::getAccountNumber).forEach(accNo -> System.out.println("Sorted Account -> " + accNo));

		// ===================== Q24 =====================
		// Q24 -> Count how many accounts have balance less than 50,000

		long lowBalanceCount = accounts.stream().filter(a -> a.getBalance() < 50000).count();

		System.out.println("Low Balance Accounts -> " + lowBalanceCount);

		// ===================== Q25 =====================
		// Q25 -> Find total balance of all accounts combined

		double totalBalance = accounts.stream().mapToDouble(BankAccount1::getBalance).sum();

		System.out.println("Total Bank Balance -> " + totalBalance);

		// ===================== Q26 =====================
		// Q26 -> Find account with minimum balance

		accounts.stream().min(Comparator.comparing(BankAccount1::getBalance))

				.ifPresent(acc -> System.out.println("Minimum Balance Account -> " + acc));

		// ===================== Q27 =====================
		// Q27 -> Find customers who have balance greater than 2 lakh

		customers.stream().filter(
				c -> accounts.stream().anyMatch(a -> a.getCustomerId() == c.getCustomerId() && a.getBalance() > 200000))
				.forEach(c -> System.out.println("High Value Customer -> " + c));

		// ===================== Q28 =====================
		// Q28 -> Find branch wise total deposit amount

		transactions.stream().filter(t -> t.getType().equals("Deposit"))
				.collect(Collectors.groupingBy(
						t -> accounts.stream().filter(a -> a.getAccountNumber() == t.getAccountNumber()).findFirst()
								.map(BankAccount1::getBranch).orElse("Unknown"),
						Collectors.summingDouble(BankTransaction::getAmount)))
				.forEach((branch, total) -> System.out.println(branch + " -> " + total));

		// ===================== Q29 =====================
		// Q29 -> Find top spending account (max total withdrawal)

		transactions.stream().filter(t -> t.getType().equals("Withdrawal"))
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber,
						Collectors.summingDouble(BankTransaction::getAmount)))
				.entrySet().stream().max(Map.Entry.comparingByValue())
				.ifPresent(entry -> System.out.println("Top Spending Account -> " + entry));

		// ===================== Q30 =====================
		// Q30 -> Find customers who never made any transaction

		customers.stream()
				.filter(c -> accounts.stream().filter(a -> a.getCustomerId() == c.getCustomerId()).noneMatch(
						a -> transactions.stream().anyMatch(t -> t.getAccountNumber() == a.getAccountNumber())))
				.forEach(c -> System.out.println("No Transaction Customer -> " + c));

		// ===================== Q31 =====================
		// Q31 -> Calculate net transaction amount per account (Deposit - Withdrawal)

		transactions.stream()
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber,
						Collectors.summingDouble(t -> t.getType().equals("Deposit") ? t.getAmount() : -t.getAmount())))
				.forEach((acc, net) -> System.out.println("Net Amount -> " + acc + " : " + net));

		// ===================== Q32 =====================
		// Q32 -> Find customer whose total transaction amount is highest

		transactions.stream()
				.collect(Collectors.groupingBy(BankTransaction::getAccountNumber,
						Collectors.summingDouble(BankTransaction::getAmount)))
				.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry -> {
					accounts.stream().filter(a -> a.getAccountNumber() == entry.getKey()).findFirst()
							.ifPresent(acc -> customers.stream().filter(c -> c.getCustomerId() == acc.getCustomerId())
									.findFirst()
									.ifPresent(c -> System.out.println("Highest Transaction Customer -> " + c)));
				});

		// ===================== Q33 =====================
		// Q33 -> Find accounts having single transaction greater than 1 lakh

		transactions.stream().filter(t -> t.getAmount() > 100000).map(BankTransaction::getAccountNumber).distinct()
				.forEach(acc -> System.out.println("High Single Transaction Account -> " + acc));

		// ===================== Q34 =====================
		// Q34 -> Get list of customers sorted by total account balance descending

		customers.stream().sorted((c1, c2) -> {
			double bal1 = accounts.stream().filter(a -> a.getCustomerId() == c1.getCustomerId())
					.mapToDouble(BankAccount1::getBalance).sum();

			double bal2 = accounts.stream().filter(a -> a.getCustomerId() == c2.getCustomerId())
					.mapToDouble(BankAccount1::getBalance).sum();

			return Double.compare(bal2, bal1);
		}).forEach(c -> System.out.println("Sorted Customer -> " + c));

		// ===================== Q35 =====================
		// Q35 -> Find total deposit amount using reduce()

		double totalDepositReduce = transactions.stream().filter(t -> t.getType().equals("Deposit"))
				.map(BankTransaction::getAmount).reduce(0.0, (a, b) -> a + b);

		System.out.println("Total Deposit (Reduce) -> " + totalDepositReduce);

		// ===================== Q36 =====================
		// Q36 -> Find branch having highest total balance

		accounts.stream()
				.collect(Collectors.groupingBy(BankAccount1::getBranch,
						Collectors.summingDouble(BankAccount1::getBalance)))
				.entrySet().stream().max(Map.Entry.comparingByValue())
				.ifPresent(entry -> System.out.println("Top Branch -> " + entry));

		// ===================== Q37 =====================
		// Q37 -> Use summarizingDouble on transaction amount

		DoubleSummaryStatistics txnStats = transactions.stream()
				.collect(Collectors.summarizingDouble(BankTransaction::getAmount));

		System.out.println("Txn Count -> " + txnStats.getCount());
		System.out.println("Txn Sum -> " + txnStats.getSum());
		System.out.println("Txn Min -> " + txnStats.getMin());
		System.out.println("Txn Max -> " + txnStats.getMax());
		System.out.println("Txn Avg -> " + txnStats.getAverage());

		// ===================== Q38 =====================
		// Q38 -> Find accounts having more than 2 transactions

		transactions.stream().collect(Collectors.groupingBy(BankTransaction::getAccountNumber, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 2)
				.forEach(entry -> System.out.println("Frequent Account -> " + entry));

		// ===================== Q39 =====================
		// Q39 -> Get list of all unique branches

		accounts.stream().map(BankAccount1::getBranch).distinct()
				.forEach(branch -> System.out.println("Branch -> " + branch));

		// ===================== Q40 =====================
		// Q40 -> Find top 5 highest balance accounts

		accounts.stream().sorted(Comparator.comparing(BankAccount1::getBalance).reversed()).limit(5)
				.forEach(acc -> System.out.println("Top 5 Account -> " + acc));

		// ===================== HARDCORE STREAM TRAPS =====================

		// Q1 -> What happens if max() is called on empty stream?
		// Ans -> It returns Optional.empty(). Calling get() throws
		// NoSuchElementException.
		// Fix -> Use orElse(), orElseThrow(), ifPresent().

		// Q2 -> Why is acc.get() dangerous?
		// Ans -> If Optional is empty → NoSuchElementException.
		// Fix -> acc.ifPresent(...), or acc.orElse(defaultValue).

		// Q3 -> map() vs flatMap()
		// Ans -> map() transforms one-to-one.
//		        flatMap() flattens nested streams (Stream<Stream<T>> -> Stream<T>).
		// Example -> transactions per account requires flatMap().

		// Q4 -> Why is nested stream inefficient?
		// Ans -> customers (n) × accounts (m) → O(n*m).
		// Fix -> Convert accounts to Map<customerId, Account> for O(n).

		// Q5 -> How to optimize nested join?
		// Ans ->
		// Map<Integer, BankAccount> accountMap =
//		     accounts.stream().collect(Collectors.toMap(
//		         BankAccount::getCustomerId, a -> a));
		// Then lookup in O(1).

		// Q6 -> toMap() vs groupingBy()
		// Ans -> toMap() requires unique key.
//		        groupingBy() allows duplicate keys (creates List).
		// toMap() throws IllegalStateException if duplicate key.

		// Q7 -> Why IllegalStateException in toMap(branch, balance)?
		// Ans -> Multiple accounts may have same branch (duplicate key).
		// Fix -> Provide merge function:
		// toMap(key, value, (v1, v2) -> v1 + v2)

		// Q8 -> findFirst() vs findAny()
		// Ans -> findFirst() preserves order.
//		        findAny() may return any element (faster in parallel).

		// Q9 -> Is Stream thread-safe?
		// Ans -> Stream itself is safe.
//		        But modifying shared mutable state inside stream is NOT safe.

		// Q10 -> Why reduce(...).get() is risky?
		// Ans -> If stream empty → Optional.empty → get() throws exception.
		// Fix -> reduce(0.0, Double::sum).

		// Q11 -> reduce() vs collect()
		// Ans -> reduce() → immutable reduction.
//		        collect() → mutable reduction (List, Map).
		// Don't use reduce() for building collections.

		// Q12 -> map() vs mapToDouble()
		// Ans -> map() returns Stream<Double> (boxing).
//		        mapToDouble() returns DoubleStream (primitive, faster).

		// Q13 -> Why count().forEach() not compile?
		// Ans -> count() returns long, not stream.
		// forEach() works only on Stream.

		// Q14 -> Can we reuse stream?
		// Ans -> No. Stream is single-use.
		// After terminal operation → IllegalStateException.

		// Q15 -> Difference between limit() and skip()
		// Ans -> limit(n) → first n elements.
//		        skip(n) → ignore first n elements.

		// Q16 -> What happens if comparator inconsistent?
		// Ans -> Sorting may behave unpredictably.
		// Comparator must follow transitive rule.

		// Q17 -> Why this is bad practice?
		// accounts.parallelStream().forEach(list::add);
		// Ans -> list is shared mutable state → race condition.

		// Q18 -> Difference between anyMatch(), allMatch(), noneMatch()
		// Ans -> anyMatch → at least one true.
//		        allMatch → all true.
//		        noneMatch → no element true.

		// Q19 -> What is short-circuiting operation?
		// Ans -> Operations like findFirst(), anyMatch(), limit() stop early.
		// Improves performance.

		// Q20 -> Why use Collectors.summarizingDouble()?
		// Ans -> Single pass gives count, sum, min, max, average.
		// More efficient than multiple separate stream operations.

		// ===================== 15 TRICKY OUTPUT QUESTIONS =====================

		// Assume:
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

		// Q1 ->
		nums.stream().map(n -> n * 2);
		// Ans -> No output (no terminal operation).

		// Q2 ->
		nums.stream().filter(n -> n > 3).count();
		// Ans -> 2

		// Q3 ->
		nums.stream().limit(3).skip(1).forEach(System.out::print);
		// Ans -> 23

		// Q4 ->
		Stream.of("A", "B", "C").parallel().findAny().get();
		// Ans -> A or B or C (parallel not ordered)

		// Q5 ->
		Optional<Integer> opt = nums.stream().filter(n -> n > 10).findFirst();
		System.out.println(opt.orElse(100));
		// Ans -> 100

		// Q6 ->
		nums.stream().reduce((a, b) -> a + b).get();
		// Ans -> 15

		// Q7 ->
		nums.stream().sorted((a, b) -> b - a).limit(2).forEach(System.out::print);
		// Ans -> 54

		// Q8 ->
		nums.stream().distinct().count();
		// Ans -> 5

		// Q9 ->
		nums.parallelStream().forEach(System.out::print);
		// Ans -> Order not guaranteed

		// Q10 ->
		nums.stream().mapToInt(n -> n).average().getAsDouble();
		// Ans -> 3.0

		// Q11 ->
		nums.stream().allMatch(n -> n > 0);
		// Ans -> true

		// Q12 ->
		nums.stream().noneMatch(n -> n < 0);
		// Ans -> true

		// Q13 ->
		nums.stream().anyMatch(n -> n == 3);
		// Ans -> true

		// Q14 ->
		nums.stream().collect(Collectors.toMap(n -> n, n -> n * n));
		// Ans -> {1=1,2=4,3=9,4=16,5=25}

		// Q15 ->
		nums.stream().peek(System.out::print).count();
		// Ans -> Nothing printed (peek not executed without terminal consuming data)

		// ===================== PARALLEL STREAM INTERNAL DEEP DIVE
		// =====================

		// 1 -> Uses ForkJoinPool.commonPool()
		// 2 -> Splits data using Spliterator
		// 3 -> Uses divide-and-conquer
		// 4 -> Combines partial results
		// 5 -> Order not guaranteed unless forEachOrdered()
		// 6 -> Stateful lambdas cause race conditions
		// 7 -> Not always faster (small data = overhead)
		// 8 -> CPU-bound tasks benefit most
		// 9 -> IO-bound tasks usually worse
		// 10 -> Use parallel() only when:
//		        - large dataset
//		        - stateless operations
//		        - no shared mutable state

		// ===================== REAL BANKING INTERVIEW MOCK =====================

		// Q1 -> Find customer with highest total transaction amount.
		// Q2 -> Find branch with max average balance.
		// Q3 -> Detect suspicious accounts (> 1 lakh single txn).
		// Q4 -> Find customers who never made withdrawal.
		// Q5 -> Find top 3 branches by total deposits.
		// Q6 -> Calculate net balance after transactions.
		// Q7 -> Find duplicate transaction amounts.
		// Q8 -> Sort customers by total balance then city.
		// Q9 -> Find inactive accounts (no txn).
		// Q10 -> Optimize nested joins using Map.

		// ===================== STREAM + OPTIONAL + COMPARATOR CHALLENGE
		// =====================

		// Challenge 1 ->
		accounts.stream().max(Comparator.comparing(BankAccount1::getBalance)).map(BankAccount1::getAccountNumber)
				.orElseThrow();

		// Challenge 2 ->
		accounts.stream().sorted(
				Comparator.comparing(BankAccount1::getBalance).reversed().thenComparing(BankAccount1::getBranch))
				.findFirst();

		// Challenge 3 ->
		Optional<Double> avg = accounts.stream().map(BankAccount1::getBalance).reduce(Double::sum)
				.map(sum -> sum / accounts.size());

		// Challenge 4 ->
		accounts.stream().filter(a -> a.getBalance() > 100000).min(Comparator.comparing(BankAccount1::getBranch));

	}
}
