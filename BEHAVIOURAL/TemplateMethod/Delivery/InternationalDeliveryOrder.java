public class InternationalDeliveryOrder extends DeliveryTemplate{
    @Override
    public void verifyOrder(){
        System.out.println("Verifying your International Order...!");
    }

    @Override
    public void assignDeliveryAgent(){
        System.out.println("Assigning Delivery Agent for your International order...!");
    }

    @Override
    public void trackNDelivery(){
        System.out.println("You can now track your International delivery order...!");
    }
}