package oopsrealproblem;

import java.util.Arrays;

public class FoodApp {
public static void main(String[] args) {
	  User user = new User("U1", "Kartik");
	  
      MenuItem burger = new MenuItem("I1", "Burger", 120);
      MenuItem pizza = new MenuItem("I2", "Pizza", 250);
      
      DeliveryPartner partner = new DeliveryPartner("D1", "Ravi");
      FoodDeliverySystem system = new FoodDeliverySystem();
      
      Order order = system.placedOrder(
              "O1",
              user,
              Arrays.asList(burger, pizza),
              new UpiPayment1()
      );
      
      system.assignDelivery(order, partner);
      system.completeOrder(order, partner);
}
}
