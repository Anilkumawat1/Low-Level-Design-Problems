package Creational.FactoryMethod;

public class SmsNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending sms...........");
    }
}
