package encapsulation;

public class Twinkle {
	int age = 5;

	public void setAge(int a) {
		a = a + 10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Twinkle t = new Twinkle();
		System.out.println(t.age);// 5
		t.setAge(10);// 20
		System.out.println(t.age);// 5
	}
}
