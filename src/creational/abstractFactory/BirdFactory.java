package creational.abstractFactory;

public class BirdFactory implements AbstractFactory<Bird> {

    @Override
    public Bird create(String type) {
        if(type.equalsIgnoreCase("Crow")) {
            return new Crow();
        } else if(type.equalsIgnoreCase("Peacock")) {
            return new Peacock();
        } else {
            return null;
        }
    }
}
