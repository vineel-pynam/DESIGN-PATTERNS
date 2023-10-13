import java.util.*;

public class ElevatorManager{
    private Map<Integer, Elevator> elevatorsMap = new HashMap<Integer, Elevator>();

    private static ElevatorManager instance = null;

    private ElevatorManager(){}

    public static ElevatorManager getInstance(){
        if( instance == null ){
            instance = new ElevatorManager();
        }

        return instance;
    }

    public void initializeElevators(int noOfElevators){
        for( int i=1; i<=noOfElevators; i++ ){
            elevatorsMap.put(i, new Elevator(i));
        }
    }

    public Elevator getElevator(int elevatorId){
        return elevatorsMap.get(elevatorId);
    }

}