package creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        EagerSingleton singleton_01 = EagerSingleton.getInstance();
        EagerSingleton singleton_02 = EagerSingleton.getInstance();
        System.out.println(singleton_01 == singleton_02);
    }
}
