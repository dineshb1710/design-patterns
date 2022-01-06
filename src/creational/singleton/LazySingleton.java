package creational.singleton;

/**
 * Below class represents implementation of Singleton Pattern.
 * Lazy Initialization.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        // Default Constructor..
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
