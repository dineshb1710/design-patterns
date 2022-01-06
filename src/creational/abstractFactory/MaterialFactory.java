package creational.abstractFactory;

public class MaterialFactory implements WidgetFactory {

    @Override
    public Button getButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox getTextBox() {
        return new MaterialTextBox();
    }
}
