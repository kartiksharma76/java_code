package trenningjava;

@FunctionalInterface
public interface Hello {
	String sayHello();

	default String sayBye() {
		return "goodbye!";
	}

	static void greeting() {
		System.out.println("Hola  Amigo!");
	}
}
