package ticket_store;

import java.util.*;
import parking_spot_manager.*;

public class TicketStore{
    private HashMap<Integer, Ticket> tickets;

    public TicketStore(){
        this.tickets = new HashMap<>();
    }

    public void generateTicket(ParkingSpot parkingSpot){
        Ticket ticket = new Ticket(parkingSpot);
        int vehicleNumber = parkingSpot.getVehicle().getVehicleNumber();
        tickets.put(vehicleNumber, ticket);
        printTicket(ticket);
    }

    private void printTicket(Ticket ticket){
        System.out.println("Ticket: ");
        System.out.println("-- ParkingSpot Number: " + ticket.getParkingSpotId());
        System.out.println("-- Entry Time: " + ticket.getEntryTime());
        System.out.println("-- Price: " + ticket.getPrice());
        System.out.println("-- Vehicle Number: " + ticket.getVehicleNumber());
        System.out.println();
    }

    public void flushTicket(int vehicleNumber){
        tickets.remove(vehicleNumber);
    }
}