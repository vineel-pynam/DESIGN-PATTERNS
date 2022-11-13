package ticket_store;

import java.time.*;
import parking_spot_manager.ParkingSpot;

public class Ticket{
    private LocalDateTime entryTime;   
    private int parkingSpotId;
    private int vehicleNumber;
    private int price;

    public Ticket(ParkingSpot parkingSpot){
        this.entryTime = LocalDateTime.now();
        this.parkingSpotId = parkingSpot.getId();
        this.price = parkingSpot.getPrice();
        this.vehicleNumber = parkingSpot.getVehicle().getVehicleNumber();
    }

    public int getParkingSpotId(){
        return this.parkingSpotId;
    }

    public LocalDateTime getEntryTime(){
        return this.entryTime;
    }

    public int getVehicleNumber(){
        return this.vehicleNumber;
    }

    public int getPrice(){
        return this.price;
    }
}