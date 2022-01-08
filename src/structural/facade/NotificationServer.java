package structural.facade;

public class NotificationServer {
    // connect -> Connect
    // authenticate(appId, key) -> AuthToken
    // send(authToken, message, target)
    // conn.disconnect();

    public Connection connect(String serverIpAddress) {
        return new Connection(serverIpAddress);
    }

    public AuthToken authenticate(Connection connection, String appId, String key) {
        return new AuthToken();
    }

    public void send(String authToken, String message, String target) {
        System.out.println("Message sent to " + target);
    }
}
