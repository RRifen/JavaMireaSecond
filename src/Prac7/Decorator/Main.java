package Prac7.Decorator;

public class Main {
    public static void main(String[] args) {
        Notification notification = new BaseNotificationDecorator(new SimpleNotification());

        notification = new EmailNotificationDecorator(notification);
        notification = new SoundNotificationDecorator(notification);
        notification = new ImportantNotificationDecorator(notification);
        notification = new EmailNotificationDecorator(notification);

        notification.sendMessage();
    }
}
