import java.util.*;
import vehicle.*;
import vehicle_inventory.*;


public class Store{
    private Integer id;
    private VehicleInventory vehicleInventory;
    private VehicleInventoryManager vehicleInventoryManager;

    public Store(Integer id, List<Vehicle> bikes, List<Vehicle> cars){
        this.id = id;
        vehicleInventoryManager = new VehicleInventoryManager();
        addVechiles(bikes, cars);
    }

    private VehicleInventory getVehicleInventory(VehicleType vehicleType){
        return vehicleInventoryManager.getInventory(vehicleType);
    }


    private void addVechiles(List<Vehicle> bikes, List<Vehicle> cars){
        VehicleInventory bikeInventory = getVehicleInventory(VehicleType.BIKE);
        bikeInventory.setVehicles(bikes);

        VehicleInventory carInventory = getVehicleInventory(VehicleType.CAR);
        carInventory.setVehicles(cars);

        System.out.print("STORED");
    }
}