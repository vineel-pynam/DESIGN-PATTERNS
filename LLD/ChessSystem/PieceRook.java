public class PieceRook extends Piece{

    public PieceRook(PieceType pieceType){
        super("Rook", pieceType);
    }

    public boolean canMove(Board board, Spot startingSpot, Spot endingSpot){
        return true;
    }
}