public class RideRequestCommand implements Command{
    private RideService rideService;
    private String name;
    private String from;
    private String to;

    public RideRequestCommand(RideService rideService, String name, String from, String to){
        this.rideService = rideService;
        this.name = name;
        this.from = from;
        this.to = to;
    }

    @Override
    public void execute(){
        rideService.rideRequest(name, from, to);
    }
}