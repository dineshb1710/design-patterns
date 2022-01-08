package structural.bridge;

public class SonyTV implements Device {

    @Override
    public void on() {
        System.out.println("Sony TV : On");
    }

    @Override
    public void off() {
        System.out.println("Sony TV : On");
    }

    @Override
    public void setChannel() {
        System.out.println("Sony TV : SetChannel");
    }
}
