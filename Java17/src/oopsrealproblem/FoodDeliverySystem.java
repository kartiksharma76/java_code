package oopsrealproblem;

import java.util.List;

public class FoodDeliverySystem {
	public Order placedOrder(String orderId, User user, List<MenuItem> items, PaymentMethod1 upiPayment1) {
		Order order = new Order(orderId, user, items);

		upiPayment1.pay(order.getTotalAmount());
		order.updateStatus(OrderStatus.CONFIRMED);
		return order;

	}

	public void assignDelivery(Order order, DeliveryPartner partner) {
		if (partner.isAvailable()) {
			partner.assignOrder();
			order.updateStatus(OrderStatus.OUT_FOR_DELIVERY);
		}
	}

	public void completeOrder(Order order, DeliveryPartner partner) {
		order.updateStatus(OrderStatus.DELIVERED);
		partner.completeOrder();
	}
}
