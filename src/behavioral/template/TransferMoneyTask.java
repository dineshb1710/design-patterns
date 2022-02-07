package behavioral.template;

/**
 * A common task performed by user of a banking application :)
 */
public class TransferMoneyTask extends AuditTaskTemplate {

    @Override
    protected void doExecute() {
        System.out.println("Transferring Money !!");
    }
}
