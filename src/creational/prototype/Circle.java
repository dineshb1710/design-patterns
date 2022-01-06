package creational.prototype;

public class Circle implements Component {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void render() {
        System.out.println("Circle drawn with radius " + radius);
    }

    @Override
    public Component clone() {
        return new Circle(radius);
    }
}
