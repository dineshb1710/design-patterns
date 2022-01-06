package creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

        Circle circle_01 = new Circle(5);
        Circle circle_02 = (Circle) circle_01.clone();

        circle_01.render();
        circle_02.render();
    }
}
