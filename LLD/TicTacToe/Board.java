import playing_piece.*;
import java.util.*;

public class Board{
    
    private Integer size;
    private PlayingPiece[][] board;

    public Board(Integer size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }


    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if( board[row][col] != null ){
            return false;
        }

        board[row][col] = playingPiece;
        return true;
    }

    public void printBoard(){
        for(Integer i=0; i<size; i++ ){
            for(Integer j=0; j<size; j++ ){
                String value = board[i][j] == null ? " - " : board[i][j].getPieceType() == PieceType.X ?  " X " : " O "; 
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public boolean isWinner(int row, int col, PlayingPiece playingPiece){
        boolean isRowMatch = true;
        boolean isColMatch = true;
        boolean isDiagnolMatch = true;
        boolean isAntiDaignolMatch = true;

        for( int i=0; i<size; i++ ){
            if( board[row][i] == null || board[row][i] != playingPiece ) isRowMatch = false;
        }

        for( int i=0; i<size; i++ ){
            if( board[i][col] == null || board[i][col] != playingPiece ) isColMatch = false;
        }

        int i=0, j=0;

        while( i<size && j<size ){
            if( board[i][j] == null || board[i][j] != playingPiece ){
                isDiagnolMatch = false;
            }
            i++;
            j++;
        }

        i=0;
        j=size-1;

        while( i<size && j>=0 ){
            if( board[i][j] == null || board[i][j] != playingPiece ){
                isAntiDaignolMatch = false;
            }
            i++;
            j--;
        }
       
        return isColMatch || isRowMatch || isAntiDaignolMatch || isDiagnolMatch;
    }
}