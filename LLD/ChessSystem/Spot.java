public class Spot{
    private int row;
    private int col;
    private Piece piece;

    public Spot(int row, int col, Piece piece){
        this.row = row;
        this.col = col;
        this.piece = piece;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }

     public int getRow(){
        return this.row;
    }

     public int getCol(){
        return this.col;
    }

     public Piece getPiece(){
        return this.piece;
    }

}