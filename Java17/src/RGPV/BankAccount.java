package RGPV;

public class BankAccount {
private int accountnumber;
private double balance;

public BankAccount(int accountnumber,double balance) {
	this.accountnumber=accountnumber;
	this.balance=balance;
	
}

public int getAccountnumber() {
	return accountnumber;
}



public double getBalance() {
	return balance;
}

public void deposite(double amount) {
	if(amount>0) {
		balance+=amount;
		System.out.println("deposite:"+amount);
	}
	else {
		System.out.println("invalid amount");
	}
}
public void withdraw(double amount) {
	if(amount>0&& amount<=balance) {
		balance-=amount;
		System.out.println("withdraw amount:");
	}else {
		System.out.println("insuffsient balance");
	}
}
public static void main(String[] args) {
	BankAccount account=new BankAccount(1487, 56000);
	System.out.println("account number:"+account.getAccountnumber());
	System.out.println("initial amount:"+account.getBalance());
	account.deposite(10000);
	account.withdraw(5000);
	System.out.println("final amount:"+account.getBalance());
}

}
