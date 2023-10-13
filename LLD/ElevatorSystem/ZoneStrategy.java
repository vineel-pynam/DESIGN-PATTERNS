public class ZoneStrategy implements ElevatorSelectionStrategy{
    public int selectElevator(ExternalRequest externalRequest){
        System.out.println("Applying Zone Strategy to select elevator....Selected Elevator: " + 3 );
        return 3;
    }
}