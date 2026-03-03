package Java8Practice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BankData {
	public static List<BankCustomer> getCustomers() {
		return Arrays.asList(new BankCustomer(1, "Rahul Sharma", "Bhopal", "Savings"),
				new BankCustomer(2, "Priya Singh", "Indore", "Current"),
				new BankCustomer(3, "Amit Verma", "Delhi", "Savings"),
				new BankCustomer(4, "Sneha Patel", "Mumbai", "Savings"),
				new BankCustomer(5, "Karan Mehta", "Pune", "Current"));

	}

	public static List<BankAccount1> getAccount1() {
		return Arrays.asList(new BankAccount1(101, 1, 150000, "Bhopal Main"),
				new BankAccount1(102, 2, 350000, "Indore MG Road"), new BankAccount1(103, 3, 90000, "Delhi CP"),
				new BankAccount1(104, 4, 780000, "Mumbai Andheri"), new BankAccount1(105, 5, 25000, "Pune Camp"));

	}

	public static List<BankTransaction> getTransactions() {
		return Arrays.asList(new BankTransaction(1, 101, "Deposit", 20000, LocalDate.of(2024, 1, 5)),
				new BankTransaction(2, 101, "Withdrawal", 5000, LocalDate.of(2024, 2, 10)),
				new BankTransaction(3, 102, "Deposit", 100000, LocalDate.of(2024, 3, 15)),
				new BankTransaction(4, 104, "Withdrawal", 20000, LocalDate.of(2024, 4, 20)),
				new BankTransaction(5, 103, "Deposit", 15000, LocalDate.of(2024, 5, 12)));

	}
}
