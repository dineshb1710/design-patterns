package creational.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        AbstractFactory<Animal> animalFactory = FactoryProvider.create("Animal");
        Animal animal = animalFactory.create("Dog");
        System.out.println("Animal -> " + animal.getType());
        System.out.println("Animal (Sound) -> " + animal.makeSound());

        AbstractFactory<Bird> birdFactory = FactoryProvider.create("Bird");
        Bird bird = birdFactory.create("Peacock");
        System.out.println("Bird -> " + bird.getType());
        System.out.println("Bird (Sound) -> " + bird.makeSound());
    }
}
