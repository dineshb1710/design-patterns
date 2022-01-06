package creational.singleton;

/**
 * Below class represents implementation of a Singleton Pattern.
 * Thread-Safe.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        // Default Constructor.
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
