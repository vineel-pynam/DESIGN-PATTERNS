public class Main{
    public static void main(String args[]){
        OrderHandler orderHandler = new OrderValidationHandler(
                                    new PaymentHandler(
                                        new OrderPreparationHandler(
                                            new DeliveryAssignmentHandler(
                                                new TrackingOrderHandler(null)))));
        orderHandler.processOrder("Chicken Biriyani");

    }
}