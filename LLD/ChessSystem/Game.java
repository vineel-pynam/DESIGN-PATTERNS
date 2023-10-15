import java.util.*;

public class Game{
    private Player[] players = new Player[2];
    private Board board;
    private List<Move> gamesMoves;
    private int currentMovesIndex = 0;

    public void initialize(Player player1, Player player2){
        players[0] = player1;
        players[1] = player2;
        board = new Board();
        gamesMoves = new ArrayList<>();
        board.displayBoard();
    }

    public void startGame(){
        
        Scanner scanner = new Scanner(System.in);
        int indexFlag = 0;  

        while( true ){
            
            Player currentPlayer = players[indexFlag];

            System.out.println("CurrentPlayer: " + currentPlayer.getName());
            System.out.println(" --- Please Choose One Option --- ");
            System.out.println(" q - (Quit), u - (Undo), r - (Redo), e - (Enter Spot)");

            String input = scanner.next();

            if( input.equalsIgnoreCase("q") ){
                System.out.println("GAME OVER");
                System.out.println("----------------------------------------------");
                break;
            }else if( input.equalsIgnoreCase("u") ){
                this.undo();
                continue;
            }else if( input.equalsIgnoreCase("r") ){
                this.redo();
                continue;
            }

            // PLAYING GAME IF ENTERED E
            System.out.println("Enter Starting Spot: ");
            String startingSpot = scanner.next();
            System.out.println("Enter Ending Spot: ");
            String endingSpot = scanner.next();

            this.processMove(currentPlayer, startingSpot, endingSpot);
            
            indexFlag = indexFlag == 0 ? 1 : 0;
        }


    }

    public void displayGameBoard(){
        board.displayBoard();
    }

    private List<Integer> getSpotPosition( String position ){
        int row = (position.charAt(0) - '0')-1;
        int col = (position.charAt(1) - 'a');
        List<Integer> spotPositionArray = new ArrayList<>();
        spotPositionArray.add(row);
        spotPositionArray.add(col);
        return spotPositionArray;
    }


    private void processMove(Player currentPlayer, String startPosition, String endPosition){
        List<Integer> startSpotPosition = getSpotPosition(startPosition);
        List<Integer> endSpotPosition = getSpotPosition(endPosition);

        Spot startingSpot = board.getSpot(startSpotPosition.get(0), startSpotPosition.get(1));
        Spot endingSpot = board.getSpot(endSpotPosition.get(0), endSpotPosition.get(1));

        Piece currentPiece = startingSpot.getPiece();

        if( currentPiece.canMove(board, startingSpot, endingSpot) ){
            
            System.out.println("Moving from row: " + startingSpot.getRow() + " col: " + startingSpot.getCol() + " to row: "+ endingSpot.getRow() + " col: " + endingSpot.getCol());

            Move move = new Move(currentPlayer, startingSpot, endingSpot, currentPiece);

            endingSpot.setPiece(currentPiece);
            startingSpot.setPiece(null);

            gamesMoves.add(move);
            currentMovesIndex++;

        }

        board.displayBoard();
    }


    private void redo(){
        if( currentMovesIndex >= gamesMoves.size() ){
            System.out.println("Cannot do Redo Operation.......");
            currentMovesIndex = 0;
            return;
        }
        Move move = gamesMoves.get(currentMovesIndex);
        move.getStartSpot().setPiece(move.getPieceKilled());
        move.getEndSpot().setPiece(move.getPieceMoved());  
        
        currentMovesIndex++;

        board.displayBoard();
    }

    private void undo(){
        currentMovesIndex--;
        if( currentMovesIndex < 0 ){
            System.out.println("Cannot do Undo Operation.......");
            currentMovesIndex = 0;
            return;
        }
        Move move = gamesMoves.get(currentMovesIndex);

        move.getStartSpot().setPiece(move.getPieceMoved());
        move.getEndSpot().setPiece(move.getPieceKilled());  
        board.displayBoard();
    }
}