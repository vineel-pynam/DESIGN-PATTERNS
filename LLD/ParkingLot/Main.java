
import vehicle.*;

class Main{
    public static void main(String args[]){

        EntranceGate gate = new EntranceGate();
        gate.parkVehicle(new Vehicle(20231, VehicleType.TWO_WHEELER));
        gate.parkVehicle(new Vehicle(20232, VehicleType.TWO_WHEELER));
        gate.parkVehicle(new Vehicle(20233, VehicleType.TWO_WHEELER));
        gate.parkVehicle(new Vehicle(20234, VehicleType.TWO_WHEELER));

        gate.parkVehicle(new Vehicle(40231, VehicleType.FOUR_WHEELER));
        gate.parkVehicle(new Vehicle(40232, VehicleType.FOUR_WHEELER));
        gate.parkVehicle(new Vehicle(40233, VehicleType.FOUR_WHEELER));
        gate.parkVehicle(new Vehicle(40234, VehicleType.FOUR_WHEELER));

        ExitGate exitGate = new ExitGate();
        exitGate.exitVehicle(20231, VehicleType.TWO_WHEELER);
        gate.parkVehicle(new Vehicle(20234, VehicleType.TWO_WHEELER));
        gate.parkVehicle(new Vehicle(20235, VehicleType.TWO_WHEELER));
        exitGate.exitVehicle(20232, VehicleType.TWO_WHEELER);
        exitGate.exitVehicle(20233, VehicleType.TWO_WHEELER);
        gate.parkVehicle(new Vehicle(20235, VehicleType.TWO_WHEELER));



    }
}