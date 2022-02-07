package creational.abstractFactory;

public class Crow implements Bird {

    @Override
    public String getType() {
        return "Crow";
    }

    @Override
    public String makeSound() {
        return "Kaw-Kaw";
    }
}
