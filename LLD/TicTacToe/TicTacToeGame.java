import playing_piece.*;
import java.util.*;

public class TicTacToeGame{
    private Board board;
    private Deque<Player> players;
    private int gameCellCount = 0;

    public TicTacToeGame(){
        initializeGame();
    }

    private void initializeGame(){
        this.players = new LinkedList<>();

        Player p1 = new Player("Vineel", new PlayingPieceX());
        Player p2 = new Player("Ravi", new PlayingPieceO());

        players.add(p1);
        players.add(p2);
        board = new Board(3);
        this.gameCellCount = 3*3;
        
    }

    public String startGame(){
        boolean nowinner = true;

        while( nowinner && this.gameCellCount > 0 ){
            Player playerTurn = players.removeFirst();

            board.printBoard();

            System.out.print("Player Name: " + playerTurn.getName() + ", Enter Row, Col : ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);

            boolean isPieceAdded = board.addPiece(row, col, playerTurn.getPlayingPiece());

            if( !isPieceAdded ){
                System.out.println("Incorrect Position! Try Again.");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            this.gameCellCount--;
            boolean winner = board.isWinner(row, col, playerTurn.getPlayingPiece());
            if( winner ){
                return playerTurn.getName();
            }
        }

        return "tie";
    }
}