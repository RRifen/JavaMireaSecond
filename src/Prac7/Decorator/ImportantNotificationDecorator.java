package Prac7.Decorator;

public class ImportantNotificationDecorator extends BaseNotificationDecorator {
    public ImportantNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("This is an important notification");
    }
}
