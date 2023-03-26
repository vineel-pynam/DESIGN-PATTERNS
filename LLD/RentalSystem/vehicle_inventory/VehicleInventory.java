package vehicle_inventory;

import java.util.*;
import vehicle.*;

public class VehicleInventory{
    List<Vehicle> vechicles = new ArrayList<>();

    public VehicleInventory(){}

    public List<Vehicle> getVechicles() {
        return this.vechicles;
    }

    public void setVehicles(List<Vehicle> vehicles){
        this.vechicles = vechicles;
        System.out.println("Added");
    }
}