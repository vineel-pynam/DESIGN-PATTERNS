public class ExternalRequestProcessor{
    private ElevatorSelectionStrategy elevatorSelectionStrategy;
    private ElevatorManager elevatorManager;

    public ExternalRequestProcessor(){
        elevatorSelectionStrategy = new OddEvenStrategy();
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy){
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public void processExternalRequest(ExternalRequest externalRequest){
        int elevatorId = elevatorSelectionStrategy.selectElevator(externalRequest);
        elevatorManager = elevatorManager.getInstance();
        Elevator elevator = elevatorManager.getElevator(elevatorId);
        elevator.moveToFloor(externalRequest.getFloorNum()); 
    }
}