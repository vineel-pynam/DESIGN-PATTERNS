public class PiecePawn extends Piece{

    public PiecePawn(PieceType pieceType){
        super("Pawn", pieceType);
    }

    public boolean canMove(Board board, Spot startingSpot, Spot endingSpot){
        return true;
    }
}