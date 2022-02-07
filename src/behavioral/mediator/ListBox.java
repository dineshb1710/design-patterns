package behavioral.mediator;

public class ListBox extends UiControl {

    private String selected;

    public ListBox(DialogBox dialogBox) {
        super(dialogBox);
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
        dialogBox.changed(this);
    }
}
