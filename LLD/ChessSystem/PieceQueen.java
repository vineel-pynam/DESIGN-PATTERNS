public class PieceQueen extends Piece{

    public PieceQueen(PieceType pieceType){
        super("Queen", pieceType);
    }

    public boolean canMove(Board board, Spot startingSpot, Spot endingSpot){
        return true;
    }
}