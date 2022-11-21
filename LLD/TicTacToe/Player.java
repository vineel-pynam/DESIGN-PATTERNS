import playing_piece.*;

public class Player{
    private PlayingPiece playingPiece;
    private String name;

    public Player(String name, PlayingPiece playingPiece){
        this.playingPiece = playingPiece;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public PlayingPiece getPlayingPiece(){
        return this.playingPiece;
    }
}