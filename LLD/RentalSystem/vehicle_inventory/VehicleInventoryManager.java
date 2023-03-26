package vehicle_inventory;
import java.util.*;

public class VehicleInventoryManager{

    private HashMap<VehicleType, VehicleInventory> factory = new HashMap<VehicleType, VehicleInventory>();

    public VehicleInventoryManager(){};

    public VehicleInventory getInventory(VehicleType vehicleType){

        VehicleInventory vehiceInventory = null;

        if( factory.get(vehicleType) != null ){
            return factory.get(vehicleType);
        }else{

            switch( vehicleType ){
                case CAR:
                    vehiceInventory = new CarInventory();
                    break;
                case BIKE:
                    vehiceInventory = new BikeInventory();
                    break;
            }

            factory.put(vehicleType, vehiceInventory);
            return vehiceInventory;
        }

    }


}