public class Main{
    public static void main(String args[]){
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy("Upi");
        paymentProcessor.processPayment(100);
    }
}