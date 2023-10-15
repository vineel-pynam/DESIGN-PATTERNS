public class PieceKing extends Piece{

    public PieceKing(PieceType pieceType){
        super("King", pieceType);
    }

    public boolean canMove(Board board, Spot startingSpot, Spot endingSpot){
        return true;
    }
}