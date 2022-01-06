package creational.abstractFactory;

public class FormComponent {

    public void render(WidgetFactory widgetFactory) {
        widgetFactory.getButton().render();
        widgetFactory.getTextBox().render();
    }
}
