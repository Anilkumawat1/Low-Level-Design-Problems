package Creational.FactoryMethod;

abstract class NotificationCreator {
    abstract Notification createNotification();
    public void send(){
        Notification notification = createNotification();
        notification.send();
    }
}
