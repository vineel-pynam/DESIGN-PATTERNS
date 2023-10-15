public abstract class Piece{
    private String name;
    private PieceStatus pieceStatus;
    private PieceType pieceType;

    public Piece(String name, PieceType pieceType){
        this.name = name;
        this.pieceType = pieceType;
        this.pieceStatus = pieceStatus.ALIVE;
    }

    public String getName(){
        return this.name;
    }

    public PieceType getPieceType(){
        return this.pieceType;
    }
    
    public abstract boolean canMove(Board board, Spot startingSpot, Spot endingSpot);
}