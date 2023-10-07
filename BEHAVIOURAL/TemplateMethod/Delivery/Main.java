public class Main{
    public static void main(String args[]){
        DeliveryTemplate localTemplate = new LocalDeliveryOrder();
        DeliveryTemplate internationalTemplate = new InternationalDeliveryOrder();

        System.out.println("---- FOR Local Order ----------");
        localTemplate.processDelivery();

        System.out.println();

        System.out.println("---- FOR International Order ----------");
        internationalTemplate.processDelivery();

    }
}