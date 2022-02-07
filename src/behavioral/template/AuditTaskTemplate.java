package behavioral.template;

public abstract class AuditTaskTemplate {

    private AuditTrail auditTrail;

    public AuditTaskTemplate() {
        this.auditTrail = new AuditTrail();
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
