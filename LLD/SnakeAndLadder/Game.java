import java.util.*;

public class Game{
    private Board board;
    private Dice dice;
    private Deque<Player> playersList = new LinkedList<>();
    private Player winner;
    private Integer endPosition;


    public Game(Integer boardSize, Integer noOfSnakes, Integer noOfLadders){
        this.endPosition = boardSize*boardSize-1;
        initializeGame(boardSize, noOfSnakes, noOfLadders);
    }

    private void initializeGame(Integer boardSize, Integer noOfSnakes, Integer noOfLadders){
        board = new Board(boardSize, noOfSnakes, noOfLadders);
        dice = new Dice(1);
        addPlayers();
    }

    private void addPlayers(){
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);

        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame(){

        while( winner == null ){
            Player playerTurn = findPlayerTurn();
            System.out.println("Player id: " + playerTurn.id + " and CurrentPosition: " + playerTurn.currentPosition);

            Integer steps = dice.rollDice();

            int newPosition = playerTurn.currentPosition + steps;
            int playerNewPosition = jumpCheck(newPosition);
            playerTurn.currentPosition = playerNewPosition;
            System.out.println("Player id: " + playerTurn.id + " and CurrentPosition: " + playerTurn.currentPosition);

            if( playerTurn.currentPosition >= endPosition ){
                winner = playerTurn;
            }
        }

        System.out.println("Winner: " + winner.id );
    }

    private Player findPlayerTurn(){
        Player nextPlayer = playersList.removeFirst();
        playersList.add(nextPlayer);
        return nextPlayer;
    }

    private Integer jumpCheck(Integer position){

        if( position > endPosition ) return position;

        Cell cell = board.getCell(position);
        if( cell.jump != null && cell.jump.start == position ){
            String jumpBy = (cell.jump.start > cell.jump.end) ? "Snake" : "Ladder";
            System.out.println("Jump Taken by " + jumpBy);
            return cell.jump.end;
        }

        return position;
    }



}