package behavioral.state;

/**
 * Below class represents an implementation of a State Design Pattern.
 */
public class StateDemo {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setUiControl(new Button());
        canvas.draw();
    }
}
