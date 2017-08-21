package creational.singleton;

public class DBsingleton {

	// the embbeded instance must be private static

	// it must be lazy-loaded when jvm starts
	private static DBsingleton instance = null;

	// A private non-arg constructor
	private DBsingleton() {
	}

	// A public method to get the instance.
	public static DBsingleton getInstance() {

		if (instance == null) {
			synchronized (DBsingleton.class) {
				if (instance == null) {

					instance = new DBsingleton();
				}
			}

		}
		return instance;
	}
}
