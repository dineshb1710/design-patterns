package behavioral.chainOfResponsibility;

/**
 * Below class represents an implementation of Chain of Responsibility Design Pattern.
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        // Create a Chain of Handlers..
        Encryption encryption = new Encryption(null);
        Logging logging = new Logging(null);
        Authentication authentication = new Authentication(logging);

        // Sent a request to the server for processing..
        var server = new WebServer(authentication);
        server.handleRequest(new UserRequest("root", "admin", "ADMIN"));
    }
}
