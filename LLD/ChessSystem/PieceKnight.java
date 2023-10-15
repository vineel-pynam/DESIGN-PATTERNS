public class PieceKnight extends Piece{

    public PieceKnight(PieceType pieceType){
        super("Knight", pieceType);
    }

    public boolean canMove(Board board, Spot startingSpot, Spot endingSpot){
        return true;
    }
}