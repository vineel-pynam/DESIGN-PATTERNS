package parking_spot_manager;
import vehicle.*;

public class ParkingSpot{
    private int id;
    private Vehicle vehicle;
    private int price = 10;

    public ParkingSpot(int id, Vehicle vehicle, int price){
        this.id = id;
        this.vehicle = vehicle;
        this.price = price;
    }

    public int getId(){
        return this.id;
    }

    public int getPrice(){
        return this.price;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }
}