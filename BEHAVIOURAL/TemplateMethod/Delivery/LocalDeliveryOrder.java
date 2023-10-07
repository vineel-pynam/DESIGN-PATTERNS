public class LocalDeliveryOrder extends DeliveryTemplate{
    @Override
    public void verifyOrder(){
        System.out.println("Verifying your Local Order...!");
    }

    @Override
    public void assignDeliveryAgent(){
        System.out.println("Assigning Delivery Agent for your Local order...!");
    }

    @Override
    public void trackNDelivery(){
        System.out.println("You can now track your Local delivery order...!");
    }
}