package vehicle;

public class Vehicle{
    private String companyName;
    private String modelName;
    private Integer vehicleNumber; 
  
    private Status status;
    private Integer noOfSeats;
    private Integer cc;

    private Integer dailyRentalCost;
    private Integer hourlyRentalCost;


    public Vehicle(
        String companyName, String modelName, Integer vehicleNumber, 
        Status status, Integer noOfSeats, Integer cc, Integer dailyRentalCost, 
        Integer hourlyRentalCost
    ) {
        this.companyName = companyName;
        this.modelName = modelName;
        this.vehicleNumber = vehicleNumber;
        this.status = status;
        this.noOfSeats = noOfSeats;
        this.cc = cc;
        this.dailyRentalCost = dailyRentalCost;
        this.hourlyRentalCost = hourlyRentalCost;
    }


    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleNumber(Integer vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getNoOfSeats() {
        return this.noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Integer getCc() {
        return this.cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getDailyRentalCost() {
        return this.dailyRentalCost;
    }

    public void setDailyRentalCost(Integer dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public Integer getHourlyRentalCost() {
        return this.hourlyRentalCost;
    }

    public void setHourlyRentalCost(Integer hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }


}