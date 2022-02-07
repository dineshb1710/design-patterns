package creational.abstractFactory;

public class FactoryProvider {

    public static AbstractFactory create(String type) {
        if (type.equalsIgnoreCase("Animal")) {
            return new AnimalFactory();
        } else if (type.equalsIgnoreCase("Bird")) {
            return new BirdFactory();
        } else {
            return null;
        }
    }
}
