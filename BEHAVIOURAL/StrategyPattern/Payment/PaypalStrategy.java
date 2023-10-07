public class PaypalStrategy implements PaymentStrategy{

    public PaypalStrategy() {
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Using Paypal Payment to process payment of amount: " + amount);
    }
}