package behavioral.command;

public class UiFrameworkButton {
    private String label;

    public UiFrameworkButton(String label) {
        this.label = label;
    }

    public void click(Command command) {
        // User Specific implementation..
        command.execute();
    }
}
