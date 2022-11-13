
import parking_spot_manager.*;
import vehicle.*;

public class ExitGate{

    private ParkingSpotManager psm;
    private Vehicle vehicle;

    public ExitGate(){};

    public void exitVehicle(int vehicleNumber, VehicleType vehicleType){
        psm = ParkingSpotManagerFactory.getParkingSpotManager(vehicleType);
        psm.removeVehicle(vehicleNumber);
    }
}