package behavioral.state;

public class Button implements UiControl {

    @Override
    public void select() {
        System.out.println("Button Selected !!");
    }

    @Override
    public void draw() {
        System.out.println("Button is drawn on the Canvas.");
    }
}
