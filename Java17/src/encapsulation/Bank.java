package encapsulation;

public class Bank {
 private int balance=4000;
  public int withdraw(int amount) {
	  if (amount<=5000 && amount<=balance ) {
		  return amount;
	  }
	  return -1;
  }
}
