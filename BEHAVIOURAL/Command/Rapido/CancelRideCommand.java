public class CancelRideCommand implements Command{
    private RideService rideService;
    private String name;

    public CancelRideCommand(RideService rideService, String name){
        this.rideService = rideService;
        this.name = name;
    }

    @Override
    public void execute(){
        rideService.cancelRide(name);
    }
} 