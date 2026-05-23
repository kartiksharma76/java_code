package InfosysSpringboard;

public class FoodCorner {
	public static void main(String[] args) {
		calculateBill('N', 2, 7); // Example Test Case
	}

	public static void calculateBill(char foodType, int quantity, int distance) {
		int foodPrice = 0;
		int deliveryCharge = 0;

		// 1. Validation
		if (!((foodType == 'V' || foodType == 'N') && quantity >= 1 && distance > 0)) {
			System.out.println(-1);
			return;
		}

		// 2. Calculate Food Cost
		if (foodType == 'V') {
			foodPrice = 12 * quantity;
		} else {
			foodPrice = 15 * quantity;
		}

		// 3. Calculate Delivery Charge
		if (distance <= 3) {
			deliveryCharge = 0;
		} else if (distance <= 6) {
			deliveryCharge = (distance - 3) * 1;
		} else {
			deliveryCharge = ((distance - 6) * 2) + 3;
		}

		System.out.println(foodPrice + deliveryCharge);
	}
}
