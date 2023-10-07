public class PaymentHandler extends OrderHandler{
    public PaymentHandler(OrderHandler nextHandler){
        super(nextHandler);
    }


    @Override
    public void processOrder(String order){
        System.out.println("Payment Processing for your order: " + order);

        if( nextHandler != null ){
            nextHandler.processOrder(order);
        }
    }
} 