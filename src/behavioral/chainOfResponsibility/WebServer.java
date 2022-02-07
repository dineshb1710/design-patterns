package behavioral.chainOfResponsibility;

public class WebServer {

    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest(UserRequest userRequest) {
        handler.handle(userRequest);
    }
}
