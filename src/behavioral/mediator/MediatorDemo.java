package behavioral.mediator;

/**
 * Below class represents an implementation of Mediator Pattern.
 */
public class MediatorDemo {

    public static void main(String[] args) {

        var dialogBox = new DummyDialogBox();

        var textBox = new TextBox(dialogBox);
        var button = new Button(dialogBox);
        var listBox = new ListBox(dialogBox);

        dialogBox.setButton(button);
        dialogBox.setListBox(listBox);
        dialogBox.setTextBox(textBox);

        listBox.setSelected("Article 1");
        System.out.println("ListBox -> " + listBox.getSelected());
        System.out.println("TextBox -> " + textBox.getContent());
        System.out.println("Button [Enabled] -> " + button.isEnabled());

    }
}
