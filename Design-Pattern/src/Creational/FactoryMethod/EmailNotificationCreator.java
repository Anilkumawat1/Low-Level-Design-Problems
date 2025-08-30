package Creational.FactoryMethod;

public class EmailNotificationCreator extends NotificationCreator{
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
