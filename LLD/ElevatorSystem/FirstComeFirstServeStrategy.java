public class FirstComeFirstServeStrategy implements ElevatorContolStrategy{
    public void move(int floorNum){
        System.out.println("Applying FirstComeFirstServe Algorithm  and Moving Elevator to floor Number : "+  floorNum);
    }
}