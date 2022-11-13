package parking_spot_manager;

import java.util.*;
import vehicle.*;
import ticket_store.*;

public abstract class ParkingSpotManager{

    private HashMap<Integer, ParkingSpot> parkingSpotList;
    private Queue<Integer> spotsAvailable;
    private int price;
    private TicketStore ticketStore;

    public ParkingSpotManager(int size, int price){
        this.ticketStore = new TicketStore();
        this.parkingSpotList = new HashMap<Integer, ParkingSpot>();
        this.spotsAvailable = new LinkedList<>();
        this.price = price;
        for( Integer i=1; i<=size; i++ ){
            spotsAvailable.add(i);
        }
    }
   
    public boolean checkParkingSpotAvailability(){
        return spotsAvailable.size() > 0;
    }

 
    public void parkVehicle(Vehicle vehicle){
        if( checkParkingSpotAvailability() ){
            int parkingSpotId = spotsAvailable.poll();
            int vehicleNumber = vehicle.getVehicleNumber();
            parkingSpotList.put(vehicleNumber, new ParkingSpot(parkingSpotId, vehicle, price));
            ticketStore.generateTicket(parkingSpotList.get(vehicleNumber));
        }else{
            System.out.println("Parking Space is not Available for " + vehicle.getVehicleNumber() + " \n");
        }
    }

    public void removeVehicle(int vehicleNumber){
        int parkingSpotId = parkingSpotList.get(vehicleNumber).getId();
        ticketStore.flushTicket(vehicleNumber);
        parkingSpotList.remove(vehicleNumber);
        spotsAvailable.add(parkingSpotId);
        System.out.println("Vechicle: " + vehicleNumber + " is Removed from ParkingSpot \n");
    }

    public void getVehicles(){
        for(int key : parkingSpotList.keySet() ){
            ParkingSpot pp = parkingSpotList.get(key);
            System.out.println(pp.getVehicle().getVehicleNumber() + " " + pp.getId());
        } 
    }    
}