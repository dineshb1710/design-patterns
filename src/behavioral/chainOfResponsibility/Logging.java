package behavioral.chainOfResponsibility;

public class Logging extends Handler {

    public Logging(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(UserRequest userRequest) {
        System.out.println("Logging -> " + userRequest.toString());
        return false;
    }
}
