package creational.factory;

public class Bike implements Vehicle {

    private String name;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("I am enjoying biking in my " + name);
    }
}
