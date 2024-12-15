package encapsulation;

public class BankAccountcTest {
public static void main(String[] args) {
	BankAccountC c=new BankAccountC(1487,18000);
	System.out.println("Account number:"+c.getAccountnumber());
	System.out.println("initial balance:"+c.getBalance());
	c.deposite(10000);
	c.withdraw(1000);
	System.out.println("final amount:"+c.getBalance());
	
}
}
