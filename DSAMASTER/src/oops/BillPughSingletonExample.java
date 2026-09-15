package oops;

class SecurityManagerSingleton {

	private SecurityManagerSingleton() {
	}

	private static class SingletonHelper {

		private static final SecurityManagerSingleton INSTANCE = new SecurityManagerSingleton();
	}

	public static SecurityManagerSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}

public class BillPughSingletonExample {

	public static void main(String[] args) {

		SecurityManagerSingleton obj1 = SecurityManagerSingleton.getInstance();
		SecurityManagerSingleton obj2 = SecurityManagerSingleton.getInstance();

		System.out.println(obj1 == obj2);
	}
}