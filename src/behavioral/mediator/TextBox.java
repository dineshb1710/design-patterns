package behavioral.mediator;

public class TextBox extends UiControl {

    private String content;

    public TextBox(DialogBox dialogBox) {
        super(dialogBox);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        dialogBox.changed(this);
    }
}
