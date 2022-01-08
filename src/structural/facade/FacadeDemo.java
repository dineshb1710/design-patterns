package structural.facade;

public class FacadeDemo {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.send("Hello World", "Yullia Chumak (Luxoft)");
    }
}
