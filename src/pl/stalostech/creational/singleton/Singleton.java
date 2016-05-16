package pl.stalostech.creational.singleton;

/**
 * Singleton example.
 * 
 * @author Bartosz Wysocki
 *
 */
public class Singleton {

	/**
	 * Lazy initialization
	 * 
	 * @author Bartosz Wysocki
	 */
	public static class LazySingleton {

		private static volatile Singleton instance = null;

		private LazySingleton() {
		}

		public static Singleton getInstance() {
			if (instance == null) {
				synchronized (Singleton.class) {
					if (instance == null) {
						instance = new Singleton();
					}
				}
			}
			return instance;
		}

	}

	/**
	 * Eager initialization
	 * 
	 * @author Bartosz Wysocki
	 *
	 */
	public static class EagerSingleton {
		private static final EagerSingleton instance = new EagerSingleton();

		private EagerSingleton() {
		}

		public static EagerSingleton getInstance() {
			return instance;
		}
	}

	/**
	 * Enum singleton
	 * 
	 * @author Bartosz Wysocki
	 *
	 */
	public static enum EnumSingleton {
		INSTANCE;

		public void someMethod() {
			System.out.println("Some method");
		}
	}

	/**
	 * Class loading order singleton (lazy without volatile and synchronized)
	 * 
	 * @author Bartosz Wysocki
	 *
	 */
	public static class CLSingleton {

		private CLSingleton() {
		}

		private static class CLSingletonHolder {
			public static final CLSingleton INSTANCE = new CLSingleton();
		}

		public static CLSingleton getInstance() {
			return CLSingletonHolder.INSTANCE;
		}
	}
}
