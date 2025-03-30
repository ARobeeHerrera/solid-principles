package Classes;

import Interface.NotificationInterface;

public class Email implements NotificationInterface {
    @Override
    public void sendNotification(Order order) {
        System.out.println("Notification sent to " + order.getEmail());
    }
}
