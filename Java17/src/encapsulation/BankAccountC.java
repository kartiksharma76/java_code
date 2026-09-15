package encapsulation;

public class BankAccountC {
private int Accountnumber;
private double balance;

public BankAccountC(int Accountnumber,double initialbalance) {
	this.Accountnumber=Accountnumber;
	this.balance=initialbalance;
	
}

public int getAccountnumber() {
	return Accountnumber;
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
		System.out.println("initial amount");
	}
}

public void withdraw(double amount) {
	if(amount>0&&amount<=balance) {
		balance-=amount;
		System.out.println("withdraw amount");
		
	}else {
		System.out.println("insuffisient balance");
	}
}

}
