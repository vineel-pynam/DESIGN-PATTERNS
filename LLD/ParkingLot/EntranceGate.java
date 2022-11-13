
import parking_spot_manager.*;
import vehicle.*;

public class EntranceGate{

    private ParkingSpotManager psm;
    private Vehicle vehicle;

    public EntranceGate(){};

    public void parkVehicle(Vehicle vehicle){
        psm = ParkingSpotManagerFactory.getParkingSpotManager(vehicle.getVehicleType());
        psm.parkVehicle(vehicle);
    }

    public void getAllParkedVehicles(){
        System.out.println("Parked Two Wheelers: ");
        psm = ParkingSpotManagerFactory.getParkingSpotManager(VehicleType.TWO_WHEELER);
        psm.getVehicles();

        System.out.println("Parked Four Wheelers: ");
        psm = ParkingSpotManagerFactory.getParkingSpotManager(VehicleType.FOUR_WHEELER);
        psm.getVehicles();
    }
}