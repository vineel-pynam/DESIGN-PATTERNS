public class UpiStrategy implements PaymentStrategy{

    public UpiStrategy() {
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Using UPI Payment to process payment of amount: " + amount);
    }
}