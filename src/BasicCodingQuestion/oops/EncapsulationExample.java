package BasicCodingQuestion.oops;

class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private String password;

    BankAccount(long accountNumber, String accountHolderName, double balance, String accountType, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.password = password;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String name) {
        if (name != null && !name.isEmpty()) {
            this.accountHolderName = name;
            System.out.println("Name updated successfully");
        } else {
            System.out.println("Invalid name!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Password must contain at least 6 characters.");
        }
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount, String enteredPassword) {

        if (!password.equals(enteredPassword)) {
            System.out.println("Incorrect password!");
            return;
        }

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Display account details
    public void displayDetails() {

        System.out.println("\n===== ACCOUNT DETAILS =====");

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Available Balance: " + balance);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, "Kartik Sharma", 50000, "Savings", "kartik123");

        account.displayDetails();
        // Deposit money
        System.out.println("\n===== DEPOSIT =====");
        account.deposit(10000);

        // Withdraw money
        System.out.println("\n===== WITHDRAW =====");
        account.withdraw(5000, "kartik123");

        // Incorrect password
        account.withdraw(2000, "wrong123");

        // Update account holder name
        System.out.println("\n===== UPDATE DETAILS =====");
        account.setAccountHolderName("Kartik");

        // Update password
        account.setPassword("newpass123");

        // Access data using getters
        System.out.println("\n===== UPDATED INFORMATION =====");

        System.out.println("Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        // Display final details
        account.displayDetails();

        // Direct access is not allowed:
        // account.balance = 100000;
        // Compilation Error because balance is private.

    }
}
