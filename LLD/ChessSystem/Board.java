import java.util.*;

public class Board{
    private Spot[][] board = new Spot[8][8];
    private PieceType pieceType;

     public Board(){
        for( int row=0; row<8; row++ ){
            for( int col=0; col<8; col++ ){
                board[row][col] = new Spot(row, col, null);
            }
        }
        this.initialize();
    }

    public void initialize(){

        for( int col=0; col<8; col++ ){
            board[1][col] = new Spot(1, col, new PiecePawn(PieceType.BLACK));
            board[6][col] = new Spot(6, col, new PiecePawn(PieceType.WHITE));
        }

        board[0][0] = new Spot(0, 0, new PieceRook(PieceType.BLACK));
        board[0][1] = new Spot(0, 1, new PieceKnight(PieceType.BLACK));
        board[0][2] = new Spot(0, 2, new PieceBishop(PieceType.BLACK));
        board[0][3] = new Spot(0, 3, new PieceKing(PieceType.BLACK));
        board[0][4] = new Spot(0, 4, new PieceQueen(PieceType.BLACK));
        board[0][5] = new Spot(0, 5, new PieceBishop(PieceType.BLACK));
        board[0][6] = new Spot(0, 6, new PieceKnight(PieceType.BLACK));
        board[0][7] = new Spot(0, 7, new PieceRook(PieceType.BLACK));

        board[7][0] = new Spot(7, 0, new PieceRook(PieceType.WHITE));
        board[7][1] = new Spot(7, 1, new PieceKnight(PieceType.WHITE));
        board[7][2] = new Spot(7, 2, new PieceBishop(PieceType.WHITE));
        board[7][3] = new Spot(7, 3, new PieceQueen(PieceType.WHITE));
        board[7][4] = new Spot(7, 4, new PieceKing(PieceType.WHITE));
        board[7][5] = new Spot(7, 5, new PieceBishop(PieceType.WHITE));
        board[7][6] = new Spot(7, 6, new PieceKnight(PieceType.WHITE));
        board[7][7] = new Spot(7, 7, new PieceRook(PieceType.WHITE));
    }


    public void displayBoard(){
        
        System.out.printf("%12s", "");
        for( char ch = 'a'; ch <= 'h'; ch++ ){
            System.out.printf("%12s", ch);
        }

        System.out.println();

        for( int row=0; row<8; row++ ){
            System.out.printf("%12d", 8-row);
            for( int col=0; col<8; col++ ){
                Spot spot = board[row][col];
                Piece piece = spot.getPiece();

                if( piece == null ){
                    System.out.printf("%12s", ".");
                    continue;
                }

                String pieceColor = "White";
                if( piece.getPieceType() == pieceType.BLACK ){
                    pieceColor = "Black";
                }
                String pieceName = pieceColor + piece.getName();
                System.out.printf("%12s", pieceName);

            }
            System.out.printf("%12d\n", 8-row);
        }

        System.out.printf("%12s", "");
        for( char ch = 'a'; ch <= 'h'; ch++ ){
            System.out.printf("%12s", ch);
        }

        System.out.println();
    }

    public Spot getSpot(int row, int col){
        if( row < 0 || row >= 8 || col < 0 || col >= 8 ){
            System.out.println("Error: Index out of bounds");
            return null;
        }

        return board[row][col];
    }
}