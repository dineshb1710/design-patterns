package structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new SamsungTV());
        remoteControl.on();
    }
}
