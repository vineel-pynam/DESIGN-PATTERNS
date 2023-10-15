public class Player{
    private String name;
    private boolean isHumanPlayer;
    private PieceType pieceType;    

    public Player(String name, PieceType pieceType){
        this.name = name;
        this.pieceType = pieceType;
        this.isHumanPlayer = true;
    }    

    public boolean getIsHumanPlayer(){
        return this.isHumanPlayer;
    }

    public String getName(){
        return this.name;
    }

    public PieceType getPieceType(){
        return this.pieceType;
    }
}