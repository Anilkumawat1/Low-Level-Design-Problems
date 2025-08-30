package Structural.Adapter;

public class PaymentAdapter implements NewPaymentProcessor{
    private OldPaymentProcessor oldPaymentProcessor;
    public PaymentAdapter(OldPaymentProcessor oldPaymentProcessor){
        this.oldPaymentProcessor = oldPaymentProcessor;
    }
    @Override
    public void pay(double amount) {
        // Convert rupees to paise
        int amountInPaise = (int) (amount * 100);
        oldPaymentProcessor.makePayment(amountInPaise);
    }
    public static void main(String[] args) {
        // We have the old gateway
        OldPaymentProcessor oldGateway = new OldPaymentProcessor();

        // Wrap it with our adapter
        NewPaymentProcessor processor = new PaymentAdapter(oldGateway);

        // Client uses the modern interface
        processor.pay(250.75);
    }
}
