package behavioral.state;

public class TextBox implements UiControl {

    @Override
    public void select() {
        System.out.println("TextBox Selected !!");
    }

    @Override
    public void draw() {
        System.out.println("TextBox is drawn on the Canvas.");
    }
}
