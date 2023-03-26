package vehicle;

public class Bike extends Vehicle{
    public Bike(String companyName, String modelName, Integer vehicleNumber, 
        Status status, Integer noOfSeats, Integer cc, Integer dailyRentalCost, 
        Integer hourlyRentalCost
    ){
        super(companyName, modelName, vehicleNumber, status, noOfSeats, cc, dailyRentalCost, hourlyRentalCost);
    }
}