package Practicesheet;

class Parent1 {
	int a = 10;
}

public class UsingSuperKey extends Parent1 {
	int a = 20;

	void show() {
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		UsingSuperKey obj = new UsingSuperKey();
		obj.show();
	}
}
