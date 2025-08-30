package Creational.FactoryMethod;

public class FactoryMethod {
    public static void main(String args[]){
        NotificationCreator creator = new EmailNotificationCreator();
        creator.send();
    }
}
//https://blog.algomaster.io/p/32c487c2-ce5b-4c26-8a57-89997912e97e

