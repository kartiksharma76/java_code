package trenningjava;

public class HelloDemo {
	public static void main(String[] args) {
		Hello h = () -> "Hello World";// lambda expression
		System.out.println(h.sayHello());
		System.out.println(h.sayBye());// calling default method

		Hello h2 = () -> {
			String msg = "Hello Monde";
			return msg;
		};
		System.out.println(h2.sayHello());
		Hello.greeting();// calling static method

	}
}
