public class TrackingOrderHandler extends OrderHandler{
    public TrackingOrderHandler(OrderHandler nextHandler){
        super(nextHandler);
    }

    @Override
    public void processOrder(String order){
        System.out.println("Tracking your Order: " + order);

        if( nextHandler != null ){
            nextHandler.processOrder(order);
        }
    }
} 