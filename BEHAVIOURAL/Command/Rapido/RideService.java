public class RideService{
    public void rideRequest(String passengerName, String from, String to){
        System.out.println("There is a Ride Request from Passenger: " + passengerName + ", from " + from + " to " + to );
    }

    public void cancelRide(String passengerName){
        System.out.println("There is a Cancel Ride Request from Passenger: " + passengerName);
    }
}