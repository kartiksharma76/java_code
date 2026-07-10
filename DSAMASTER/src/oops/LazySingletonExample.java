package oops;

class DatabaseConnection {

	private static DatabaseConnection instance;

	private DatabaseConnection() {
		System.out.println("Database Connection Created");
	}

	public static DatabaseConnection getInstance() {

		if (instance == null) {
			instance = new DatabaseConnection();
		}

		return instance;
	}
}

public class LazySingletonExample {

	public static void main(String[] args) {

		DatabaseConnection obj1 = DatabaseConnection.getInstance();
		DatabaseConnection obj2 = DatabaseConnection.getInstance();

		System.out.println(obj1 == obj2);
	}
}