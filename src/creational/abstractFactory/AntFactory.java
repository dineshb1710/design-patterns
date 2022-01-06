package creational.abstractFactory;

public class AntFactory implements WidgetFactory {

    @Override
    public Button getButton() {
        return new AntButton();
    }

    @Override
    public TextBox getTextBox() {
        return new AntTextBox();
    }
}
