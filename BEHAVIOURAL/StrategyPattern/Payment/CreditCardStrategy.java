public class CreditCardStrategy implements PaymentStrategy{

    public CreditCardStrategy() {
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Using Credit Card Payment to process payment of amount: " + amount);
    }
}