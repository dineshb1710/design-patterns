package structural.facade;

public class Connection {
    private String serverIpAddress;

    public Connection(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    public void disconnect() {
        System.out.println("Disconnected from the server..");
    }
}
