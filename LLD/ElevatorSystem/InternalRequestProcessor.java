public class InternalRequestProcessor{
    private ElevatorManager elevatorManager;
    public void processInternalRequest(InternalRequest internalRequest){
        
        elevatorManager = elevatorManager.getInstance();
        Elevator elevator = elevatorManager.getElevator(internalRequest.getCurrentElevatorId());
        elevator.moveToFloor(internalRequest.getFloorNum());
    }
}