package structural.bridge;

public class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void on() {
        device.on();
    }

    public void off() {
        device.off();
    }
}
