public class InternalRequest{
    private int currentElevatorId;
    private int floorNum;
    
    public InternalRequest(int currentElevatorId, int floorNum) {
        this.currentElevatorId = currentElevatorId;
        this.floorNum = floorNum;
    }

    public int getFloorNum() {
        return this.floorNum;
    }

    public int getCurrentElevatorId(){
        return this.currentElevatorId;
    }
    
}