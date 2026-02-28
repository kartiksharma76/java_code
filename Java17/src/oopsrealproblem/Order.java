package oopsrealproblem;

import java.util.List;

import javabasics.Calcuatorjava1;

public class Order {
    private String orderId;
    private User user;
    private List<MenuItem> items;
    private OrderStatus status;
    private double totalAmount;
	public Order(String orderId, User user, List<MenuItem> items) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.items = items;
		this.status = OrderStatus.PLACED;
		  calculateTotal();
	}
	private void calculateTotal() {
		 totalAmount = 0;
	        for (MenuItem item : items) {
	            totalAmount += item.getPrice();
	        }
		
	}
    
	public void updateStatus(OrderStatus status) {
        this.status = status;
        System.out.println("Order Status Updated: " + status);
    }
	 public double getTotalAmount() {
	        return totalAmount;
	    }
	 
	 public OrderStatus getStatus() {
	        return status;
	    }
}
