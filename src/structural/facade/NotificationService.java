package structural.facade;

/**
 * Facade Pattern.
 */
public class NotificationService {

    public void send(String message, String target) {
        NotificationServer notificationServer = new NotificationServer();
        Connection connection = notificationServer.connect("10.404.2.19");
        AuthToken authToken = notificationServer.authenticate(connection, "AppId", "key");
        notificationServer.send(authToken.getAuthToken(), message, target);
        connection.disconnect();
    }
}
