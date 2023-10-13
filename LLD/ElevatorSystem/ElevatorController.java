public class ElevatorController{
    private ElevatorContolStrategy elevatorContolStrategy;

    public ElevatorController(){
        elevatorContolStrategy = new LookUpStrategy();
    }

    public void moveElevatorToFloor(int floorNum){
        elevatorContolStrategy.move(floorNum);
    }
}