package Structural.Adapter;

public class OldPaymentProcessor {
    public void makePayment(int amount){
        System.out.println("Paid " + amount + " paise using Old Payment Gateway");
    }
}
