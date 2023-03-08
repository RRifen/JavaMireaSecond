package Prac7.Decorator;

public class EmailNotificationDecorator extends BaseNotificationDecorator {

    public EmailNotificationDecorator(Notification notification) {
        super(notification);
    }

    public void sendMessage() {
        super.sendMessage();
        System.out.println("This is a email notification");
    }
}
