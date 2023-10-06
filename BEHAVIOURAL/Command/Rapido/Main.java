public class Main{
    public static void main(String args[]){
        RideService rideService = new RideService();

        RideRequestCommand rideRequestCommand1 = new RideRequestCommand(rideService, "Vineel", "Madhapur", "Uppal");
        RideRequestCommand rideRequestCommand2 = new RideRequestCommand(rideService, "Sandeep", "Ameerpet", "Begumpet");

        CancelRideCommand cancelRideCommand = new CancelRideCommand(rideService, "Vineel");

        RideInvoker rideInvoker = new RideInvoker();
        rideInvoker.add(rideRequestCommand1);
        rideInvoker.add(rideRequestCommand2);
        rideInvoker.add(cancelRideCommand);

        rideInvoker.execute();
    }
}