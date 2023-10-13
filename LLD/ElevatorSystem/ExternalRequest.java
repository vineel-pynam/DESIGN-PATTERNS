public class ExternalRequest{
    private Direction direction;
    private int floorNum;

    public ExternalRequest( Direction direction, int floorNum){
        this.direction = direction;
        this.floorNum = floorNum;
    }

    public int getFloorNum(){
        return this.floorNum;
    }

    public Direction getDirection(){
        return direction;
    }
}