package Java8Practice;

public class BankCustomer {
	private int customerId;
	private String customerName;
	private String city;
	private String accountType;

	public BankCustomer(int customerId, String customerName, String city, String accountType) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
		this.accountType = accountType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCity() {
		return city;
	}

	public String getAccountType() {
		return accountType;
	}

	@Override
	public String toString() {
		return "ID=" + customerId + ", Name='" + customerName + '\'' + ", City='" + city + '\'' + ", AccountType='"
				+ accountType + '\'';

	}

}
