public class Elevator{
    private int elevatorId;
    private ElevatorController elevatorController;

    public Elevator(int elevatorId){
        elevatorController = new ElevatorController();
        this.elevatorId = elevatorId;
    }

    public int getElevatorId(){
        return this.elevatorId;
    }

    public void moveToFloor(int floorNum){
        elevatorController.moveElevatorToFloor(floorNum);
    }
}