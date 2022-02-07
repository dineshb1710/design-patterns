package behavioral.chainOfResponsibility;

public abstract class Handler {

    private Handler next;

    protected Handler(Handler next) {
        this.next = next;
    }

    public void handle(UserRequest userRequest) {

        // Handle Request..
        if (doHandle(userRequest)) {
            return;
        }

        // This will call the next handler in chain..
        if (next != null) {
            next.handle(userRequest);
        }
    }

    protected abstract boolean doHandle(UserRequest userRequest);
}
