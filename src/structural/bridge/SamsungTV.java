package structural.bridge;

public class SamsungTV implements Device {
    @Override
    public void on() {
        System.out.println("Samsung TV : On");
    }

    @Override
    public void off() {
        System.out.println("Samsung TV : Off");
    }

    @Override
    public void setChannel() {
        System.out.println("Samsung TV : Set Channel");
    }
}
