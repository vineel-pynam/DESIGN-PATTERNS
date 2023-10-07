public class DebitCardStrategy implements PaymentStrategy{

    public DebitCardStrategy() {
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Using Debit Card Payment to process payment of amount: " + amount);
    }
}