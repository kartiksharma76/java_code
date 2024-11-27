package Inheritance;

public class FamilyInheritance {
	public static void main(String[] args) {
		Son son1 = new Son("kartik", "fortuner", "royal infield classic 350", 1000000);
		Son son2 = new Son("anshu", "boloro", "honda sp 125", 2000000);

		son1.displayDetails();
		son2.displayDetails();
	}
}
