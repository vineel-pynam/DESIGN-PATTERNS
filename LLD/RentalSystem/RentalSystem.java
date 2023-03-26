import vehicle_inventory.*;
import vehicle.*;
import java.util.*;

public class RentalSystem{
    HashMap<Integer, Store> stores = new HashMap<>();

    public RentalSystem(){
        addStores();
    }

    public void addStores(){
        List<Vehicle> bikes = new ArrayList<>();
        Vehicle ktm = new Bike("KTM", "XZ-90", 1, Status.ACTIVE, 2, 220, 600, 60); 
        Vehicle pulsar = new Bike("Pulsar", "K20", 2, Status.ACTIVE, 2, 180, 500, 50); 
        bikes.add(ktm);
        bikes.add(pulsar);

        List<Vehicle> cars = new ArrayList<>();
        Vehicle volvo = new Car("Volvo", "PW-2", 1, Status.ACTIVE, 5, 1500, 4000, 400); 
        Vehicle skoda = new Car("skoda", "LL-20", 2, Status.ACTIVE, 5, 1000, 5000, 500); 
        cars.add(ktm);
        cars.add(pulsar);
        
        stores.put(1, new Store(1, bikes, cars));
        
    }
}