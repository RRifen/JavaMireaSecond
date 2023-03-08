package Prac7.Decorator;

public class SoundNotificationDecorator extends BaseNotificationDecorator {

    public SoundNotificationDecorator(Notification notification) {
        super(notification);
    }

    public void sendMessage() {
        super.sendMessage();
        System.out.println("This is a sound notification");
    }
}
