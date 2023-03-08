package Prac7.Decorator;

public class BaseNotificationDecorator implements Notification {

    private Notification notification;

    public BaseNotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendMessage() {
        notification.sendMessage();
    }
}
