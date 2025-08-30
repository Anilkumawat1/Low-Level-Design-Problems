package Creational.FactoryMethod;

public class SmsNotificationCreator extends NotificationCreator{
    @Override
    Notification createNotification() {
        return new SmsNotification();
    }
}
