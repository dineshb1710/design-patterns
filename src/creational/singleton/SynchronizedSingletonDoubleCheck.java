package creational.singleton;

/**
 * Below class represents implementation of a Singleton Pattern.
 * Thread-Safe with double check locking.
 */
public class SynchronizedSingletonDoubleCheck {

    private static SynchronizedSingletonDoubleCheck instance;

    private SynchronizedSingletonDoubleCheck() {
        // Default Constructor..
    }

    public static SynchronizedSingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SynchronizedSingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SynchronizedSingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
