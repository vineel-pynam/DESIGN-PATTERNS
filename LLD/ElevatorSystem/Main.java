public class Main{
    public static void main(String args[]){
        ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();
        elevatorSystem.initialize(12, 5);

        elevatorSystem.processInternalRequest(4,8);
        System.out.println("----------------------------------------------------------------");
        elevatorSystem.processExternalRequest(Direction.UP, 7);
        System.out.println("----------------------------------------------------------------");


        elevatorSystem.setElevatorSelectionStrategy(new ZoneStrategy());
        elevatorSystem.processInternalRequest(4, 9);
        System.out.println("----------------------------------------------------------------");
        elevatorSystem.processExternalRequest(Direction.UP, 5);
        System.out.println("----------------------------------------------------------------");
    }
}