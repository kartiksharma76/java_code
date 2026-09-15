package trenningjava;

public class Accounts {
	private double balance;

	public Accounts(double balance) {
		super();
		this.balance = balance;
	}

	public String toString() {
		return "Account {balance" + balance + "}";
	}

	public double deposite(double amount) {
		balance += amount;
		return balance;
	}

	public double withdraw(double amount) throws BalanneException {
		if (amount == balance) {
			balance += amount;
		} else {
			throw new BalanneException("Insufficient balance");
		}
		return balance;
	}

	public static void main(String[] args) {
		Accounts a1 = new Accounts(100);
//		System.out.println(a1.balance);
//		System.out.println(a1.deposite(50));
		try {
			a1.withdraw(500);
		} catch (BalanneException e) {
			// TODO Auto-generated catch
//			e.printStackTrace();// trouble shoot
//			System.out.println(e);// system behabour
			System.out.println(e.getMessage());
		}
	}
}
