package creational.abstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        new FormComponent().render(new AntFactory());
    }
}
