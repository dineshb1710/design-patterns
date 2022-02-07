package behavioral.command;

/**
 * Below class represents an implementation of Command Pattern.
 */
public class CommandDemo {

    public static void main(String[] args) {

        // A button added onto the Add Customer Form..
        UiFrameworkButton addCustomerBtn = new UiFrameworkButton("Add Customer");

        // Another button on the same form to validate the form data.
        UiFrameworkButton validateBtn = new UiFrameworkButton("Validate");

        validateBtn.click(new ValidateFormCommand());
        addCustomerBtn.click(new AddCustomerCommand(new CustomerService()));
    }
}
