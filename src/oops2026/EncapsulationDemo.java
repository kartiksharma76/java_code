package oops2026;

class BankAccount {
    private final String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance");
        }

        balance -= amount;
    }
}
    public class EncapsulationDemo {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("ACC101", "Kartik", 5000);
            account.deposit(2000);
            account.withdraw(1000);

            System.out.println(account.getHolderName());
            System.out.println(account.getBalance());
        }

}
