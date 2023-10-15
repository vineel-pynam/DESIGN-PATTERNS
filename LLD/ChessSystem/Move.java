public class Move{
    private Spot startSpot;
    private Spot endSpot;
    private Piece pieceKilled;
    private Piece pieceMoved;
    private Player player;

    public Move(Player player, Spot startSpot, Spot endSpot, Piece pieceMoved){
        this.startSpot = startSpot;
        this.endSpot = endSpot;
        this.pieceKilled = null;
        this.pieceMoved = pieceMoved;
        this.player = player;
    }

    public Spot getStartSpot(){
        return this.startSpot;
    }

    public Spot getEndSpot(){
        return this.endSpot;
    }

    public Piece getPieceMoved(){
        return this.pieceMoved;
    }

    public Piece getPieceKilled(){
        return this.pieceKilled;
    }

    public Player getPlayer(){
        return this.player;
    }

}