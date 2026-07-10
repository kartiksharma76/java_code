package oops;

class ConfigurationManager {

	private static volatile ConfigurationManager instance;

	private ConfigurationManager() {
	}

	public static ConfigurationManager getInstance() {

		if (instance == null) {

			synchronized (ConfigurationManager.class) {

				if (instance == null) {
					instance = new ConfigurationManager();
				}
			}
		}

		return instance;
	}
}

public class DoubleCheckedLockingExample {

	public static void main(String[] args) {

		ConfigurationManager config1 = ConfigurationManager.getInstance();
		ConfigurationManager config2 = ConfigurationManager.getInstance();

		System.out.println(config1 == config2);
	}
}