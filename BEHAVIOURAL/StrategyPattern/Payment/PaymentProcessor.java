public class PaymentProcessor{
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor() {
        this.paymentStrategy = null;
    }

    public void setPaymentStrategy(String condition) {
        if( paymentStrategy != null ) paymentStrategy = null;
        this.paymentStrategy = PaymentStrategyFactory.getPaymentStrategy(condition);
    }

    public void processPayment(double amount){
        if( paymentStrategy != null ){
            paymentStrategy.processPayment(amount);
        }else{
            System.out.println("Payment Strategy is not set...!");
        }
    }

    public void finalize(){
        if( paymentStrategy != null ){
            paymentStrategy = null;
        }
    }
    
}