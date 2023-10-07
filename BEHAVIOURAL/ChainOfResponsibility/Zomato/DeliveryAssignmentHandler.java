public class DeliveryAssignmentHandler extends OrderHandler{
    public DeliveryAssignmentHandler(OrderHandler nextHandler){
        super(nextHandler);
    }

    @Override
    public void processOrder(String order){
        System.out.println("Assigning Delivery Partner for your order: " + order);

        if( nextHandler != null ){
            nextHandler.processOrder(order);
        }
    }
} 