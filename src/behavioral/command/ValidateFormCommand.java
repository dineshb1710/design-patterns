package behavioral.command;

public class ValidateFormCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Form Validation Successful !!");
    }
}
