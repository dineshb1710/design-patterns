package creational.factory;

public class Car implements Vehicle {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("I am driving my " + name);
    }
}
