package oops;

class LoggerManager {

	private static final LoggerManager instance = new LoggerManager();

	private LoggerManager() {
		System.out.println("Logger Created");
	}

	public static LoggerManager getInstance() {
		return instance;
	}
}

public class EagerSingletonExample {

	public static void main(String[] args) {

		LoggerManager logger1 = LoggerManager.getInstance();
		LoggerManager logger2 = LoggerManager.getInstance();

		System.out.println(logger1 == logger2);
	}
}