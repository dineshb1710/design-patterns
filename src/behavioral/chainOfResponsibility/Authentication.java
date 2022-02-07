package behavioral.chainOfResponsibility;

public class Authentication extends Handler {

    protected Authentication(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(UserRequest userRequest) {
        var result = userRequest.getUsername().equalsIgnoreCase("root")
                && userRequest.getPassword().equalsIgnoreCase("admin")
                && userRequest.getRole().equalsIgnoreCase("ADMIN");
        if (result) {
            System.out.println("Authentication Successful !!");
        } else {
            System.out.println("Invalid Credentials !!");
        }

        return !result;
    }
}
