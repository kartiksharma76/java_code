package InfosysSpringboard;

class Customer {
    private String customerId;
    private String customerName;
    private long contactNumber;
    private String address;

    // Setters
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setContactNumber(long contactNumber) { this.contactNumber = contactNumber; }
    public void setAddress(String address) { this.address = address; }

    // Getters
    public String getCustomerId() { return customerId; }
    public String getCustomerName() { return customerName; }
    public long getContactNumber() { return contactNumber; }
    public String getAddress() { return address; }
}

class CustomerDetail {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Use setters to assign values
        customer.setCustomerId("C101");
        customer.setCustomerName("Jack");
        customer.setContactNumber(9876543210L);
        customer.setAddress("D089, St. Louis Street, Springfield");

        System.out.println("Displaying customer details:");
        // Use getters to access values
        System.out.println("Customer Id : " + customer.getCustomerId());
        System.out.println("Customer Name : " + customer.getCustomerName());
        System.out.println("Contact Number : " + customer.getContactNumber());
        System.out.println("Address : " + customer.getAddress());
    }
}