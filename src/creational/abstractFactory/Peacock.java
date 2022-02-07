package creational.abstractFactory;

public class Peacock implements Bird {
    @Override
    public String getType() {
        return "Peacock";
    }

    @Override
    public String makeSound() {
        return "Kaa-Kaa";
    }
}
