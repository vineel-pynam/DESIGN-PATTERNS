public abstract class DeliveryTemplate{
    public void processDelivery(){
        verifyOrder();
        assignDeliveryAgent();
        trackNDelivery();
    }

    public abstract void verifyOrder();
    public abstract void assignDeliveryAgent();
    public abstract void trackNDelivery();
}