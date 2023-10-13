public class OddEvenStrategy implements ElevatorSelectionStrategy{
    public int selectElevator(ExternalRequest externalRequest){
        int elevatorId = 1;
        if( externalRequest.getFloorNum() % 2 == 0 ) elevatorId = 2;
        System.out.println("Applying Odd Even Strategy to select elevator....Selected Elevator: " + elevatorId );
        System.out.println("Moving elevator in Direction: "+ externalRequest.getDirection().toString());
        return elevatorId;
    }
}