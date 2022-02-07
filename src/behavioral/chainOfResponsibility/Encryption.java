package behavioral.chainOfResponsibility;

public class Encryption extends Handler {

    protected Encryption(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(UserRequest userRequest) {
        System.out.println("Encryption Done !!");
        return false;
    }
}
