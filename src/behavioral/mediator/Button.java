package behavioral.mediator;

public class Button extends UiControl {

    private boolean isEnabled;

    public Button(DialogBox dialogBox) {
        super(dialogBox);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
