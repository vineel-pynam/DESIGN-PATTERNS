public class PaymentStrategyFactory{
    public static PaymentStrategy getPaymentStrategy(String condition){
        if( condition == "CreditCard" ){
            return new CreditCardStrategy();
        }else if( condition == "DebitCard" ){
            return new DebitCardStrategy();
        }else if( condition == "Paypal" ){
            return new PaypalStrategy();
        }else if( condition == "Upi" ){
            return new UpiStrategy();
        }

        return new CreditCardStrategy();

    }
}