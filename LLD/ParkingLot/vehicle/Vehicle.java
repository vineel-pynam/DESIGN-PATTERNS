package vehicle;
public class Vehicle{
    private int vehicleNumber;
    private VehicleType vehicleType;

    public Vehicle(int number, VehicleType vehicleType){
        this.vehicleNumber = number;
        this.vehicleType = vehicleType;
    }

    public void setVehicleNumber(int vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleNumber(){
        return this.vehicleNumber;
    } 
    
    public VehicleType getVehicleType(){
        return this.vehicleType;
    }
}