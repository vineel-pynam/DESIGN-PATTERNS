public class ChessSystem{
    private Game game;

    public ChessSystem(){
        game = new Game();
    }

    public void initializeGame(Player player1, Player player2){
        game.initialize(player1, player2);
    }

    public void displayGameBoard(){
        game.displayGameBoard();
    }

    public void startGame(){
        game.startGame();
    }

}