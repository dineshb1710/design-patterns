package creational.singleton;

/**
 * Below class represents implementation of a 'Singleton' Pattern.
 * Eager Initialization.
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Default Constructor..
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
