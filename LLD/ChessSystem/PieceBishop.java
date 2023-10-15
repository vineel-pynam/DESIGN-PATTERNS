public class PieceBishop extends Piece{

    public PieceBishop(PieceType pieceType){
        super("Bishop", pieceType);
    }

    public boolean canMove(Board board, Spot startingSpot, Spot endingSpot){
        return true;
    }
}