package behavioral.mediator;

public class DummyDialogBox extends DialogBox {

    private TextBox textBox;
    private ListBox listBox;
    private Button button;

    public TextBox getTextBox() {
        return textBox;
    }

    public void setTextBox(TextBox textBox) {
        this.textBox = textBox;
    }

    public ListBox getListBox() {
        return listBox;
    }

    public void setListBox(ListBox listBox) {
        this.listBox = listBox;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    @Override
    public void changed(UiControl control) {

        if (control == textBox) {
            textBoxModified(control);
        }

        if (control == listBox) {
            ItemSelected(control);
        }
    }

    private void textBoxModified(UiControl control) {
        if (control == textBox) {
            var content = textBox.getContent();
            if (content.isEmpty()) {
                button.setEnabled(false);
            }
        }
    }

    private void ItemSelected(UiControl control) {
        if (control == listBox) {
            var selected = listBox.getSelected();
            textBox.setContent(selected);
            button.setEnabled(true);
        }
    }
}
